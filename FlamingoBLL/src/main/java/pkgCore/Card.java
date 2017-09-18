package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private eSuit eSuit;
	private eRank eRank;
	
	
	public Card(eSuit eSuit, eRank eRank) {
	
		seteSuit(eSuit);
		seteRank(eRank);
		
	}

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

}


	public eSuit geteSuit() {
		return eSuit;
	}


	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}


	public eRank geteRank() {
		return eRank;
	}


	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}
	
}
