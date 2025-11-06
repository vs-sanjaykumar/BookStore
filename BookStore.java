import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> inventory = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public List<Book> getInventory() {
        return inventory;
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.username);
    }

    public User login(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Login successful!");
                return user;
            }
        }
        System.out.println("Login failed.");
        return null;
    }
}
