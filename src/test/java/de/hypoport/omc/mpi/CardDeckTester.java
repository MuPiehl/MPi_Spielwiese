package de.hypoport.omc.mpi;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Matthias.Piehl on 16.10.2015.
 * <p>
 * Zum Üben von TDD
 * <p>
 * +Grobe Idee:+
 * Ich habe ein Kartendeck (zum Beispiel Pokerkarten) und mische die Karten und ziehe Karten ... etc.
 * nur spielen.
 */
@Test
public class CardDeckTester {
    public void testKartenAnschauenMischenUndZurueckLegen() {
        CardDeck cardDeck = new CardDeck(); // Frisches Kartendeck aus der Schachtel (Init)
        Card firstCard = cardDeck.lookAtFirstCard();
        Assert.assertEquals(firstCard.getShortValue(), "C2"); // zu Beginn immer C2
        Card lastCard = cardDeck.lookAtLastCard();
        Assert.assertNotEquals(lastCard.getShortValue(), "C2"); // Ein Deck sollte aus mehr Karten bestehen


        cardDeck.shuffle();
        firstCard = cardDeck.lookAtFirstCard();
        Assert.assertNotEquals(firstCard.getShortValue(), "C2"); // nach dem Mischen sollten nicht mehr die Caro 2 oben liegen
//        Assert.assertNotEquals(lastCard.getShortValue(), "C2"); // nach dem Mischen sollten nicht mehr die Caro 2 oben liegen
        // schlechter Fall für fals doch ... hmmm
    }
}
