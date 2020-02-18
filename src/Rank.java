public enum Rank {
	
	TWO("2", 2),
	THREE("3", 3),
	FOUR("4", 4),
	FIVE("5", 5),
	SIX("6", 6),
	SEVEN("7", 7), 
	EIGHT("8", 8),
	NINE("9", 9),
	TEN("10", 10),
	JACK("Jack", 11), 
	QUEEN("Queen", 12), 
	KING("King", 13), 
	ACE("Ace", 14);
	
	private String name;
	private int value;
	
	private Rank(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}
	
	public Rank[] getAll() {
		Rank[] output = {Rank.ACE, Rank.TWO, Rank.THREE, Rank.FOUR, Rank.FIVE, Rank.SIX, Rank.SEVEN, 
						 Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING};
		return output;
	}
	
}
