package products;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductDatabase {

    private List<Product> productList;

    public ProductDatabase() {
        this.productList = new ArrayList<>();
    }

    public void readProductFile() {
        try {
            Scanner reader = new Scanner(new File("products.txt"));
            while (reader.hasNextLine()) {
                String[] product = reader.nextLine().split(",");
                    productList.add(new Product(Integer.parseInt(product[0]), product[1]));
            }
        }
        catch (FileNotFoundException ex) {}
    }

    public List<Product> getProductList() {
        return productList;
    }

}
