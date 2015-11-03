package ui;

import customers.Customer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.*;

public class UserInterface extends Application {

    BorderPane layout;
    Scene mainScene;
    Stage stage;
    VBox topMenu;
    VBox leftPane;
    VBox rightPane;
    HBox sceneChooser;

    // Top Controls
    DropDownMenu dropDown;
    Button customersButton;
    Button productsButton;
    Button reportsButton;
    Button syncButton;

    // Left Controls
    LeftMenu leftMenu;
    TableView leftTable;
    Customer selectedCustomer;

    // Right Controls
    OrderTable orderTable;
    TableView rightTable;
    ComboBox rightProducts;
    Label whichCustomer;

    public UserInterface() {

    }

    public void start(Stage primaryStage) {
        stage = primaryStage;

        // Top Pane
        topMenu = new VBox();

        dropDown = new DropDownMenu();

        sceneChooser = new HBox(10);
        sceneChooser.setPadding(new Insets(10, 10, 10, 10));
        customersButton = new Button("Customers");
        customersButton.setPrefWidth(238);
        customersButton.setOnAction(e -> {
            if (!leftMenu.getSetTable().equals("customers")) {
                leftMenu.setCustomersTable();
                leftTable = leftMenu.getTableView();
            }
        });
        productsButton = new Button("Products");
        productsButton.setPrefWidth(238);
        productsButton.setOnAction(e -> {
            if (!leftMenu.getSetTable().equals("products")) {
                rightPane.setVisible(false);
                leftMenu.setProductsTable();
                leftTable = leftMenu.getTableView();
            }
        });
        reportsButton = new Button("Reports");
        reportsButton.setPrefWidth(238);
        reportsButton.setOnAction(e -> System.out.println(reportsButton.getText()));
        syncButton = new Button("Sync");
        syncButton.setPrefWidth(238);
        syncButton.setOnAction(e -> System.out.println(syncButton.getText()));
        sceneChooser.getChildren().addAll(customersButton, productsButton, reportsButton, syncButton);

        topMenu.getChildren().addAll(dropDown.getMenuBar(), sceneChooser);

        // Left Pane
        leftPane = new VBox();
        leftPane.setPadding(new Insets(0, 10, 10, 10));

        leftMenu = new LeftMenu();
        leftMenu.setCustomersTable();
        leftTable = leftMenu.getTableView();
        leftTable.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getClickCount() == 2) {
                    rightPane.setVisible(true);
                    whichCustomer.setText("Customer Order: " + leftTable.getSelectionModel().getSelectedItem());
                }
            }
        });
        leftTable.setPrefSize(318, 800);
        leftPane.getChildren().addAll(leftTable);

        // Right Pane
        rightPane = new VBox(10);
        rightPane.setVisible(false);
        rightPane.setPadding(new Insets(0, 10, 10, 0));
        whichCustomer = new Label("");
        whichCustomer.setStyle("-fx-font-weight: bold");
        orderTable = new OrderTable();
        rightTable = orderTable.getOrderTableView();
        rightPane.getChildren().addAll(whichCustomer, rightTable);

        // Main Layout
        layout = new BorderPane();
        layout.setTop(topMenu);
        layout.setLeft(leftPane);
        layout.setRight(rightPane);

        // Scene Setup
        mainScene = new Scene(layout, 1000, 800);
        stage.setScene(mainScene);
        stage.setTitle("Featured Drink");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
