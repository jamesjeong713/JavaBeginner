// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

import java.util.Scanner;

public class OurDate {
	//dataType
	private int year;
	private int month;
	private int day;
	
	//userInput
	private Scanner input = new Scanner(System.in);
	
	public OurDate()  // Default constructor, Jan. 1, 2010
	{
		this(2010, 1, 1);		
	}
	public OurDate(int year, int month, int day)  // Initial constructor
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void setYearFromUser() // Get the year value from the user
	{
		//userInput first
		System.out.print("Enter a valid year: ");
		year = input.nextInt();
	} // end of years input
	public void setMonthFromUser()  // Get the month value from the user 
	{
		System.out.print("Enter the month: ");
		month = input.nextInt();	
	} // end of Month input
	public void setDayFromUser() // Get the day value from the user
	{
		System.out.print("Enter the day: ");
		day = input.nextInt();
	}// end of Days input
	public void displayDate() // Display the date in the yyyy/mm/dd format
	{
		System.out.print("Weight on " + year + "/" + month + "/" 
				+ day + "?" );
	}// end of displayDate
	// Calculate the number of days since Jan. 1, 2010
	public int calcDays()
	{
		return (year * 360) + (month * 30) + day;
	}
}
