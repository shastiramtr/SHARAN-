package com.learn.collectionMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	
	public static void main(String[] args) {
	
		//Duplicated key value overwrite -important 
		HashMap<Integer,String> empolyeeMap=new HashMap<Integer,String>();
		//To insert an element PUT method is used
		empolyeeMap.put(1, "Shasti");
		empolyeeMap.put(2, "ram");
		empolyeeMap.put(3, "ruban");
		empolyeeMap.put(4, "pradho");
		empolyeeMap.put(5, "hindu");
		empolyeeMap.put(6, "sasi");
		System.out.println("empolyee Map:"+empolyeeMap);
		System.out.println("----------------------------------");
		
		//To make a copy of the existing map.
		Map<Integer,String> DuplicateMap=new HashMap<Integer,String>();
		DuplicateMap.putAll(empolyeeMap);
		System.out.println("Duplicate Map:"+ DuplicateMap);
		 
		//clear to delete the map contents
		DuplicateMap.clear();
		System.out.println("After clearing:"+DuplicateMap);
		
		//To check if a key is present or not in the Map
		System.out.println("Does this map has key 1?"+empolyeeMap.containsKey(1));
		
		//To check if a value is present or not 
		System.out.println("Does this maphas value ram?"+empolyeeMap.containsValue("ram"));
		
		//Clone the Map
		System.out.println("Cloned Map"+empolyeeMap.clone());
		
		//Check if the Map is Empty or not
		System.out.println("Is Empty?"+DuplicateMap.isEmpty());
		
		//Fetch the set of keys in the Map (Note: Here it's not List of keys, it's set of keys )
		//Because List will allow duplicate but Set won't  keys should be unique.
		System.out.println("key set "+empolyeeMap.keySet());
		
		//Fetch a value
		System.out.println(empolyeeMap.get(1));
		
		//Fetch all the values
		System.out.println("All vaalues"+empolyeeMap.values());
		
		//Entry Set
		System.out.println(empolyeeMap.entrySet());
		
		
		
		
		
		

	}

}
