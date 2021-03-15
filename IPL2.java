package com.day5;
import java.util.Scanner;

class UserMainCode1{
	static boolean validateCity(String str) {
		int len=str.length(),flag=0;
		
		boolean f1=Character.isLetter(str.charAt(0)); 
		boolean f2=Character.isLetter(str.charAt(1));
		
		boolean l1=Character.isLetter(str.charAt(len-1));
		boolean l2=Character.isLetter(str.charAt(len-2));
	
		for(int j=2;j<(len-2);j++){
			if(str.charAt(j) != '*') {
				flag += 1;
			}
		}
		if(f1 == true && f2 == true && l1 == true && l2 == true && flag == 0 )
		{
			System.out.println("Valid");
			return true;
		}
		else
		{
			System.out.println("Invalid");
			return false;
		}
						
	}
}

public class IPL2 {

	public static void main(String[] args) {
		System.out.println("Enter sample ");
		Scanner s =new Scanner(System.in);
				String str=s.nextLine();
		UserMainCode1.validateCity(str);
		
		

	}

}
