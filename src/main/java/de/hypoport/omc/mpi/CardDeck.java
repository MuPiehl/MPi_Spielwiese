package de.hypoport.omc.mpi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Matthias.Piehl on 16.10.2015.
 */
public class CardDeck {
    private List<Card> cards;

//    List<String> list = ["A", "B", "C"];

    public CardDeck() {
        cards = new ArrayList<Card>();
        init();
    }

    private void init() {
        cards.add(new Card("C2")); // zunächst fest später über Set oder so?


    }

    public Card lookAtFirstCard() {
        return cards.get(0);
    }

    public Card lookAtLastCard() {
        return cards.get(cards.size() - 1);
    }

    public void shuffle() { // MPi-Todo dummy...
        cards.clear();
        cards.add(new Card(CardColor.HERZ, CardValue.DREI));
    }
}
