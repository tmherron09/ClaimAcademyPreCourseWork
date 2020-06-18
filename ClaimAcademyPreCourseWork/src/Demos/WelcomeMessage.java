package Demos;

public class WelcomeMessage {

	public static void main(String[] args) {
		System.out.println("Starting Welcome message");
		
		//Declare a string variable
		String name;
		
		
		//Define the variable
		name = "Shawn";
		char sign = '+';
		
		//Declare and define
		String date = "Friday, 2:12pm";
		double transactionAmount = 32.58;
		
		
		transactionAmount = 32.57;
		
		System.out.println(name);
		System.out.println(date);
		System.out.println(transactionAmount);
		
		System.out.println("Hi " + name + ", welcome back! Your last login was " +
		date + ". Your last transaction was for " + sign + "$" + transactionAmount + ".");
	}
	
}
