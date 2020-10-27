import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Deck deck = Deck.newShuffledSingleDeck();
		int firstDeal = 2;
        int numCardsToDeal = 52;
        

        
        for(int i = 0; i < 2; i++) {
        	System.out.println(deck.dealDeck());
//        	System.out.println(deck.g)
        	
        }
        

     
        Player playerOne = new Player("james", 500);
        playerOne.getPlayerBet();
        playerOne.getPlayerCards(faceDownCard, faceUpCard);
        
        
        
      
        

        
        

	}

}
