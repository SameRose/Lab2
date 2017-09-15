package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		Deck d = new Deck(2);
		int test1 = d.cardsInDeck.size();
		Deck dos = new Deck(6);
		int test2 = dos.cardsInDeck.size();
		
		assertEquals(test1, 104);
		
		assertEquals(test2, 312);
		
		
		
		//	TODO: Build a deck(1), make sure there are 52 cards in the deck
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck 
	}

}

