package ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.stage.Window;

public class TopMenu {

    private GridPane gridPane;
    private MenuBar dropDown;
    private HBox choiceMenu;

    protected GridPane display() {
        gridPane = new GridPane();
        //dropDown = DropDownMenu.getMenuBar();
        choiceMenu = new HBox(10);
        choiceMenu.setPadding(new Insets(10, 10, 10, 10));

        Button customerButton = new Button("Customers");
        Button productsButton = new Button("Products");
        Button reportsButton = new Button("Reports");
        Button syncButton = new Button("Sync");

        customerButton.setPrefWidth(238);
        productsButton.setPrefWidth(238);
        reportsButton.setPrefWidth(238);
        syncButton.setPrefWidth(238);

        choiceMenu.getChildren().addAll(customerButton, productsButton, reportsButton, syncButton);

        gridPane.setConstraints(dropDown, 0, 0);
        gridPane.setConstraints(choiceMenu, 0, 1);

        gridPane.getChildren().addAll(dropDown, choiceMenu);
        return gridPane;
    }

}
