public class Librarian extends Person {
    private String employeeId;

    public Librarian(String name, String employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void addBook(Book book, Library library) {
        library.addBookToInventory(book);
    }

    public void removeBook(Book book, Library library) {
        library.removeBookFromInventory(book);
    }

    @Override
    public String getDetails() {
        return "Librarian Name: " + getName() + ", Employee ID: " + employeeId;
    }
}
