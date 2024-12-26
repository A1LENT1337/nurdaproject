package Project;

public class Customer {

    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Constructor
    public Customer(String customerName, String customerEmail, String customerPhone) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    // getters-setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    // method for outputing
    public void printCustomerDetails() {
        System.out.println("Customer: " + customerName + ", Email: " + customerEmail + ", Phone: " + customerPhone);
    }
}