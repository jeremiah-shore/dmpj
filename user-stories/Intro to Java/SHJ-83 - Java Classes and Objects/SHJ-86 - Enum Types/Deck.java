import java.util.*;

class Deck {

	private List<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		for(Suit suit : Suit.values())
			for(Rank rank : Rank.values()) 
				cards.add(new Card(suit, rank));
	}

	public List<Card> getCards() {
		return cards;
	}

}