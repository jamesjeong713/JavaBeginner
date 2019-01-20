// Name: Seongyeop Jeong 
// Lab section	: 303 
// Lab teacher	: Michel Cyr bakinde

public class Assign2 {
	
	public static void main(String[] args)
	{

		WeightCalculator myCalc = new WeightCalculator();
		//OurDate myDate = new OurDate();
		//int dataTotal = myDate.calcDays();

		myCalc.getDataFromUser();
		myCalc.calculateResults();
		myCalc.displayResult();
	}
}
