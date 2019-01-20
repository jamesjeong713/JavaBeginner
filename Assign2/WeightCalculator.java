// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

import java.util.Scanner;
import java.text.DecimalFormat;

public class WeightCalculator {

	private OurDate date1 = new OurDate();
	private OurDate date2 = new OurDate();

	private Scanner input = new Scanner(System.in);
	// first weight
	private double weight1;
	// second weight
	private double weight2;
	// resulting message
	private String message;
	// formatter for the numbers (if you choose to use decimal format)
	DecimalFormat form = new DecimalFormat("#0.00");

	// constructor
	public WeightCalculator() // Default constructor
	{
		weight1 = 0;
		weight2 = 0;
		message = " ";
	}

	public void getDataFromUser() // Get input from user
	{
		System.out.print("Weight trend calculator\n");
		// first
		System.out.print("\nPlease enter date 1: \n");
		date1.setYearFromUser();
		date1.setMonthFromUser();
		date1.setDayFromUser();
		date1.displayDate();
		System.out.print(" (in kilos) ");
		weight1 = input.nextDouble();
		System.out.print("\n");

		// second
		System.out.print("Please enter date 2: \n");
		date2.setYearFromUser();
		date2.setMonthFromUser();
		date2.setDayFromUser();
		date2.displayDate();
		System.out.print(" (in kilos) ");
		weight2 = input.nextDouble();
		System.out.print("\n");

	}

	public void calculateResults() // Calculate output
	{
		date1.calcDays();
		date2.calcDays();
		if (date1.calcDays() == date2.calcDays()) 
		{
			System.out.print("Error: The two dates are the same");
		} 
		else if (date1.calcDays() < date2.calcDays()) 
		{
			if (weight1 > weight2) 
			{
				message = "In " + (date2.calcDays() - date1.calcDays()) + " days you lost "
						+ form.format(weight1 - weight2) + " Kilos";
			}
			if (weight2 > weight1) 
			{
				message = "In " + (date2.calcDays() - date1.calcDays()) + " days you gained "
						+ form.format(weight2 - weight1) + " Kilos";
			}
			if (weight2 == weight1) 
			{
				message = "In " + (date2.calcDays() - date1.calcDays()) + " you have not gained or lost any weight";
			}
		} 
		else if (date1.calcDays() > date2.calcDays()) 
		{
			if (weight1 > weight2) 
			{
				message = "In " + (date1.calcDays() - date2.calcDays()) + " days you gained "
						+ form.format(weight1 - weight2) + " Kilos";
			}
			if (weight2 > weight1) 
			{
				message = "In " + (date1.calcDays() - date2.calcDays()) + " days you lost "
						+ form.format(weight2 - weight1) + " Kilos";
			}
			if (weight2 == weight1) 
			{
				message = "In " + (date1.calcDays() - date2.calcDays()) + " you have not gained or lost any weight";
			}
		}
	}

	private void calculateTrend(double diffBetWeight) // Calculate trend
	{
		double totalDays = date2.calcDays() - date1.calcDays();
		double resultWeightDay = (diffBetWeight) / totalDays;
		double resultWeightMonth = (diffBetWeight) / (totalDays / 30);
		double resultWeightYear = (diffBetWeight) / (totalDays / 360);
		if (date1.calcDays() == date2.calcDays()) 
		{
			System.out.print(" ");
		} 
		else if (diffBetWeight == 0)
		{
			System.out.print(" ");
		}
		else if (Math.abs(resultWeightDay) > 0.1) // If bigger than 0.1 kilo per day,
		{
			System.out.print("\nThat is " + form.format(resultWeightDay) + " Kilos per day");
		}
		else if (Math.abs(resultWeightDay) < 0.1) // If less than 0.1 kilo per day,
		{
			System.out.print("\nThat is " + form.format(resultWeightMonth) + " Kilos per month");
		}
		else if (Math.abs(resultWeightMonth) < 0.1) // If less than 0.1 kilo per month
		{
			System.out.print("\nThat is " + form.format(resultWeightYear) + " Kilos per year");
		}
	}

	public void displayResult() // Display the calculated message
	{
		System.out.print(message);
		calculateTrend(weight2 - weight1);
	}
}
