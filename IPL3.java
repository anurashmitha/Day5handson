package com.day5;

import java.util.Scanner;

class UserMainCode2{
	static void validatePlayer(String name) {
		int len=name.length();
		int count=0;
		for(int i=1;i<len;i++) { 
			if(name.charAt(i)=='a' || name.charAt(i)== 'A') {
				count++;
			}
		}
		if(count %2 != 0 || count ==0) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}
}

public class IPL3 {

	public static void main(String[] args) {
		System.out.println("Enter Player Name:");
		Scanner s = new Scanner(System.in);
				String player =s.nextLine();
        UserMainCode2.validatePlayer(player);
	}

}