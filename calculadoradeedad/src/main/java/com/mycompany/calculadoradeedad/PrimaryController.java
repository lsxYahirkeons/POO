package com.mycompany.calculadoradeedad;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Label lbl1;
    @FXML private TextArea texta;
    @FXML private TextField textf;
    
    @FXML
    private void calcular() {
        String entrada = texta.getText();
        String[] partes = entrada.split("/");
        
        int anioNacimiento = Integer.parseInt(partes[2]);
        int edad = 2026 - anioNacimiento;

        textf.setText("Tienes " + edad + " años");
    }
     @FXML
    private void limpiar() {
        texta.clear();
        textf.clear();
    }
}
