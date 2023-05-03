package com.learn.Exceptionhandling;

public class TryCatchFinally {

	public static int dummy() {
		return 3;
	}

	public static void main(String[] args) {

		try {
			System.out.println("Inside try block");
			System.exit(0);
			System.out.println(2/0);
			System.out.println("After exception");

		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally {
			System.out.println("Inside Finally block");
		}

	}

}
