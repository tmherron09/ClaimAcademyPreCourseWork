package Demos;

public class QuestionsThreeFunctions {

	public static void main(String[] args) {
		
		/*Savings Calculator*/
		
		System.out.println("Savings Calculator");
		System.out.println("Write a function that returns the anticipated future value based on an acoount's\n"
				+ "present value, interest rate, and time. The formulae for simple future value is FV=\n"
				+ "PV * [1 + (rate x time)] (Note that rate is given in %; you will need to convert to the\n"
				+ "decimal).");
		
		/*Variables
		 * Double is used because money is almost strictly floating point precision.
		 */
		double presentValue = 20000;
		double interestPercentage = 4.5;
		int time = 15;
		
		double anticipatedFutureValue = savingsCalculator(presentValue, interestPercentage, time);
		
		System.out.println(String.format("Input:\n"
				+ "\tSavings Present Value:\t\t$%.2f\n"
				+ "\tInterest Percentage Rate:\t%.1f%%\n"
				+ "\tTime Period:\t\t\t%d\n", presentValue, interestPercentage, time));
		System.out.println(String.format("Result:\t$%.2f", anticipatedFutureValue ));
		
		System.out.println("\n----------\n");
		
		
		/* Tip Recommender */
		
		System.out.println("Tip Recommender");
		System.out.println("Write a function that returns the recommended tip based on the amount of the tab\n" 
				+ "and the service performed.\n");
		
		System.out.println("Use the following table to calculate the tip:\n\n" + 
				"Service Quality\tTip Percent\n" +
				"---------------\t-----------\n" +
				"     Poor\t   16%\n" + 
				"     Good\t   22%\n" + 
				"     Great\t   26%\n");
		
		double tabAmount = 33.57;
		String serviceQuality = "Great";
		
		//Call method and assign to tip recommendation
		double recommendedTip = computeTip(tabAmount, serviceQuality);
		
		System.out.println(String.format("Tab Amount:\t%.2f\nService Quality:\"%s\"\n", tabAmount, serviceQuality));
		System.out.println(String.format("computeTip( %.2f, \"%s\" )", tabAmount, serviceQuality));
		System.out.println(String.format("Result:\t%f  ($%.2f because we are not bankers)", recommendedTip, recommendedTip));
		
		System.out.println("\n----------\n");
		
		/*  Kiosk Change Calculator  */
		
		System.out.println("Kiosk Change Calculator");
		System.out.println("A retail store is building a kiosk to enter sales and handle transactions. When\n" 
		+ "people use cash to pay for an item, the kiosk needs to tell the cashier how much\n"
		+  "change should be given back to the customer.\n");
		
		System.out.println("You are developing a simple calculator that will compute the right amount and most\n" 
				+ "efficient denominations of change for a specific purchase.\n"); 
		
		double cashTendered = 18;
		double priceTotal = 17.18;
		
		//Initialize calculated change at 0
		int[] calculatedChange = {0, 0, 0, 0}; //Quarters, Dimes, Nickels, Pennies
		//alternatively: int[] calculatedChange = new int[4]; would initiate the same array, defaulted at 0.
		
		System.out.println(String.format("Price Total:\t$%.2f\n"
				+ "Cash Tendered:\t$%.0f\n", priceTotal, cashTendered));
		
		System.out.println(String.format("returnChange(%.0f, %.2f)", cashTendered, priceTotal));
		
		//Set calculatedChange to returnChange coin array.
		calculatedChange = returnChange(cashTendered, priceTotal);
		System.out.println(String.format("Result:\t\tQuarters: %d\n"
				+ "\t\tDimes: %d\n"
				+ "\t\tNickels: %d\n"
				+ "\t\tPennies: %d",
					calculatedChange[0],	//Quarters
					calculatedChange[1],	//Dimes
					calculatedChange[2],	//Nickels
					calculatedChange[3]));	//Pennies
		
	}
	
	/**
	 * This method returns the anticipated future value based on an account's
	 * present value, interest rate, and time. The formulae for simple future
	 * value is FV = PV * [1 + (rate * time)]
	 * **Note method takes in Interest Rate Percentage and calculates decimal.
	 * @param pv The present value of the account
	 * @param interestRate The interest rate Percentage *Input % not decimal rate.
	 * @param time The time in I assume months? Years? 
	 * @return Returns the future value of the savings account.
	 */
	public static double savingsCalculator(double pv, double interestRate, int time) {
		
		double fv;
		
		double interestDecimal = interestRate / 100;
		
		fv = pv * (1 + (interestDecimal * time));
		
		return fv;
	}
	
	/**
	 * A method that recommends a tip amount based on service quality scale provided.
	 * Poor: 16% tip
	 * Good: 22% tip
	 * Great: 26% tip
	 * @param tabAmount The total of the tab to be paid.
	 * @param serviceQuality The rating of the service quality. {Poor, Good, Great}
	 * @return The recommended amount for the tip.
	 */
	public static double computeTip(double tabAmount, String serviceQuality) {
		
		double tipAmount = 0.00;
		double tipPercentage = 0;
		
		switch(serviceQuality) {
			case "Poor":
				tipPercentage = .16;
				break;
			case "Good":
				tipPercentage = .22;
				break;
			case "Great":
				tipPercentage = .26;
				break;
			default:
				tipPercentage = .5;
				System.out.println("INVALID SERVICE QUALITY\nDefaulting to 50%\nThank you for your generosity!");
		}
		
		tipAmount = tabAmount * tipPercentage;
		
		return tipAmount;
	}

	
	/**
	 * A method to compute the coin change based on a transaction and cash tendered.
	 * @param cashTendered The cash tendered (cash amount received)
	 * @param priceTotal The price of the item/service
	 * @return An array[4] containing number of each coin to be given. [0:Quarters,1:Dimes,2:Nickels,3:Pennies]
	 */
	public static int[] returnChange(double cashTendered, double priceTotal) {
		
		double changeDue = cashTendered - priceTotal;
		
		int quarters = (int)(changeDue / .25);
		int dimes = (int)((changeDue - (quarters * .25)) / .1);
		int nickels = (int) ((changeDue - (quarters * .25) - (dimes * .1)) / .05);
		int pennies = (int) ((changeDue - (quarters * .25) - (dimes * .1) - (nickels * .05)) / .01);
		
		int[] changeArray = {quarters, dimes, nickels, pennies};
		
		return changeArray;
	}
	
	
}
