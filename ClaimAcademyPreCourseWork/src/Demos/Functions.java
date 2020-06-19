package Demos;

/**
 * Should be named Methods, most/standard terminology is to use Method not
 * Function when talking about Java.
 * @author Tim Herron
 *
 */
public class Functions {

	public static void main(String[] args) {
		//Call the Method
		sayHi();
		printName("Tim", "Herron");
		
		//Call the combine name method.
		String fullName = combineName("Tim", "Herron");
		
		System.out.println(fullName);
		
	}
	
	//Define sayHi()
	public static void sayHi() {
		System.out.println("Hi!");
	}
	
	//Define a method that prints your name.
	public static void printName(String firstName, String lastName) {
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		
	}
	
	public static String combineName(String firstName, String lastName) {
		String combineName = firstName + " " + lastName;
		return combineName;
	}

}
