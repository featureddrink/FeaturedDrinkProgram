package customers;

public class Customer {

    private int customerNumber;
    private String customerName;

    public Customer(int customerNumber, String customerName) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return customerName;
    }

}
