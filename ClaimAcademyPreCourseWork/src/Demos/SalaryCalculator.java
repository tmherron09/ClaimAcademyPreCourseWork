package Demos;

public class SalaryCalculator {
	public static void main(String[] args) {	
		//annual salary: hourly rate * hours in week * weeks in year
		
		double hourlyRate = 37;
		int hoursInWeek = 40;
		int weeksInYear = 52;
		int vacationWeeks = 3;
		int workingWeeks = weeksInYear - vacationWeeks;
		
		//Perform Calculation
		double annualIncome = hourlyRate * hoursInWeek * workingWeeks;
		
		//print result.
		System.out.println("$" + annualIncome);
		
	}
}
