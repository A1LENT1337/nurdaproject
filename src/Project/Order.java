package Project;

import java.util.ArrayList;

public class Order { // Переименован в Order

    // Конструктор
    public Order(String orderName) {
        this.orderName = orderName;
        this.products = new ArrayList<>(); // Инициализация списка товаров
    }

    private final String orderName;
    private final ArrayList<Product> products;

    // Метод для добавления товара
    public void addProduct(Product product) {
        products.add(product);
    }

    // Поиск товара по названию
    public Product searchByName(String name) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null; // Если товар не найден
    }

    // Метод для отображения информации о товарах в заказе
    public void printOrderDetails() {
        System.out.println("Order: " + orderName);
        for (Product product : products) {
            product.printDetails(); // Вывод информации о каждом товаре
        }
    }
}