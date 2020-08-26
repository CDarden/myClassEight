package javaExceptions;

import java.util.Scanner;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		
	//try catch block - this helps to catch an error or mistake and tells the system what to do
		
		try {
			System.out.println("This is division calculator");
				
				Scanner userInput = new Scanner (System.in);
				
				System.out.println("Give me a number");
				int a = userInput.nextInt();
				
				System.out.println("Give me the second Number");
				int b = userInput.nextInt();
				
				System.out.println("Result: " + a/b);
				
			
	}
		//using the word Exception will catch any error. you do not have to be specific.
		catch(Exception e) {
			// use printstacktrace below to print the above statement
			//e.printStackTrace();
			System.out.println("Try running again, 2nd input is a zero. a number cannot be divided by zero");
		}
		
		finally {
			System.out.println("Finally block");
			
		}
	}
}