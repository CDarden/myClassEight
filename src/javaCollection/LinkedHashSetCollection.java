package javaCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCollection {

	public static void main(String[] args) {
		Set<String> tfClass = new LinkedHashSet<String>();
		
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
		
		tfClass.remove("Manual");
	
		
		//to print out everything use for each formula
		
		for(String item : tfClass) {
			
			System.out.println(item);
		}
	}

}
