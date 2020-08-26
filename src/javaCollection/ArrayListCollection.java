package javaCollection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		//Array:1. you can do an array by knowing the values
		String[] Students = {"Tom", "Tim", "Jane"};
		
		// 2. by knowing the number of values
		String[] names = new String[5];
		
		//when you don't know the values and how many you have.
		
		// ArrayList: a list is a type of array that does not have limitation. it is dynamic in size.
		// There are 2 types  ArrayList and linkedtype; 
		//formula for ArrayList is
		//List<ObjectDatatype> identifier = new TypeOfList<ObjectDataType>();
		
		//List<Integer> al = new ArrayList<Integer>();
		
		//List<Character> al3 = new ArrayList<Character>();
		
		//ArrayList<Integer> al4 = new ArrayList<Integer>();
		
		List<String> tfClass = new ArrayList<String>();
			tfClass.add("CNS");
			tfClass.add("SQL");
			tfClass.add("ALM");
			tfClass.add("JAVA");
			tfClass.add("SDLC");
			tfClass.add("ALM");
			tfClass.add("DevOPs");
			tfClass.add("JavaDev");
			tfClass.add("GitHub");
			tfClass.add("Manual");
			tfClass.add("Jenkins");
			
			//To get the size or how many are in the list
			System.out.println(tfClass.size());
			
			tfClass.remove(2);
			
			System.out.println(tfClass.get(2));
			//to print out everything use for each formula
			
			for(String item : tfClass) {
				
				System.out.println(item);
			}
	
	}

}
