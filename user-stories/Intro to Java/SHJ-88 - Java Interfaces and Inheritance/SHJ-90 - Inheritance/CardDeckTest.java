class CardDeckTest {
	public static void main(String[] args) {
		Deck deck = new Deck();

		for(Card card : deck.getCards()) {
			String output = card.getRank() + " of " + card.getSuit();
			System.out.println(output.toLowerCase());
		}
	}
}