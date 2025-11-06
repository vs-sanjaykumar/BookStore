import java.util.Date;
import java.util.List;

public class Order {
    private List<Book> books;
    private Date orderDate;
    private double totalAmount;

    public Order(List<Book> books) {
        this.books = books;
        this.orderDate = new Date();
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }

    public void displayOrder() {
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total: ₹" + totalAmount);
    }
}
