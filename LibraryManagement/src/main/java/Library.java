import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBookToInventory(Book book) {
        books.put(book.getDetails().split(", ")[2].split(": ")[1], book);  // ISBN as key
    }

    public void removeBookFromInventory(Book book) {
        books.remove(book.getDetails().split(", ")[2].split(": ")[1]);
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void issueBook(String memberId, String ISBN) {
        Member member = members.get(memberId);
        Book book = books.get(ISBN);

        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Issue failed. Check member or book availability.");
        }
    }

    public void receiveBook(String memberId, String ISBN) {
        Member member = members.get(memberId);
        Book book = books.get(ISBN);

        if (member != null && book != null) {
            member.returnBook(book);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Return failed. Check member or book details.");
        }
    }

    public void listAllBooks() {
        books.values().forEach(book -> System.out.println(book.getDetails()));
    }
}
