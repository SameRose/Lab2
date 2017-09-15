package pkgCore;

import java.util.ArrayList;
import pkgEnum.*;

public class Deck {

	public ArrayList<Card> cardsInDeck;
	
	
	public Deck(int decksNumber) {
		cardsInDeck = new ArrayList<Card>();
		for(int x = 0; x<decksNumber; x++) {
			for (eSuit eSuit : eSuit.values()) {

				for (eRank eRank : eRank.values()) {
					
					if(eRank != eRank.ONE) {
						
						Card c = new Card(eSuit, eRank);
						cardsInDeck.add(c);}
					
				}
				
			}
			
		}

		
		
	}

	// TODO: Add a contructor that passes in the number of decks, and then populates
	// ArrayList<Card> with cards (depending on number of decks).

	// Example: Deck(1) will build one 52-card deck. There are 52 different cards
	// 2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc

	// Deck(2) will create an array of 104 cards.

	// TODO: Add a draw() method that will take a card from the deck and
	// return it to the caller
	
	public Card Draw() {
		
		return cardsInDeck.remove(0);
		
		
	}
	
	
	
	
}
