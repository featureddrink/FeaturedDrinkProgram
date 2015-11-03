package customers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomerDatabase {

    private List<Customer> customerList;

    public CustomerDatabase() {
        this.customerList = new ArrayList<>();
    }

    public void readCustomerFile() {
        try {
            Scanner reader = new Scanner(new File("customers.txt"));
            while (reader.hasNextLine()) {
                String[] customer = reader.nextLine().split(",");
                // For now we are leaving out Grocery Stores.
                if (customer[0].length() < 6) {
                    customerList.add(new Customer(Integer.parseInt(customer[0]), customer[1]));
                }
            }
        } catch (FileNotFoundException ex) {}
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

}
