package Project;

public class Main {
    public static void main(String[] args) {

        // creating Item objects
        Item item1 = new Item("Laptop", 1200.50, 10);
        Item item2 = new Item("Smartphone", 800.00, 15);

        // creating object Customer
        Customer customer = new Customer("Asylkhan Malik", "malikasyl@gmail.com", "87000707070");

        // creating object Order and adding
        Order order = new Order(customer);
        order.addItem(item1, 1);
        order.addItem(item2, 2);

        // printing order details
        order.printOrderDetails();
    }
}
