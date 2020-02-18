public class PokerGame {
	
	public static void main(String args[]) {
		Deck d = new Deck();
		d.shuffle();
		int i = 0;
		Card c = d.deal();
		while (c != null) {
			System.out.print(i+1 + ". ");
			c.printCard();
			c = d.deal();
			i++;
		}
		
	}
	
}
