package com.day5;

import java.util.Scanner;

class TeamNameNotFoundException extends Exception{
	TeamNameNotFoundException(String s){  
	 super(s);  
	}  
}

	public class IplExc {
		
		static void check(String teamName) throws TeamNameNotFoundException{ 
			String[] teamList = new String[]{ "Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab",
					"Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
			boolean flag=true; 
			for (String element : teamList) { 
	            if (element.equals(teamName)) { 
	            	flag=false;
	            	break;
	            }
	            else {
	            	flag=true;
	            }
	        } 
			
			if(flag)
			{
				throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
			}
			
		}
		     

		public static void main(String[] args) {
			try{  
				Scanner s= new Scanner(System.in);
				System.out.println("Enter the expected winner team of IPL Season 4 :");
				String teamWinner = s.nextLine();
				check(teamWinner);
				System.out.println("Enter the expected runner Team of IPL Season 4 :");
				String teamRunner = s.nextLine();
				check(teamRunner);
			    System.out.println("Expected IPL Season 4 winner: " + teamWinner);			    
				System.out.println("Expected IPL Season 4 runner: " + teamRunner);
			}
			catch(Exception e){
				System.out.println(e);
			}  
			

		}

	}
		
