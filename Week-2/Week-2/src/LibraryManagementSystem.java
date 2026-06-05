import java.util.ArrayList;

class Book {
    private int bookId;
    private String title;
    private boolean issued;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}

abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    abstract void displayRole();
}

class Stud extends User {

    public Stud(String name) {
        super(name);
    }

    @Override
    void displayRole() {
        System.out.println(name + " is a Student.");
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added: " + book.getTitle());
    }

    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && !book.isIssued()) {
                book.setIssued(true);
                System.out.println("Book Borrowed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book Not Available.");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId && book.isIssued()) {
                book.setIssued(false);
                System.out.println("Book Returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("Invalid Return Request.");
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(101, "Java Programming");
        Book book2 = new Book(102, "Data Structures");

        library.addBook(book1);
        library.addBook(book2);

        Stud student = new Stud("Muzahid");
        student.displayRole();

        library.borrowBook(101);
        library.returnBook(101);
    }
}