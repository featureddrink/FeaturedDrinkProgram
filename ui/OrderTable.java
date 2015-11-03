package ui;

import customers.Customer;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import products.Product;
import javafx.scene.control.TableView;
import products.ProductDatabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderTable {

    TableView<Product> orderTableView;
    Customer customer;

    public OrderTable() {
        orderTableView = new TableView<>();
        this.customer = customer;
    }

    public TableView<Product> getOrderTableView() {

        // Product Number
        TableColumn<Product, Integer> productNumberColumn = new TableColumn<>("Product Number");
        productNumberColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("productNumber"));

        // Product Name
        TableColumn<Product, String> productNameColumn = new TableColumn<>("Product Name");
        productNameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("productName"));

        orderTableView.setPrefWidth(650);
        orderTableView.getColumns().addAll(productNumberColumn, productNameColumn);

        return orderTableView;
    }

}
