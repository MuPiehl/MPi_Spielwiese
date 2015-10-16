package de.hypoport.omc.mpi;

/**
 * Created by Matthias.Piehl on 16.10.2015.
 */
public enum CardValue {
    ZWEI("2"), DREI("3"), VIER("4"), ASS("A");

    private String valueCode;

    private CardValue(String s) {
        valueCode = s;
    }

    public String getValueCode() {
        return valueCode;
    }
}
