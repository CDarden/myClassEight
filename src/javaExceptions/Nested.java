package javaExceptions;

import java.util.Scanner;

public class Nested {

	public static void main(String[] args) {
		// when  if and else is inside another if and else. the inside if will only work if the outside if is true 

		System.out.println("This is division calculator");
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Give me a number");
		int a = userInput.nextInt();
		
		System.out.println("Give me the second Number");
		int b = userInput.nextInt();
		
		
		
		System.out.println("Result: " + a/b);
		
		
		
		
	}

}
