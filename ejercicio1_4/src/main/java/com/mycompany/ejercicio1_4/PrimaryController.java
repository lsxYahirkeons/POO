package com.mycompany.ejercicio1_4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private Label lbl1;
    @FXML private TextField txtNumero;
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private TextArea texta;
    @FXML
    private void calcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        String resultado = "";

        for (int i = 1; i <= 10; i++) {
            resultado += numero + " x " + i + " = " + (numero * i) + "\n";
        }

        texta.setText(resultado);
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        texta.clear();
    }
}