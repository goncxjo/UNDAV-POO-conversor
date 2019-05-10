package model;

public class Conversor {
    private final double FACTOR_MULTIPLICADOR = 1.609344;

    public double convertirKilometros(double millas) {
        return millas * FACTOR_MULTIPLICADOR;
    }
}
