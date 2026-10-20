package com.mycompany.ejercicio1_3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private Button btnAnalizar;
    @FXML private Button btnLimpiar;
    @FXML private TextField txtCantidadCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    @FXML private TextArea txtaDivisores;

    @FXML
    private void analizar() {
        String texto = txtNumero.getText();
        int numero = Integer.parseInt(texto);

        txtCantidadCifras.setText(String.valueOf(texto.length()));

        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int cifraMayor = 0;
        int cifraMenor = 9;

        for (int i = 0; i < texto.length(); i++) {
            int digito = Character.getNumericValue(texto.charAt(i));

            sumaTotal += digito;

            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }
            if (digito > cifraMayor) {
                cifraMayor = digito;
            }
            if (digito < cifraMenor) {
                cifraMenor = digito;
            }
        }

        txtSumaImpares.setText(String.valueOf(sumaImpares));
        txtSumaPares.setText(String.valueOf(sumaPares));
        txtSumaTotal.setText(String.valueOf(sumaTotal));
        txtCifraMayor.setText(String.valueOf(cifraMayor));
        txtCifraMenor.setText(String.valueOf(cifraMenor));

        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + "\n";
            }
        }

        txtaDivisores.setText(divisores);
    }

    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtCantidadCifras.clear();
        txtSumaImpares.clear();
        txtSumaPares.clear();
        txtSumaTotal.clear();
        txtCifraMayor.clear();
        txtCifraMenor.clear();
        txtaDivisores.clear();
    }
}