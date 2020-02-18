import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Card> deck;
	
	Suit suit = Suit.SPADE;
	Rank rank = Rank.ACE;
	
	public Deck() {
		deck = new ArrayList<Card>();
		for(Suit s : suit.getAll()) {
			for(Rank r : rank.getAll()) {
				Card nextCard = new Card(r, s);
				deck.add(nextCard);
			}
		}
	}
	
	public void shuffle() {
		Random rand = new Random();
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		while (deck.size() > 0) {
			int randInt = rand.nextInt(deck.size());
			Card c = deck.get(randInt);
			deck.remove(c);
			shuffledDeck.add(c);
		}
		deck = shuffledDeck;
	}
	
	public Card deal() {
		Card card = null;
		if (deck.size() >0) {
			card = deck.get(0);
			deck.remove(0);			
		}
		else {
			System.out.println("Deck is empty");
		}
		return card;
	}
	
	public ArrayList<Card> getDeck() {
		return this.deck;
	}
	
}
