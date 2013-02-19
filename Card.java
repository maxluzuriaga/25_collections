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
		return value + " of " + suit;
	}
	
}