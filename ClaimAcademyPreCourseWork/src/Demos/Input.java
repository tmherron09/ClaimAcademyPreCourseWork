package Demos;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		//Create the scanner
		Scanner in = new Scanner(System.in);
		
		//prompt the user to enter information
		System.out.print("Enter your name: ");
		String name = in.next();
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		System.out.println("Hello " + name + ". You are " + age + " years old.");
	}

}
