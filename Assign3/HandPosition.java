// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

import java.security.SecureRandom;

public class HandPosition {
	private int choice; // the chosen hand position id rock=0, paper=1,
	// scissors=2,...

	private SecureRandom rnd;	
	// rnd(randomNumbers) objects will produce secure random numbers

	public HandPosition() // default constructor
	{
		rnd = new SecureRandom();
		choice = 0;
	}

	public void randomChoice() // computer; randomly choose a hand position
	{
		choice = rnd.nextInt(5);
		//System.out.print("\n\nTEST compChoice: "+ choice + "\n");
	}

	public boolean setChoice(String userChoice) // choose a hand position by name, 
												// return true if it is a valid name
	{
		boolean choices=true;
		//a hand position by name
		if (userChoice.equals("rock"))
		{
			choice=0;
			return choices;
		}
		else if (userChoice.equals("paper"))
		{
			choice=1;
			return choices;
		}
		else if (userChoice.equals("scissors"))
		{
			choice=2;
			return choices;
		}
		else if (userChoice.equals("spock"))
		{
			choice=3;
			return choices;
		}
		else if (userChoice.equals("lizard"))
		{
			choice=4;
			return choices;
		}
		else if (userChoice.equals("quit"))
		{
			return choices;
		}
		return false;
	}

	public String choices() // return a string list of valid choices
	{
		String sameResult = "Choose one of the following: Rock, Paper, Scissors, Lizard, Spock";
		return sameResult;
		//string list is to show set of the results. for example, Tie: both choose rock.
	}

	public int compare(HandPosition userCompare) 
	// compare this hand position to another, 
	// return -1 the other wins, 1 if this one wins, 0 if they are the same
	{
		if(choice == userCompare.choice)
		{
			return 0; // they are same!
		}
		else if	((choice==0 && userCompare.choice==2) 
				|| (choice==0 && userCompare.choice==4) || 
				// set 00; rock
				(choice==1 && userCompare.choice==0) 
				|| (choice==1 && userCompare.choice==3) ||
				// set 01; paper
				(choice==2 && userCompare.choice==1) 
				|| (choice==2 && userCompare.choice==4) || 
				// set 02; scissors
				(choice==3 && userCompare.choice==0) 
				|| (choice==3 && userCompare.choice==2) ||
				// set 03; spock
				(choice==4 && userCompare.choice==3) 
				|| (choice==4 && userCompare.choice==1))
				// set 04; lizard
		{ 
			return -1; //computer win!
		}
		else
		{
			return 1; //user win!
		}
	}

	public String getName() // return the name of this hand position
	{
		if (choice==0)
		{
			return "rock";
		}
		else if (choice==1)
		{
			return "paper";
		}
		else if (choice==2)
		{
			return "scissors";
		}
		else if (choice==3)
		{
			return "spock";
		}
		else if (choice==4)
		{
			return "lizard";
		}
		return "ERROR: There's no choice.";
	}
}
