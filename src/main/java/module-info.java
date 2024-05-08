module com.retailsuite.possystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.retailsuite.possystem to javafx.fxml;
    exports com.retailsuite.possystem;
}