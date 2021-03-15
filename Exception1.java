package com.day5;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the number of overs");
			Scanner s=new Scanner(System.in);
			int overs=s.nextInt();
			int runs[]=new int[overs];
			System.out.println("Enter the number of runs for each over");
			for(int i=0;i<overs;i++) {
				runs[i]=s.nextInt();
			}
			System.out.println("enter the over number ");
			int number =s.nextInt();
			System.out.println(runs[number-1]);
			
		}
		catch(ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
			System.out.println(e);
		}
		}

	}
