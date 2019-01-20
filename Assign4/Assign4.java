// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

public class Assign4 {
	public static void main(String agrs[]) 
	{
		Game myGame = new Game();
		HandPosition myHand = new HandPosition();
		
		myHand.choices();
		myGame.isDone();
		myGame.displayRoundResult();
		myGame.displayGameResult();
	}
	// Main of Assignment 3, only calls the public methods of the Game class
}
