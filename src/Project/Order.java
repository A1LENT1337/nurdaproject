package Project;

import java.util.ArrayList;

public class Order {

    private Customer customer;
    private ArrayList<Item> items;

    // constructor
    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    // method to adding item for order
    public void addItem(Item item, int quantity) {
        if (item.getItemQuantity() >= quantity) {
            item.setItemQuantity(item.getItemQuantity() - quantity);
            items.add(new Item(item.getItemName(), item.getItemPrice(), quantity));
        } else {
            System.out.println("Not enough stock for item: " + item.getItemName());
        }
    }

    // method for outputing order details
    public void printOrderDetails() {
        System.out.println("Order Details:");
        customer.printCustomerDetails();
        for (Item item : items) {
            item.printItemDetails();
        }
    }
}
