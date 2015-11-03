package products;

public class Product {

    private int productNumber;
    private String productName;

    public Product(int productNumber, String productName) {
        this.productNumber = productNumber;
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }
}
