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
		
		
		
		
	}

}

