package com.day5;

import java.util.Scanner;
class CustomException extends Exception{	 

	public CustomException() {
	 super();
	}

	@Override
	public String toString() {
		return "CustomException:InvalidAgeRangeException";
	}
	
	
}

public class Exception2 {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the player name");
			Scanner s= new Scanner(System.in);
			String name = s.nextLine();
			System.out.println("Enter player age");
			int age = s.nextInt();
			if(age <19) {
				throw new CustomException();
			}
			else {
				System.out.println("Details are: ");
				System.out.println("Player Name: "+name);
				System.out.println("Player Age: "+age);
			}
			
		}catch(CustomException e) {
			System.out.println(e);
		}

	}

}