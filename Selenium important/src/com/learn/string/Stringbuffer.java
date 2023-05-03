package com.learn.string;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String is immutaable");
		String name="shasti";
		System.out.println("Appending a name to orginal:"+name.concat("ram"));
		System.out.println("Orginal name:"+name);
		System.out.println("----------------------------");

		System.out.println("Stringbuffer is Mutable");
		StringBuffer name1=new StringBuffer("shasti");
		System.out.println("Appending a name to orginal :"+name1.append("ram"));
		System.out.println("orginal name :"+name1);


		//String Buffer Methods //string Builder Method(Non - Synchronised )
		//Reverse
		System.out.println("Reversed name:"+name1.reverse());
		//Replace
		StringBuffer replacethis=new StringBuffer("shasti");
		System.out.println(replacethis.replace(0, 6, "ram"));
		//delete
		StringBuffer delete= new StringBuffer("xyzshasti");
		System.out.println(delete.delete(0, 3));
		//Insert
		StringBuffer insert=new StringBuffer("ram");
		System.out.println(insert.insert(3, "ram"));
		//capacity
		System.out.println(insert.capacity());
		//Like String we have charAt, Substring, length method as well
	}

}
