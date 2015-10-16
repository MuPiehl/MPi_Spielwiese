package de.hypoport.omc.mpi;

/**
 * Created by Matthias.Piehl on 16.10.2015.
 */
public enum CardColor {
    KARO("C"), HERZ("H"), PIK("P"), KREUZ("K");

    private String colorCode;

    private CardColor(String s) {
        colorCode = s;
    }

    public String getColorCode() {
        return colorCode;
    }
}
