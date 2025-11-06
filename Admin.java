import java.util.List;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    public void addBook(List<Book> inventory, Book book) {
        inventory.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(List<Book> inventory, String isbn) {
        inventory.removeIf(book -> book.getIsbn().equals(isbn));
        System.out.println("Book removed with ISBN: " + isbn);
    }
}
