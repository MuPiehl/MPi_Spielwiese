package de.hypoport.omc.mpi;

/**
 * Created by Matthias.Piehl on 16.10.2015.
 */
public class Card {

    private CardColor cardColor;
    private CardValue cardValue;

    public Card(String shortValue) {
        if(shortValue.length() != 2)
            throw new RuntimeException("Kartenwert nicht erlaubt" + shortValue);

cardColor = CardColor.valueOf("KARO");// geht nicht und Unnötig Schleife SpäterCardColor.valueOf("C"); //shortValue.substring(0,0));
        //CardColor.valueOf(, )
        cardValue = CardValue.valueOf("ZWEI");

    }

    public Card(CardColor cardColor, CardValue cardValue) {
        this.cardColor = cardColor;
        this.cardValue = cardValue;
    }

    public String getShortValue() {
        return cardColor.getColorCode() + cardValue.getValueCode();
    }

//    public void setShortValue(String shortValue) {
//        this.shortValue = shortValue;
//    }
}
