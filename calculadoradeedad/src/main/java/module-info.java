module com.mycompany.calculadoradeedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.calculadoradeedad to javafx.fxml;
    exports com.mycompany.calculadoradeedad;
}
