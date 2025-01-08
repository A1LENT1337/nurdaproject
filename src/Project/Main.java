package Project; // Добавлено объявление пакета

import Project.Customer;
import Project.Order;
import Project.Product;

public class Main {
    public static void main(String[] args) {
        // Создание объектов Product
        Product product1 = new Product("Smartphone", "Brand A", 699.99, "Electronics");
        Product product2 = new Product("Laptop", "Brand B", 1299.99, "Computers");
        Product product3 = new Product("Headphones", "Brand C", 199.99, "Audio");

        // Создание объекта Order
        Order order = new Order("My Order");

        // Добавление товаров в заказ
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        // Вывод информации о товарах в заказе
        order.printOrderDetails();

        // Поиск товара по названию
        Product foundProduct = order.searchByName("Laptop");
        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct.toString());
        } else {
            System.out.println("Product not found");
        }
    }
}