package com.mycompany.mavenproject2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtDinero;
    @FXML private Button btnLimpiar;
    @FXML private Button btnDesglosar;
    @FXML private TextArea txtaDenominaciones;
    @FXML private TextArea txtaCantidades;

    @FXML
    private void desglosar() {
        int dinero = Integer.parseInt(txtDinero.getText());
        int[] valores = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        String textoCantidades = "";

        for (int i = 0; i < valores.length; i++) {
            int cantidad = dinero / valores[i];
            dinero = dinero % valores[i];
            textoCantidades += cantidad + "\n";
        }

        txtaCantidades.setText(textoCantidades);
    }

    @FXML
    private void limpiar() {
        txtDinero.clear();
        txtaCantidades.clear();
    }
}
