package javaExceptions;

import java.util.Scanner;

public class FlagAndCounter {

	public static void main(String[] args) {
		// Counter. from 0 to 100 how many numbers are divisible by 5
		// flag is a boolean value. true or false situation
		
		System.out.println("This is division calculator");
		
		Scanner userInput = new Scanner (System.in);
		
		System.out.println("Give me a number");
		int a = userInput.nextInt();
		
		System.out.println("Give me the second Number");
		int b = userInput.nextInt();
		
		int counter =0;
		for(int i=0; i<=100; i++) {
			
			if (i%5==0) {
				counter++;
			}
		}
	
		System.out.println("total amount:"  + counter);
	}
	

}
