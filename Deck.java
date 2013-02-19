import java.util.*;

public class Deck {
	
	private ArrayList<Card> cards;
	
	public Deck() {
		cards = new ArrayList<Card>(52);
		
		String[] suits = new String[4];
		suits[0] = "Spades";
		suits[1] = "Hearts";
		suits[2] = "Diamonds";
		suits[3] = "Clubs";
		
		int counter = 0;
		
		for (String s : suits) {
			for(int i=1; i<=13; i++) {
				cards.add(new Card(s, i));
			}
		}
	}
	
	public ArrayList<Card> topFive() {
		ArrayList<Card> temp = new ArrayList<Card>(5);
		
		for (int i=0; i<5; i++) {
			temp.add(cards.get(0));
			cards.remove(0);
		}
		
		return temp;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
}