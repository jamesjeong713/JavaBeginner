// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

public class Assign3 {
	public static void main(String agrs[]) 
	{
		Game myGame = new Game();
		System.out.println("Rock-Paper-Scissors-Lizard-Spock was created by Internet pioneer Sam Kass "
				+ "as an \nimprovement on the classic game Rock-Paper-Scissors. \n"
				+ "All hail Sam Kass.\n\n" 
				+ "Scissors cuts paper\n" + "paper covers rock\n" + "rock crushes lizard\n"
				+ "lizard poisons Spock\n" + "Spock smashes scissors\n" + "scissors decapitates lizard\n"
				+ "lizard eats paper\n" + "paper disproves Spock\n" + "Spock vaporizes rock\n"
				+ "(and as it always has) rock crushes scissors.");
		myGame.isDone();
		myGame.displayRoundResult();
		myGame.displayGameResult();
	}
	// Main of Assignment 3, only calls the public methods of the Game class
}
