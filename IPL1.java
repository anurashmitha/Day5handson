package com.day5;
import java.util.Scanner;
class UserMainCode{
	static  boolean ValidateDate(String s) {
		try{
			String[] a=s.split("-",3);
		
		int date=Integer.parseInt(a[0]);
		int month=Integer.parseInt(a[1]);
		int year=Integer.parseInt(a[2]);
		if(date<=31 & month<=12 & year<=2021 ) {
			return true;			
		}
		else {
			return false;
		}
		}
		catch(Exception e) {
			//System.out.println(e);
			return false;
		}
	}
}

public class IPL1 {

	public static void main(String[] args) {
		UserMainCode u=new UserMainCode();
		UserMainCode v=new UserMainCode();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Date:");
		String t;
		t=s.nextLine();
		//String s="02-06-2000";
		//String t="05/04/2020";
		boolean tf;
		tf=u.ValidateDate(t);
		if(tf==true) System.out.println("Valid");
		else {
			System.out.println("Invalid");
		}
	}

}
