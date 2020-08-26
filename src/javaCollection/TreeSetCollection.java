package javaCollection;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		
			Set<String> tfClass = new TreeSet<String>();
			
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
			// creating an object type Array will help us get specific items or values
		Object[] myValueArray = tfClass.toArray();
		System.out.println(myValueArray[3]);
		}
	}


