// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

import java.security.SecureRandom;


public class HandPosition {
	private int choice; // the chosen hand position id rock=0, paper=1,
	// scissors=2,...
	private String HandPositionName[] = {"rock", "paper", "scissors", 
			"glock", "spider-man", "batman", "wizard", "spock", "lizard"};

	private SecureRandom rnd;

	public HandPosition() // default constructor
	{
		rnd = new SecureRandom();
		choice = 0;
	}

	public void randomChoice() // computer; randomly choose a hand position
	{
		choice = rnd.nextInt(9);
		//System.out.print("\n\nTEST compChoice: "+ choice); 
	}

	public boolean setChoice(String userChoice) // choose a hand position by name, 
												// return true if it is a valid name
	{
		boolean choices=true;
		//a hand position by name
		for (int i=0; i<9 ; i++)
		{
			if (userChoice.equals(HandPositionName[i]))
			{
				choice=i;
				return choices;
			}
		}
		return false;
	}

	public String choices() // return a string list of valid choices
	{
		String introduction = null;
		System.out.println("Welcome to the strategy hand game");

		for (int routine = 0; routine < 8; routine+=2)
		{
			int resultChar=routine+1;
			for (int count = 0; count < 9; count++)
			{
				if (resultChar==9) //pap, sc, dog, gun, spock, liz
				{
					resultChar=0; //rock
				}
				//System.out.print(resultChar+"\n"); //for test
				System.out.print("      " + HandPositionName[resultChar] 
				+ " beats " + HandPositionName[count] + "\n");
				resultChar++;
			}
		}
		return introduction;
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
		else if((choice - userCompare.choice+9)%9%2 == 0)
		{ 
			return 1; //user win!
		}
		else
		{
			return -1; //computer win!
		}
	}

	public String getName() // return the name of this hand position
	{
		return HandPositionName[choice];
	}
}
