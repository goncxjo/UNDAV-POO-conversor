package controller;

import model.Conversor;

public class ConversorController {

    private final Conversor modelo;

    public ConversorController (Conversor conversor) {
        modelo = conversor;
    }

    public void seClickeoElBotonConvertir(String millas) {
        modelo.convertirKilometros(Double.parseDouble(millas));
    }
}
