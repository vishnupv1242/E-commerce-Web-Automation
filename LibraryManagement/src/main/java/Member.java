import java.util.ArrayList;
import java.util.List;

public class Member extends Person {
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        super(name);
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrowBook();
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }

    public List<Book> listBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public String getDetails() {
        return "Member Name: " + getName() + ", Member ID: " + memberId;
    }
}
