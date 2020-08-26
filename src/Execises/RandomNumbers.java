package Execises;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class RandomNumbers {

	public static void main(String[] args) {
	
		// How to get a Random numbers
		
		System.out.println(getRandomNumberInRange(100,999));
	
		System.out.println(getRandomNumberInRange(100,999));
	
		System.out.println(getRandomNumberInRange(100,999));
		
	// to get the 500 random numbers use for loop or use set if you do not want duplicates
		Set<Integer>randomValue = new LinkedHashSet<Integer>();
		
		//for(int i=0; i<500; i++) {
			//System.out.println(getRandomNumberInRange(100,999));
			//to print the random numbers with no duplicates
			//randomValue.add(getRandomNumberInRange(100,999));
		//}
		
		//to make sure it prints 500 numbers use while
		
		while(randomValue.size()!=500);{
		randomValue.add(getRandomNumberInRange(100,999));
		}
		
		
		System.out.println(randomValue);
		System.out.println(randomValue.size());
		
	}
	

	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}