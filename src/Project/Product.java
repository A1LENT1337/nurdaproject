package Project;

import java.util.Objects;

public class Product extends Item {

    // Конструктор
    public Product(String productName, String brand, double price, String category) {
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    private String productName; // Название товара
    private String brand;       // Бренд товара
    private double price;       // Цена товара
    private String category;    // Категория товара

    // Геттеры и сеттеры
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Переопределение метода printDetails()
    @Override
    public void printDetails() {
        System.out.println("Product: " + productName + ", Brand: " + brand + ", Price: $" + price + ", Category: " + category);
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Product: " + productName + ", Brand: " + brand + ", Price: $" + price + ", Category: " + category;
    }

    // Переопределение equals() и hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productName.equals(product.productName) && brand.equals(product.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, brand);
    }
}