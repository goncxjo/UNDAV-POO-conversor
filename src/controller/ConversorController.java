package controller;

import model.Conversor;

import javax.swing.*;

public class ConversorController {

    private final Conversor modelo;

    public ConversorController (Conversor conversor) {
        modelo = conversor;
    }

    public void seClickeoElBotonConvertir(String millas, JLabel salida) {
        double kilometros = modelo.convertirKilometros(Double.parseDouble(millas));
        salida.setText(kilometros + " kilometros");
    }
}
