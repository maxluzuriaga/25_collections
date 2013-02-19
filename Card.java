public class Card {
	
	private String suit;
	private int value;
	
	public Card(String s, int v) {
		suit = s;
		value = v;
	}
	
	public String suit() {
		return suit;
	}
	
	public int value() {
		return value;
	}
	
	public String toString() {
		if (value == 1) {
			return "Ace of " + suit;
		} else if (value == 11) {
			return "Jack of " + suit;
		} else if (value == 12) {
			return "Queen of " + suit;
		} else if (value == 13) {
			return "King of " + suit;
		} else {
			return value + " of " + suit;
		}
	}
	
}