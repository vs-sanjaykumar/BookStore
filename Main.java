import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();
        Scanner scanner = new Scanner(System.in);

        // Sample admin and books
        Admin admin = new Admin("admin", "admin123");
        store.registerUser(admin);
        admin.addBook(store.getInventory(), new Book("Java Basics", "John Doe", 499.0, "ISBN001"));

        System.out.println("Welcome to the Book Store!");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = store.login(username, password);
        if (user != null) {
            user.viewBooks(store.getInventory());
            Cart cart = new Cart();
            cart.addBook(store.getInventory().get(0));
            Order order = new Order(cart.getItems());
            user.placeOrder(order);
            order.displayOrder();
        }
    }
}
