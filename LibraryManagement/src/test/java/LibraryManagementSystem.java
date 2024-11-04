public class LibraryManagementSystem {


    public static void main(String[] args) {
        Library library = new Library();

        // Create Books
        Book book1 = new Book("Java Basics", "John Doe", "ISBN001", 3);
        Book book2 = new Book("Advanced Java", "Jane Smith", "ISBN002", 2);

        // Librarian adding books to the library
        Librarian librarian = new Librarian("Alice", "EMP123");
        librarian.addBook(book1, library);
        librarian.addBook(book2, library);

        // Register Member
        Member member = new Member("Bob", "MEM001");
        library.registerMember(member);

        // List all books
        library.listAllBooks();

        // Member borrows a book
        library.issueBook("MEM001", "ISBN001");

        // List all books after borrowing
        library.listAllBooks();

        // Member returns a book
        library.receiveBook("MEM001", "ISBN001");

        // List all books after returning
        library.listAllBooks();
    }
}
