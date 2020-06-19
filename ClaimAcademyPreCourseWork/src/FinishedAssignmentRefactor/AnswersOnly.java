package FinishedAssignmentRefactor;

public class AnswersOnly {

	public static void main(String[] args) {
		
		/*--------------------------------------------------------------------
		 * 
		 * Begin First Question Set
		 * 
		 * --------------------------------------------------------------------*/
		
		/*-----ClassRoom Ratios-----*/
			
		int numberOfBoys = 11;
		int numberOfGirls = 16;
		int totalStudents = numberOfBoys + numberOfGirls;
		
		/*Calculate % of girls by dividing # of girls by total students and multiplying by 100.*/
		double percentageOfGirls = ((double)numberOfGirls/totalStudents) * 100;
		
		int classroomTeachers = 1;
		int assistantTeachers = 1;
		int totalTeachers = classroomTeachers + assistantTeachers;
		
		double studentTeacherRatio = (double)totalStudents/totalTeachers;
		
		System.out.println(String.format("Result: %.3f%% of the class are girls.", percentageOfGirls));
		System.out.println(String.format("\tThe Student-Teacher ratio is %.1f.\n", studentTeacherRatio));
		
		
		/*-----Stock Purchase & CD Calculator-----*/
			
			
		double savings = 25000.00;
		double stockPrice = 989.00;
		int numberOfShares = (int)savings / (int)stockPrice;
		double remainingInvestment = savings % stockPrice;
		
		System.out.println(String.format("Result:\tBuy %d shares of stock.", numberOfShares));
		System.out.println(String.format("\tInvest $%.2f in CD account.\n",remainingInvestment));
		
		/*-----Marathon Race Time-----*/
		
		int raceTimeInSeconds = 7724;
		int secondsOneHour = 60 * 60;
		int hours = raceTimeInSeconds / secondsOneHour;
		int minutes = (raceTimeInSeconds % secondsOneHour) / 60;
		int seconds = (raceTimeInSeconds % secondsOneHour) % 60;
		
		System.out.println(String.format("Result:\t %dhrs:%dmins%dsecs", hours, minutes, seconds));
		
		/*-----Bonus Question-----*/
		
		/*Two average paces. First assumes total minutes as a decimal(double). The second an integer
		* which gives us the same answer as in the questionnaire.
		* ---Race time in in minutes recalculated with decimal precision. 128.73333 vs 128 integer.*/
		
		//Race time in minutes with floating point precision
		double raceTimeInMinutes = (double)raceTimeInSeconds / 60.0;
		double raceLengthMiles = 26.2;
		double averagePace = raceTimeInMinutes / raceLengthMiles;
		//Using Initial minutes rounded down/ Non-decimal integer.
		int raceTimeInMinutesInt = raceTimeInSeconds / 60;
		double averagePaceExpected = (double)raceTimeInMinutesInt / raceLengthMiles;
		
		//Using more precise Race Total in minutes
		System.out.println(String.format("Result:\tAverage pace: %.3f minutes per mile.", averagePace));
		System.out.println(String.format("Result:\tAverage pace: %.3f minutes per mile.\n", averagePaceExpected));
		

		/*--------------------------------------------------------------------
		 * 
		 * Begin Second Question Set
		 * 
		 * --------------------------------------------------------------------*/
		
		/*-----Positive or Negative Numbers-----*/
		
		int inputNumber = -7;
		System.out.println(String.format("Input:\t%d", inputNumber));
		
		if (inputNumber > 0) {
			System.out.println("Result:\tPositive\n");
		} else if (inputNumber < 0) {
			System.out.println("Result:\tNegative\n");
		} else {
			System.out.println("Result:\t Zero is Neither Positive or Negative\n");
		}
		
		/*-----Odd or Even-----*/
		
		inputNumber = 242;
		
		System.out.println(String.format("Input:\t%d", inputNumber));
		
		if ( inputNumber % 2 == 0) {
			System.out.println("Result:\tEven\n");
		} else if (inputNumber % 2 == 1 || inputNumber % 2 == -1) { //Under the assumption of Negative numbers being even/odd.
			System.out.println("Result:\tOdd\n");
		} else {
			System.out.println("Result:\tYou created a new type of number beyond definition.");
		}
		
		/*-----Letter Grade-----*/
		
		int inputGrade = 76;
		char letterGrade;
		
		/*See Long form for all solutions.
		*IF-ELSE-IF statements
		*Nest-IF statements
		*IF statements in waterfall pattern
		*/
		
		//Simple IF-ELSE-IF
		
		if (inputGrade <= 100 && inputGrade >= 90 ) { letterGrade = 'A';}
		else if (inputGrade <= 89 && inputGrade >= 80 ) {letterGrade = 'B';}
		else if (inputGrade <= 79 && inputGrade >= 72 ) {letterGrade = 'C';}
		else if (inputGrade <= 71 && inputGrade >= 64 ) {letterGrade = 'D';}
		else if (inputGrade <= 63 && inputGrade >= 0 ) {letterGrade = 'F';} 
		else {letterGrade = '-';}
		
		System.out.println(String.format("Input:\t%d%%", inputGrade));
		System.out.println(String.format("Result:\t%s\n", letterGrade));
		
		
		/*-----Week Day-----*/
		
		int numericDay = 5;
		String weekDay;
		
		/*Method One: Switch Statements.
		 * See Long Form Answer for more solutions.
		 * */
		
		switch(numericDay) {
			case 1:
				weekDay = "Sunday";
				break;
			case 2:
				weekDay = "Monday";
				break;
			case 3:
				weekDay = "Tuesday";
				break;
			case 4:
				weekDay = "Wednesday";
				break;
			case 5:
				weekDay = "Thursday";
				break;
			case 6:
				weekDay = "Friday";
				break;
			case 7:
				weekDay = "Saturday";
				break;
			default:
				weekDay = "INVALID";
		}
		
		System.out.println(String.format("Input:\t\t%d", numericDay));
		System.out.println(String.format("Result:\t\t%s\n", weekDay));
		if (weekDay == "INVALID") System.out.println("The input was an invalid numberic week day.\n");
		
		
		/*--------------------------------------------------------------------
		 * 
		 * Begin Third Question Set
		 * 
		 * --------------------------------------------------------------------*/
		
		/*-----Savings Calculator-----*/
			
		//Variables: Double is used because money is almost strictly floating point precision.
		 
		double presentValue = 20000;
		double interestPercentage = 4.5;
		int time = 15;
		
		double anticipatedFutureValue = savingsCalculator(presentValue, interestPercentage, time);
		
		System.out.println(String.format("Input:\n"
				+ "\tSavings Present Value:\t\t$%.2f\n"
				+ "\tInterest Percentage Rate:\t%.1f%%\n"
				+ "\tTime Period:\t\t\t%d", presentValue, interestPercentage, time));
		System.out.println(String.format("Result:\t$%.2f\n", anticipatedFutureValue ));
		
		/*-----Tip Recommender-----*/
	
		double tabAmount = 33.57;
		String serviceQuality = "Great";
		
		//Call method and assign to tip recommendation
		double recommendedTip = computeTip(tabAmount, serviceQuality);
		
		System.out.println(String.format("Tab Amount:\t%.2f\nService Quality:\"%s\"", tabAmount, serviceQuality));
		System.out.println(String.format("computeTip( %.2f, \"%s\" )", tabAmount, serviceQuality));
		System.out.println(String.format("Result:\t%f  ($%.2f because we are not bankers)\n", recommendedTip, recommendedTip));
		
		/*-----Kiosk Change Calculator-----*/
		
		double cashTendered = 18;
		double priceTotal = 17.18;
		
		//Initialize calculated change at 0
		int[] calculatedChange = {0, 0, 0, 0}; //Quarters, Dimes, Nickels, Pennies
		//alternatively: int[] calculatedChange = new int[4]; would initiate the same array, defaulted at 0.
		
		System.out.println(String.format("Price Total:\t$%.2f"
				+ "Cash Tendered:\t$%.0f", priceTotal, cashTendered));
		
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

	public static double savingsCalculator(double pv, double interestRate, int time) {
		
		double fv;
		
		double interestDecimal = interestRate / 100;
		
		fv = pv * (1 + (interestDecimal * time));
		
		return fv;
	}
	
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
