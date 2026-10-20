package com.mycompany.ejercicio3_1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private Label lbl1;
    @FXML private Label lbl2;
    @FXML private TextField txtContador;
    @FXML private Button btnContar;
    @FXML private ProgressBar progressBar;
    @FXML private Button btnEsperar;

    private int clics = 0;

    @FXML
    private void contar() {
        clics++;
        txtContador.setText(String.valueOf(clics));
    }

    @FXML
    private void esperar() {
        btnEsperar.setDisable(true);
        progressBar.setProgress(0);

        Thread hilo = new Thread(() -> {
            int pasos = 100;
            int tiempoTotalMs = 10000;
            int tiempoPaso = tiempoTotalMs / pasos;

            for (int i = 1; i <= pasos; i++) {
                try {
                    Thread.sleep(tiempoPaso);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                final double progreso = (double) i / pasos;

                Platform.runLater(() -> {
                    progressBar.setProgress(progreso);
                });
            }

            Platform.runLater(() -> {
                btnEsperar.setDisable(false);
            });
        });

        hilo.start();
    }
}