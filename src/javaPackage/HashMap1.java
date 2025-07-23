package javaPackage;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		//syntax Hashmap
		 HashMap<Integer, String> hm = new HashMap<Integer, String>();
		 hm.put(1, "Jan");
		 hm.put(2, "Feb");
		 hm.put(3, "March");
		 System.out.println(hm.get(3));
		 System.out.println(hm.get(1));
		 System.out.println(hm.get(2)); 
		
	     //a HashMap that the key and value are both String
		 HashMap<String, String> myMap = new HashMap<>();
		 //adding an item to hash map:
		 myMap.put("101", "Ali");
		 myMap.put("102", "Bahar");
		 //Access to a value by using Key:   myMap.get("101")
		 System.out.println("  " +myMap.get("102"));
		 //printing the whole HashMap
		 System.out.println("  " +myMap);
	}
}
