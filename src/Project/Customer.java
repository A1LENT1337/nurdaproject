package Project;

import java.util.Objects;

public class Customer { // Переименован в Customer

    // Конструктор
    public Customer(String customerName, String email, String phone) {
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    private String customerName; // Имя клиента
    private String email;        // Email клиента
    private String phone;        // Номер телефона клиента

    // Геттеры и сеттеры
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Customer: " + customerName + ", Email: " + email + ", Phone: " + phone;
    }

    // Переопределение equals() и hashCode()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return customerName.equals(customer.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName);
    }
}