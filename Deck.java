public class Deck {
	
	private Card[] cards;
	
	public Deck() {
		cards = new Card[52];
		
		String[] suits = new String[4];
		suits[0] = "Spades";
		suits[1] = "Hearts";
		suits[2] = "Diamonds";
		suits[3] = "Clubs";
		
		int counter = 0;
		
		for (String s : suits) {
			for(int i=1; i<=13; i++) {
				cards[counter] = new Card(s, i);
				counter++;
			}
		}
		
		System.out.println(cards);
	}
	
}