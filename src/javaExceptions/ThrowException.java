package javaExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		
// sometimes you want to throw an error intentionally.
		//formula to throw an error
		//throw new InputMismatchException
		
		System.out.println("This is division calculator");
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Give me a number");
		int a = userInput.nextInt();
		
		System.out.println("Give me the second Number");
		int b = userInput.nextInt();
		
		if(b==0) {
			
			throw new ArithmeticException(" Can not put 0 in here");
		}
		else {
			
			System.out.println("Result: " + a/b);
		}
		
		
		
		
	}

}
