package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.*;

public class Deck {

	public ArrayList<Card> cardsInDeck;

	public Deck(int decksNumber) {
		cardsInDeck = new ArrayList<Card>();
		for (int x = 0; x < decksNumber; x++) {
			for (eSuit eSuit : eSuit.values()) {
				for (eRank eRank : eRank.values()) {
					cardsInDeck.add(new Card(eSuit, eRank));
				}
			}
		}

		Collections.shuffle(cardsInDeck);

	}

	public Card Draw() {

		return cardsInDeck.remove(0);

	}

}
