package Demos;

public class TestArea {

	public static void main(String[] args) {
		
		/*
		int numA = 30;
		int numB = 20;
		char letter = '-';
		
		if (numA > numB) letter = 'A';
		if (numB > numA) letter = 'B';
		
		System.out.println("Number " + letter + " is larger."); 
		
		int inputGrade = 92;
		char letterGrade;
		
		letterGrade = LetterGradeIfElseIf(inputGrade);
		
		QuestionsTwoConditionalLogic.letterGradePrint(inputGrade, letterGrade);
		
		*/
		
		double cash = 18;
		double price = 17.18;
		double changeDue = cash - price;
		
		int quarters = (int)(changeDue / .25);
		int dimes = (int)((changeDue - (quarters * .25)) / .1);
		int nickels = (int) ((changeDue - (quarters * .25) - (dimes * .1)) / .05);
		int pennies = (int) ((changeDue - (quarters * .25) - (dimes * .1) - (nickels * .05)) / .01);
		
		
		System.out.println(quarters);
		System.out.println(dimes);
		System.out.println(nickels);
		System.out.println(pennies);
		
		
	}
	
	
	public static char LetterGradeIfElseIf(int inputGrade) {
		char letterGrade;
		
		if (inputGrade <= 100 && inputGrade >= 90 ) { letterGrade = 'A';}
		else if (inputGrade <= 89 && inputGrade >= 80 ) {letterGrade = 'B';}
		else if (inputGrade <= 79 && inputGrade >= 72 ) {letterGrade = 'C';}
		else if (inputGrade <= 71 && inputGrade >= 64 ) {letterGrade = 'D';}
		else if (inputGrade <= 63 && inputGrade >= 0 ) {letterGrade = 'F';} 
		else {letterGrade = '-';}
		
		return letterGrade;
	}

}
