package Demos;

public class FloorInstallationEstimator {

	public static void main(String[] args) {

		//Variables
		int squareFeet = 2000;
		String floorType = "Carpet";
		
		//Call method
		double Quote = getQuote(squareFeet, floorType);
		
		System.out.println("Your Quote is: $" + Quote);

	}
	
	//Define the quote Method
	private static double getQuote(int squareFeet, String floorType) {
		System.out.println("----------"); //Decoration
		System.out.println("Quote Method");
		System.out.println("SQUARE FEET: " + squareFeet);
		System.out.println("FLOOR TYPE: " + floorType);
		
		//define the variables
		double baseRate = 3;
		double carpetRate = 0.5;
		double hardwoodRate = 1.5;
		double hardwoodHardwareFee = 100;
		double totalRate = 0;
		double totalCost = 0;
		
		
		//Determine floor type and rate
		if (floorType == "Carpet") {
			totalRate = baseRate + carpetRate;
		} else if (floorType == "Hardwood") {
			totalRate = baseRate + hardwoodRate;
			totalCost = totalCost + hardwoodHardwareFee;
		} else {
			System.out.println("Error: Could not read floor type.");
			
		}
		
		
		//Calculate the total Cost
		System.out.println("Total Rate: " + totalRate);
		totalCost += (totalRate * squareFeet);
		System.out.println("Total Cost: $" + totalCost);
		
	
		//Apply any appropriate discounts
		if (squareFeet >= 1500) {
			double discount = totalCost * .1;
			totalCost -= discount;
			System.out.println("DISCOUNT: $" + discount);
		}
		
		System.out.println("Total Cost: $" + totalCost + "");
		System.out.println("----------\n"); //Decoration
		
		//Add return statement
		return totalCost;
		
	}
	
	

}
