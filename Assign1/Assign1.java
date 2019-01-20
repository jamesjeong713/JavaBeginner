// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

//import Java Utility as Scanner to use the class 
import java.util.Scanner;
public class Assign1 //start class 'Assign1'
{
	//declare valuable as integer before the program start
	private int userInput; //declare integer to store valuable of input from user
	private int num100Lbs;
	private int num50Lbs;
	private int num20Lbs;
	private int num10Lbs;
	private int num5Lbs;
	private int num1Lbs;
	//main method begins.
	public static void main(String agr[])
	{
		Assign1 myArithMetic=new Assign1(); //creates an Assign1 object and assign it to variable myArithMetic 
		System.out.print("Life needs a balance\nHow many pounds does the item weight? "); //show text to lead user to input the values.
		myArithMetic.userInput(); 
		myArithMetic.calculations();
		myArithMetic.caclulationResult();
	}//end method main
	public void userInput()	//get values from user by using scanner
	{
		Scanner input = new Scanner(System.in); //create scanner object to get values from input.
		userInput = input.nextInt(); //read number from users
	}
	public void caclulationResult()	// show outputs for the results of calculation 
	{
		System.out.println("You need 6 weights in total:");	//display text before it explain pounds.
		System.out.println(num100Lbs + "	100 lbs"); //100 lbs 
		System.out.println(num50Lbs + "	50 lbs"); //50 lbs
		System.out.println(num20Lbs + "	20 lbs"); //20 lbs
		System.out.println(num10Lbs + "	10 lbs"); //10 lbs
		System.out.println(num5Lbs + "	 5 lbs"); // 5 lbs
		System.out.println(num1Lbs + "	 1 lbs"); // 1 lbs
	}
	public void calculations() //calculations as public void
	{ 
		num100Lbs=userInput/100;
		num50Lbs=(userInput%100)/50;
		num20Lbs=((userInput%100)%50)/20;
		num10Lbs=(((userInput%100)%50)%20)/10;
		num5Lbs=((((userInput%100)%50)%20)%10)/5;
		num1Lbs=(((((userInput%100)%50)%20)%10)%5)/1;
	}
} //end class Assign1