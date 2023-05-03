package com.learn.javalearning;

public class Parameterizedconstructor {

	public static class Animal{

		String animal_name;
		String animal_type;

		Animal(String name,String type){
			animal_name =name;
			animal_type= type;
		}
		public void sayAbourtanimal() {
			System.out.println("Animal name is"+animal_name+"and type is" +animal_type);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Animal animal1= new Animal("Duck", "omnivores"); 
			animal1.sayAbourtanimal();

			Animal animal2= new Animal("Duck", "omnivores"); 
			animal2.sayAbourtanimal();

		}


	}

}
