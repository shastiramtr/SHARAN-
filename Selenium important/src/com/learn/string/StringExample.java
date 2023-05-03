package com.learn.string;

public class StringExample {

	public static void main(String[] args) {
		// Here We will see list of string method and string concepts

		String name="shastiram";// string literal
		int number =3;

		//return character value for the particular index
		System.out.println(name.charAt(1));

		//return string length
		System.out.println(name.length());

		//checks the equality of string with the given object.
		System.out.println(name.equals("shasti"));

		//checks the equality of string with the given string object without case sensitivity
		System.out.println(name.equalsIgnoreCase("SHASTIRAM"));

		// checks if string is empty or not.
		System.out.println(name.isEmpty());

		// returns true or false based on the given value is present or not.
		System.out.println(name.contains("a"));

		//take a particular portion of the string begin index
		System.out.println(name.substring(1));

		//take a particular portion of the string begin and end index
		System.out.println(name.substring(1, 3));
		
		//appends the string to the given string 
		System.out.println(name.concat("shastiram"));
		
		// replaces the existing char with given char 
		System.out.println(name.replace("m", "n"));
		System.out.println(name.replace("shasti", "ruban"));
		
		//find the position of a character in the string
		System.out.println(name.indexOf("s"));
		
		// finds the character specified from the index position
		System.out.println(name.indexOf("r",6));
		
		//finds the character specified from the index position
		System.out.println(name.indexOf("s",2));
		System.out.println(name.indexOf("shas",1));
		
		//Trim will remove the white spaces before and after
		System.out.println(name.trim());
		
		// convert the given data type to string
		System.out.println(String.valueOf(number));
		
		// string uppercase to lowercase 
		String uppercase ="Shastiruban";
		System.out.println(uppercase.toLowerCase());
		
		//String lower case to upper case 
		String lowercase="shastiruban";
		System.out.println(lowercase.toUpperCase());
		
		//Return a joined string with given delimiter
		System.out.println(String.join("-","Learn","Java"));
		System.out.println(String.join("-", "06","07"));
		
		//split 
		String splitthis= "am,i,teaching,good";
		String[] splittedword=splitthis.split(",");
		// foreach loop
		for (String string:splittedword) {
			System.out.println(string);
		}
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
