

public class Player {
	private String name;
	private int playerBalance;
	boolean wonHand;
	int playerBet = 50;
	private Card faceUp;
	private Card faceDown;

	
	public Player(String name, int playerBalance) {
		this.name = name;
		this.playerBalance = playerBalance;
		this.faceUp = faceUp;
		this.faceDown = faceDown;
		
	}
	
	public String getName() {
		return name;
	}
	
	public Card getFaceUp() {
		return faceUp;
	}
	
	public Card getFaceDown() {
		return faceDown;
	}
	
	public void getPlayerCards(Card faceDownCard, Card faceUpCard) {
		faceDownCard = faceDown;
		faceUpCard = faceUp;
	}
	
	

	
	
	private int playerBet() {
		playerBet = 50;
		if(wonHand == true) {
			playerBalance += playerBet;
		} else {
			playerBalance -= playerBet;
		}
		
		return playerBalance;
				
	}
	
	public int getPlayerBet() {
		System.out.println("player bet: " + playerBet);
		return playerBet;
	}
	
	
	
	
	
	
	

}
