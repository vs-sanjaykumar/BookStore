import java.util.ArrayList;
import java.util.List;

public class User {
    protected String username;
    protected String password;
    protected List<Order> orders = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void viewBooks(List<Book> inventory) {
        for (Book book : inventory) {
            book.displayBook();
        }
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed successfully!");
    }
}
