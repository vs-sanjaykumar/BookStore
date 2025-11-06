import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Book> items = new ArrayList<>();

    public void addBook(Book book) {
        items.add(book);
        System.out.println(book.getTitle() + " added to cart.");
    }

    public List<Book> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }
}
