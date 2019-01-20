// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

import java.util.Scanner;

public class Game {
	// class containing the rules for any game 
	// based on Rock-Paper-Scissors (e.g. rock-paper-scissors-lizard-Spock)
	private int computerWins; // number of round won by computer
	private int userWins; // number of round won by user
	private boolean userQuits; // Did the user quit?
	
	private HandPosition computer = new HandPosition();
	private HandPosition user = new HandPosition();// current hand position of user

	private Scanner input = new Scanner(System.in); // global scanner
	
	public Game() // default constructor
	{
		computerWins=0;
		userWins=0;
		userQuits=false;
	}
	public boolean isDone() // is the game done?
	{
		userQuits = false;
		return userQuits;
	}
	public void makeChoice() // computer player makes a random choice
	{
		computer.randomChoice();
		computer.getName();
	}
	public void getChoiceFromUser() // User player makes a choice
	{
		System.out.print("\nWhat is your choice? ");
		String userInput = input.next();
		userInput = userInput.toLowerCase();
		user.setChoice(userInput);
		while (userInput.equals("quit"))
		{
			userQuits = true;
			break;
		}
		//exception routine
		while (user.setChoice(userInput) == false)
		{
			System.out.print(user.choices());
			System.out.print("\nWhat is your choice? ");
			userInput = input.next();
			userInput = userInput.toLowerCase();
			user.setChoice(userInput);
			
			while (userInput.equals("quit"))
			{
				userQuits = true;
				break;
			}
		}
	}
	public void displayRoundResult() // display result of the two choices for this round
	{
		while (userWins < 5 && computerWins < 5 && userQuits == false)
		{
			makeChoice(); // computer random choices
			getChoiceFromUser(); // userInputs	
			
			if (computer.compare(user)==0 && userQuits == false)
			{
				System.out.println("Tie: both choose " + computer.getName());
			}
			else if (computer.compare(user)==-1 && userQuits == false)
			{
				System.out.println("You loss: " + computer.getName() 
				+ " beats " + user.getName());
				computerWins++; //counting of wins
			}
			else if (computer.compare(user)==1 && userQuits == false)
			{
				System.out.println("You win: " + user.getName() 
				+ " beats " + computer.getName());
				userWins++; //counting of wins
			}		
		}
	}
	public void displayGameResult() // display the results of the entire game
	{
		if (computerWins < userWins)
		{
			System.out.println("\nYou win the game, " + userWins + " to " + computerWins);
		}
		else if (computerWins > userWins)
		{
			System.out.println("\nYou lose the game, " + computerWins + " to " + userWins);
		}
		else if (computerWins == userWins)
		{
			System.out.println("\nIt is a tie game, " + userWins + " all");
		}
	}
}
