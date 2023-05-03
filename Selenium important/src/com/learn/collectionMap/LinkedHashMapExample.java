package com.learn.collectionMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String,String> hero = new LinkedHashMap<String,String>();
		hero.put("Iron Man", "Tony Stark");
		hero.put("Bat Man", "Bruce Wayne");
		hero.put("Super Man", "Clark");
		hero.put(null, "power star");
		hero.put(null, "Little super star");
		hero.put(null, null);

		System.out.println(hero);
		System.out.println("--------------------------------------------------------------------------");

		HashMap<String,String> hasmaphero=new HashMap<String,String>();
		hasmaphero.put("Iron Man", "Tony stark");
		hasmaphero.put("Bat Man", "Bruce wayne");
		hasmaphero.put("Super Man", "Clark");
		hasmaphero.put(null, "xyz");
		hasmaphero.put(null, "ABC");
		System.out.println(hasmaphero);

	}

}
