package Demos;

public class Numbers {

	public static void main(String[] args) {
		int numa = 5;
		int numb = 6;
		int numberOfElements = 2;
		
		
		int sum = numa + numb;
		//System.out.println(sum);
		
		//Divide
		System.out.println(sum/numberOfElements);
		
		//Solution 1: modify our divisor.
		System.out.println(sum/2.0);
		
		//Solution 2: Cast to a double
		//double average = (numa + numb) / 2;
		double average = ((double)(numa + numb))/ numberOfElements;
		
		System.out.println(average);
	}

}
