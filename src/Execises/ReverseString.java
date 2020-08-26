package Execises;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	//Ask the user to give you a word
	//Palindrome: a word is palindrome if it reads the same way when reading backward such as mom, dad, eve
		Scanner userInput = new Scanner(System.in);
		System.out.print("Give me a word");
		
		String userData = userInput.next();
	//how to breakdown a string into individual characters(use tocharArray) or charAT using index numbers
		char[] allCharacters= userData.toCharArray();
	// any time you want to combine things. if dealing with a string create an empty string
		
		String finalOutput = "";
		
		for(int i=allCharacters.length-1; i>=0; i--) {
			finalOutput= finalOutput + allCharacters[i];
			
			
		}
		System.out.println(finalOutput);
		
		
		if(userData.equalsIgnoreCase(finalOutput)) {
			
			System.out.println("Palindrome");
		}
		else {
				System.out.println("Not Palindrome");
			
			
		}
		
		
		
	}

}
