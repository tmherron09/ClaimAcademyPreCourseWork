package Demos;

/**
 * A class representing the Second set of Questions for the Claim Academy
 * Pre-Course Work material. The console output is set to mimic the Questions PDF.
 * @author 		Tim Herron
 * @version		1.0
 * @since		1.0
 */
public class QuestionsTwoConditionalLogic {

	public static void main(String[] args) {
		
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
		System.out.println("Method Two: Nest-IF statements");
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
		
	}
	
	
	/*
	 * Methods
	 */
	
	
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
	
}
