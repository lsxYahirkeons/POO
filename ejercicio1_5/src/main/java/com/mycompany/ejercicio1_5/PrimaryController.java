package com.mycompany.ejercicio1_5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private Label lbl1;
    @FXML private Label lbl2;
    @FXML private Label lbl3;
    @FXML private Label lbl4;
    @FXML private Label lbl5;
    @FXML private Label lbl6;
    @FXML private Label lbl7;
    @FXML private Label lbl8;
    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotal;
    @FXML private TextField txtGastoAlto;
    @FXML private Button btn1;
    @FXML private Button btn2;

    @FXML
    private void calcular() {
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());

        int total = alimentacion + refrigerios + transporte + telefonia + otros;
        txtTotal.setText(String.valueOf(total));

        int mayor = alimentacion;
        String conceptoMayor = "Alimentación";

        if (refrigerios > mayor) {
            mayor = refrigerios;
            conceptoMayor = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            conceptoMayor = "Transporte";
        }
        if (telefonia > mayor) {
            mayor = telefonia;
            conceptoMayor = "Telefonía";
        }
        if (otros > mayor) {
            mayor = otros;
            conceptoMayor = "Otros";
        }

        txtGastoAlto.setText(conceptoMayor);
    }

    @FXML
    private void limpiar() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtGastoAlto.clear();
    }
}