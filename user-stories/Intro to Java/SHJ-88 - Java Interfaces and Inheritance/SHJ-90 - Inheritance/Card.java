class Card {

	private final Suit suit;
	private final Rank rank;

	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	Suit getSuit() {
		return suit;
	}

	Rank getRank() {
		return rank;
	}

	@Override
	public String toString() {
		String output = rank + "\tof\t" + suit;
		return output.toLowerCase();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Card) {
			Card card = (Card) obj;
			return rank.equals(card.getRank()) && suit.equals(card.getSuit());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return suit.hashCode() + rank.hashCode();
	}

}