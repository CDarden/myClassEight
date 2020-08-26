package javaCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapCollection {

	public static void main(String[] args) {
		// deals with key and value pair

		//Map<key, Value> bucket name = new HashMap<key, value>();
		
		Map<Integer, String> tfClass = new HashMap<Integer, String>();
		
		tfClass.put(0,"CNS");
		tfClass.put(1, "SQL");
		tfClass.put(2, "ALM");
		tfClass.put(3, "JAVA");
		tfClass.put(4, "SDLC");
		tfClass.put(5, "ALM");
		tfClass.put(6, "DevOPs");
		tfClass.put(7, "JavaDev");
		tfClass.put(8, "GitHub");
		tfClass.put(9, "Manual");
		tfClass.put(10, "Jenkins");
		tfClass.put(11, "Smith");
		
		//To get the size or how many are in the list
		
		System.out.println(tfClass.size());
		tfClass.remove(5);
		System.out.println(tfClass.values());
		System.out.println(tfClass.get(0));
		System.out.println(tfClass.size());
		
		//to print out everything using key
		
		for(Integer item : tfClass.keySet()) {
			System.out.println(item);
		}
	
	//to print both the key and the value. Entry
	for(Entry<Integer, String> item : tfClass.entrySet()) {
	System.out.println(item);
	}
	
	}
	
}
	
	
	


