package ui;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;

public class DropDownMenu {

    MenuBar menuBar;

    public DropDownMenu() {

        // Exit Menu
        Menu exitMenu = new Menu("Exit");
        MenuItem exitMenuQuit = new MenuItem("Quit");
        exitMenuQuit.setOnAction(e -> Platform.exit());
        exitMenu.getItems().add(exitMenuQuit);

        // Products Menu
        Menu productsMenu = new Menu("Products");
        MenuItem showSalesProducts = new MenuItem("Show Sales");
        MenuItem showRecordProducts = new MenuItem("Show Record");
        MenuItem inventory = new MenuItem("Inventory");
        productsMenu.getItems().addAll(
                showSalesProducts,
                showRecordProducts,
                inventory
        );

        // Customers Menu
        Menu customersMenu = new Menu("Customers");
        MenuItem showSalesCustomers = new MenuItem("Show Sales");
        MenuItem showRecordCustomers = new MenuItem("Show Record");
        MenuItem orderSheet = new MenuItem("Order Sheet");
        MenuItem orderEntry = new MenuItem("Order Entry");
        MenuItem showAR = new MenuItem("Show A/R");
        MenuItem showInvoices = new MenuItem("Show Invoices");
        MenuItem showOrderHistory = new MenuItem("Show Order History");
        customersMenu.getItems().addAll(
                showSalesCustomers,
                showRecordCustomers,
                orderSheet,
                orderEntry,
                showAR,
                showInvoices,
                showOrderHistory
        );

        // Suppliers Menu
        Menu suppliersMenu = new Menu("Suppliers");
        MenuItem showSalesSuppliers = new MenuItem("Show Sales");
        MenuItem showRecordSuppliers = new MenuItem("Show Record");
        suppliersMenu.getItems().addAll(
                showSalesSuppliers,
                showRecordSuppliers
        );

        // Brand Code Menu
        Menu brandCodeMenu = new Menu("BrandCode");
        MenuItem showSalesBrandCode = new MenuItem("Show Sales");
        brandCodeMenu.getItems().add(showSalesBrandCode);

        // Group Code Menu
        Menu groupCodeMenu = new Menu("GroupCode");
        MenuItem showSalesGroupCode = new MenuItem("Show Sales");
        groupCodeMenu.getItems().add(showSalesGroupCode);

        // Salesman Menu
        Menu salesmanMenu = new Menu("Salesman");
        MenuItem showSalesSalesMan = new MenuItem("Show Sales");
        salesmanMenu.getItems().add(showSalesSalesMan);

        // Company Menu
        Menu companyMenu = new Menu("Company");
        MenuItem showSalesCompany = new MenuItem("Show Sales");
        MenuItem showOrdersCompany = new MenuItem("Show Orders");
        MenuItem showOrderConfirmation = new MenuItem("Show Order Confirmation");
        MenuItem showOrderConfirmationAll = new MenuItem("Show Order Confirmation ALL");
        MenuItem showPODate = new MenuItem("Show PO Date");
        MenuItem showTodaysInvoices = new MenuItem("Show Today's Invoices");
        MenuItem showTodaysOrders = new MenuItem("Show Today's Orders");
        companyMenu.getItems().addAll(
                showSalesCompany,
                showOrdersCompany,
                showOrderConfirmation,
                showOrderConfirmationAll,
                showPODate,
                showTodaysInvoices,
                showTodaysOrders
        );

        // Reports Menu
        Menu reportsMenu = new Menu("Reports");
        MenuItem reports = new MenuItem("Show Reports");
        reportsMenu.getItems().add(reports);

        // Utilities Menu
        Menu utilitiesMenu = new Menu("Utilities");
        MenuItem setParameters = new MenuItem("Set Parameters");
        MenuItem queryReports = new MenuItem("Query And Reports");
        MenuItem upgrade = new MenuItem("Upgrade to New Version");
        MenuItem importData = new MenuItem("Import Data");
        MenuItem sendEmail = new MenuItem("Send E-Mail");
        MenuItem compactDatabase = new MenuItem("Compact Databases");
        MenuItem purgeOrderHistory = new MenuItem("Purge Order History");
        MenuItem createCustomerComments = new MenuItem("Create Customer Comments");
        utilitiesMenu.getItems().addAll(
                setParameters,
                queryReports,
                upgrade,
                importData,
                sendEmail,
                compactDatabase,
                purgeOrderHistory,
                createCustomerComments
        );

        // About Menu
        Menu aboutMenu = new Menu("About");
        MenuItem about = new MenuItem("About Featured Drink");
        MenuItem showForms = new MenuItem("Show Forms");
        aboutMenu.getItems().addAll(
                about,
                showForms
        );

        menuBar = new MenuBar();
        menuBar.getMenus().addAll(
                exitMenu,
                productsMenu,
                customersMenu,
                suppliersMenu,
                brandCodeMenu,
                groupCodeMenu,
                salesmanMenu,
                companyMenu,
                reportsMenu,
                utilitiesMenu,
                aboutMenu
        );
    }

    public MenuBar getMenuBar() {
        return menuBar;
    }

}
