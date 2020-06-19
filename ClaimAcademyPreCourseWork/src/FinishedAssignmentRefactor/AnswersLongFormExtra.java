package FinishedAssignmentRefactor;

public class AnswersLongFormExtra {

	
	public static void main(String[] args) {
		
		/*--------------------------------------------------------------------
		 * 
		 * Begin First Question Set
		 * 
		 * --------------------------------------------------------------------*/	
		
		System.out.println("Pre-Course Questions - 1 - Variables\n");
		
		/*-----Classroom Ratios-----*/
		
		System.out.println("Classroom Ratios");
		System.out.println("There are 11 boys and 16 girls in a class with one teacher and a teacher’s assistant.\n"
				+ "What percent of the students are girls? What is the student-teacher ratio?\n\n");
		int numberOfBoys = 11;
		int numberOfGirls = 16;
		int totalStudents = numberOfBoys + numberOfGirls;
		
		/*Calculate % of girls by dividing # of girls by total students and multiplying by 100.*/
		double percentageOfGirls = ((double)numberOfGirls/totalStudents) * 100;
		
		int classroomTeachers = 1;
		int assistantTeachers = 1;
		int totalTeachers = classroomTeachers + assistantTeachers;
		
		double studentTeacherRatio = (double)totalStudents/totalTeachers;
		
		//System.out.println("Result: " + percentageOfGirls + "% of the class are girls.");
		/*Using String.format and double %% escape. */
		System.out.println(String.format("Result: %.3f%% of the class are girls.", percentageOfGirls));
		
		//System.out.println("\tThe Student-Teacher ratio is " + studentTeacherRatio + ".");
		/*
		 *Self-note: Ending with %. does not work. %.1f. doesn't account for everything.
		 *Can String.format handle precision, or must dispose of prior.
		 */
		System.out.println(String.format("\tThe Student-Teacher ratio is %.1f.", studentTeacherRatio));
		
		System.out.println("\n----------\n"); //Decoration
		
		/*-----Stock Purchase & CD Calculator-----*/
		
		System.out.println("Stock Purchaser & CD Calculator");
		System.out.println("You are feeling lucky with a stock and want to go all in! You have $25,000 in savings\n"
				+ "and want to invest all your money to buy a stock, and the remaining money in a CD\n"
				+ "account. The stock price is $989 per share. How many shares of this stock can you\n"
				+ "buy, and how much money will be left for the CD account?\n");
		
		double savings = 25000.00;
		double stockPrice = 989.00;
		int numberOfShares = (int)savings / (int)stockPrice;
		double remainingInvestment = savings % stockPrice;
		
		System.out.println(String.format("Result:Buy %d shares of stock.", numberOfShares));
		System.out.println(String.format("\tInvest $%.2f in CD account. ",remainingInvestment));
		
		System.out.println("\n----------\n");
		
		/*-----Marathon Race Time-----*/
		
		System.out.println("Marathon Race Time");
		System.out.println("In 2016, Kenyan runner Eliud Kipchoge won the Olympic gold medal in the men’s\n"
				+ "26.2-mile marathon race. The official timer tracked his race at 7724 seconds. What\n"
				+ "is his time in hours, minutes, and seconds?\n");
		
		int raceTimeInSeconds = 7724;
		int secondsOneHour = 60 * 60;
		int hours = raceTimeInSeconds / secondsOneHour;
		int minutes = (raceTimeInSeconds % secondsOneHour) / 60;
		int seconds = (raceTimeInSeconds % secondsOneHour) % 60;
		
		System.out.println(String.format("Result:\t %dhrs:%dmins%dsecs", hours, minutes, seconds));
		
		System.out.println("\n----------\n");
		System.out.println("Bonus: What was his average pace per mile in minutes?\n");
		System.out.println("***Two average paces. First assumes total minutes as a decimal(double). The second an integer\n"
				+ "\twhich gives us the same answer as in the questionaire.\n");
		
		
		//Race time in in minutes recalculated with decimal precision. 128.73333 vs 128 integer.
		double raceTimeInMinutes = (double)raceTimeInSeconds / 60.0;
		double raceLengthMiles = 26.2;
		double averagePace = raceTimeInMinutes / raceLengthMiles;
		//Using Initial minutes rounded down/ Non-decimal.
		int raceTimeInMinutesInt = raceTimeInSeconds / 60;
		double averagePaceExpected = (double)raceTimeInMinutesInt / raceLengthMiles;
		
		//Using more precise Race Total in minutes
		System.out.println(String.format("Result:\tAverage pace: %.3f minutes per mile.", averagePace));
		System.out.println(String.format("Result:\tAverage pace: %.3f minutes per mile.", averagePaceExpected));
		
		
		/*--------------------------------------------------------------------
		 * 
		 * Begin Second Question Set
		 * 
		 * --------------------------------------------------------------------*/	
			
		System.out.println("Pre-Course Questions - 2 - Conditional Logic\n");
		
		/*Positive or Negative Numbers*/
		System.out.println("Positive or Negative Number");
		System.out.println("Write an IF statement to determine if a number is positve or negative.\n");
		
		int inputNumber = -7;
		
		System.out.println(String.format("Input:\t%d", inputNumber));
		
		if (inputNumber > 0) {
			System.out.println("Result:\tPositive");
		} else if (inputNumber < 0) {
			System.out.println("Result:\tNegative");
		} else {
			System.out.println("Result:\t Zero is Neither Positive or Negative");
		}
		
		System.out.println("\n----------\n");
		
		/*Odd or Even*/
		
		System.out.println("Even or Odd Number");
		System.out.println("Write an IF statement to determine if a number is even or odd.\n");
		
		inputNumber = 242;
		
		System.out.println(String.format("Input:\t%d", inputNumber));
		
		if ( inputNumber % 2 == 0) {
			System.out.println("Result:\tEven");
		} else if (inputNumber % 2 == 1 || inputNumber % 2 == -1) { //Under the assumption of Negative numbers being even/odd.
			System.out.println("Result:\tOdd");
		} else {
			System.out.println("Result:\tYou created a new type of number beyond definition.");
		}
		
		System.out.println("\n----------\n");
		
		
		/*Letter Grade*/
		
		System.out.println("Letter Grade");
		System.out.println("Convert a number grade to a letter grade. Use the following scale:\n"
				+ "A\t90 - 100%\n"
				+ "B\t80 - 89%\n"
				+ "C\t72 - 79%\n"
				+ "D\t64 - 71%\n"
				+ "F\t0 - 71%\n"
				+ "Make a provision for an invalid number grade.\n");
		
		int inputGrade = 76;
		char letterGrade;
		
		/* char used to reduce memory footprint and to return '-' if no input
		 * or invalid numeric grade as it is left unassigned.
		 * Not Necessary, just experimenting vs String.*/
		
		/*Method One: IF-ELSE-IF statements*/
		System.out.println("Method One: IF-ELSE-IF statements");
		letterGrade = letterGradeIfElseIf(inputGrade);
		letterGradePrint(inputGrade, letterGrade);		
		
		System.out.println("----------");
		
		/*Method Two: Nest-IF statements*/
		System.out.println("Method Two: Nest-IF statements");
		letterGrade = letterGradeNested(inputGrade);
		letterGradePrint(inputGrade, letterGrade);
		
		/*Method Three: IF statements (Similar logic to Nested, Waterfalled)*/
		System.out.println("Method Three: Waterfall IF statements");
		letterGrade = letterGradeIF(inputGrade);
		letterGradePrint(inputGrade, letterGrade);	
		
		/* Uncomment to see Deprecated Documentation
		 * letterGradeIfElseIfPrint(54);
		 */
		
		System.out.println("\n\n----------\n");
		
		/*Week Day*/
		System.out.println("Week Day");
		System.out.println("Conver a numeric day of the week to the weekday, with first day of the week\n"
				+ "being Sunday.");
		System.out.println("Make a provision for an invalid weekday number.\n");
		
		int numericDay = 5;
		String weekDay;
		
		/*Method One: Switch Statements.*/
		
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
		System.out.println(String.format("Result:\t\t%s", weekDay));
		if (weekDay == "INVALID") System.out.println("The input was an invalid numberic week day.");
		
		System.out.println("----------");
		
		/*Method Two: Enum value at Index.
		 *--Enum declared after Methods below--
		 * */
		
		if (numericDay >= 1 && numericDay <= 7) {
			System.out.println(String.format("Input:\t\t%d", numericDay));
			System.out.println(String.format("Result:\t\t%s", WeekDay.values()[numericDay - 1]));
		} else {
			weekDay = "INVALID";
			System.out.println(String.format("Input:\t\t%d", numericDay));
			System.out.println(String.format("Result:\t\t%s", weekDay));
			System.out.println("The input was an invalid numberic week day.");
		}
		
		System.out.println("----------");
		/* Method Three: Enum Value Set
		 * 
		 * */
		if (numericDay >= 1 && numericDay <= 7) {
			WeekDay dayOfWeek = WeekDay.values()[numericDay-1];
			System.out.println(String.format("Input:\t\t%d", numericDay));
			System.out.println(String.format("Result:\t\t%s", dayOfWeek));
		} else {
			weekDay = "INVALID";
			System.out.println(String.format("Input:\t\t%d", numericDay));
			System.out.println(String.format("Result:\t\t%s", weekDay));
			System.out.println("The input was an invalid numberic week day.");
		}
			
			
			
		/*--------------------------------------------------------------------
		 * 
		 * Begin Third Question Set
		 * 
		 * --------------------------------------------------------------------*/		
		
		System.out.println("Pre-Course Questions - 3 - Functions\n");
			
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
	
	/* ----------------------------------------
	 * Methods/Enums are divided by Question Section
	 *-----------------------------------------*/
	
	/*--------------------------------------------------------------------
	 * 
	 * Begin Second Method Set
	 * Longer due to exploring Java Doc Comments
	 * 
	 * --------------------------------------------------------------------*/	
	
	/**
	 * This method takes in the calculated Letter Grade and Grade Percentage
	 * It creates a printout Similar to the Questionnaire PDF.
	 * @param inputGrade The grade percent we are testing.
	 * @param letterGrade The Grade calculated by a conditional method call.
	 */
	public static void letterGradePrint(int inputGrade, char letterGrade) {
		//If invalid Numeric
		if (letterGrade == '-') {System.out.println("The corresponding input is INVALID. Please check you work.");}
		
		System.out.println(String.format("Input:\t\t%d%%", inputGrade));
		System.out.println(String.format("Result:\t\t%s", letterGrade));
	
	}
	
	/**
	 * This method takes in the given Grade Percent and calculates the letter grade
	 * using an IF-ELSE-IF statement.
	 * @param inputGrade The grade percent we are testing.
	 * @return Returns the Letter grade earned. *Returns '-' if invalid Grade Percent input.
	 */
	public static char letterGradeIfElseIf(int inputGrade) {
		char letterGrade;
		
		/*Set the value of letterGrade once.*/
		if (inputGrade <= 100 && inputGrade >= 90 ) { letterGrade = 'A';}
		else if (inputGrade <= 89 && inputGrade >= 80 ) {letterGrade = 'B';}
		else if (inputGrade <= 79 && inputGrade >= 72 ) {letterGrade = 'C';}
		else if (inputGrade <= 71 && inputGrade >= 64 ) {letterGrade = 'D';}
		else if (inputGrade <= 63 && inputGrade >= 0 ) {letterGrade = 'F';} 
		else {letterGrade = '-';}
		
		return letterGrade;
	}
	
	/**
	 * This method takes in the given Grade Percent and calculates the letter grade
	 * using Nested-IF statements.
	 * @param inputGrade The grade percent we are testing.
	 * @return Returns the Letter grade earned. *Returns '-' if invalid Grade Percent input.
	 */
	public static char letterGradeNested(int inputGrade) {
		
		//Set default Letter Grade to '-' for invalid numeric values above 100.
		char letterGrade = '-';
		
		/*Set letterGrade and check next lower bounds. Repeat until found.*/
		if (inputGrade <= 100) {
			letterGrade = 'A';
			
			if (inputGrade <= 89) {
				letterGrade = 'B';
				
				if (inputGrade <= 79) {
					letterGrade = 'C';
					
					if (inputGrade <= 63) {
						letterGrade = 'F';
						
						if (inputGrade < 0) {
							letterGrade = '-';
						}
					}
				}
			}
		}
		return letterGrade;
	}
	
	
	/**
	 * This method takes in the given Grade Percent and calculates the letter grade
	 * using waterfall IF statements.
	 * @param inputGrade The grade percent we are testing.
	 * @return Returns the Letter grade earned. *Returns '-' if invalid Grade Percent input.
	 */
	public static char letterGradeIF(int inputGrade) {
		
		//Set default Letter Grade to '-' for invalid numeric values above 100.
		char letterGrade = '-';
		
		/*This Example does not set letterGrade once, but changes it as it passes each condition*/
		if (inputGrade <= 100) letterGrade = 'A';
			
		if (inputGrade <= 89) letterGrade = 'B';
				
		if (inputGrade <= 79) letterGrade = 'C';
					
		if (inputGrade <= 63) letterGrade = 'F';
						
		if (inputGrade < 0) letterGrade = '-';

		return letterGrade;
		
	}
	
	
	/**
	 * Former Method used to both Calculate Letter Grade and call the Print method.
	 * @deprecated Now use LetterGradePrint after each method call.
	 * @see #letterGradeIfElseIf(int)
	 * @see #letterGradePrint(int, char)
	 * @param inputGrade The grade percent we are testing.
	 */
	public static void letterGradeIfElseIfPrint(int inputGrade) {
		char letterGrade;
		
		if (inputGrade <= 100 && inputGrade >= 90 ) {
			letterGrade = 'A';
			letterGradePrint(inputGrade, letterGrade);
		} else if (inputGrade <= 89 && inputGrade >= 80 ) {
			letterGrade = 'B';
			letterGradePrint(inputGrade, letterGrade);
		} else if (inputGrade <= 79 && inputGrade >= 72 ) {
			letterGrade = 'C';
			letterGradePrint(inputGrade, letterGrade);
		} else if (inputGrade <= 71 && inputGrade >= 64 ) {
			letterGrade = 'D';
			letterGradePrint(inputGrade, letterGrade);
		} else if (inputGrade <= 63 && inputGrade >= 0 ) {
			letterGrade = 'F';
			letterGradePrint(inputGrade, letterGrade);
		} else {
			letterGrade = '-';
			System.out.println("The corresponding input is INVALID. Please check you work.");
			letterGradePrint(inputGrade, letterGrade);
		}
	}
	
	/*-----Enum-----*/
	
	enum WeekDay {
		Sunday,
		Monday,
		Tuesday,
		Wednesday,
		Thursday,
		Friday,
		Saturday
	}
	
	/*--------------------------------------------------------------------
	 * 
	 * Begin Third Method Set
	 * 
	 * --------------------------------------------------------------------*/	
	
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
