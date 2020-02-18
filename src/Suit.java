import java.awt.Color;

public enum Suit {
	
	//♠ ♣ ♦ ♥
	
	SPADE("Spades", Color.BLACK), 
	CLUB("Clubs", Color.BLACK), 
	DIAMOND("Diamonds", Color.RED), 
	HEART ("Hearts", Color.RED);
	
	private String name;
	private Color color;
	
	private Suit(String name, Color color) {
		this.name = name;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public Suit[] getAll() {
		Suit[] output = {Suit.SPADE, Suit.CLUB, Suit.DIAMOND, Suit.HEART};
		return output;
	}
	
}
