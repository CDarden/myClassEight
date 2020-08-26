package javaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

	public static void main(String[] args) {
		List<String> tfClass = new LinkedList<String>();
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


