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

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		for(Card card : cards)
			output.append(card.toString() + "\n");
		return output.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Deck))
			return false;

		Deck otherDeck = (Deck) obj;
		List<Card> otherCards = otherDeck.getCards();
		
		if(cards.size() != otherCards.size()) 
			return false;
		
		for(Card card : cards)
			if(!otherCards.contains(card))
				return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = 0;
		for (Card card : cards)
			result += card.hashCode();
		return result;
	}

}