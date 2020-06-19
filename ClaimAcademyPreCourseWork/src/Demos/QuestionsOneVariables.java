package Demos;

/**
 * A class representing the First set of Questions for the Claim Academy
 * Pre-Course Work material. The console output is set to mimic the Questions PDF.
 * @author 		Tim Herron
 * @version		1.0
 * @since		1.0
 */
public class QuestionsOneVariables {
	
	public static void main(String[] args) {
		
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
		
	}

}
