package com.day5;

import java.util.Scanner;

class Shapeb{
	protected String shapename;

	public Shapeb(String shapename) {
		super();
		this.shapename = shapename;
	}
	double calculateArea() {
		return 0;
	}
	
}
class Square2 extends Shapeb{
	private int side;

	public Square2(String shapename, int side) {
		super(shapename);
		this.side=side;
	}
	public double calculateArea() {
		return side*side;
	}
	
}

class Rectangle1 extends Shapeb{
	private int length;
	private int breadth;	
	
	public Rectangle1(String shapename, int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	double calculateArea() {
		return length*breadth;
	}
	
}
class Circle1 extends Shapeb{
	private int radius;	

	public Circle1(String circle, int radius) {
		super(circle);
		this.radius = radius;
	}
	double calculateArea() {
		return 3.14*radius*radius;
	}
	
}

public class Shape {

	public static void main(String[] args) {
		System.out.println("1. Rectangle \n2. Square \n3. Circle ");
		System.out.println("Area calculator --- Enter your Shape:");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		if(choice == 1)
		{
			System.out.println("enter length:");
			int length= s.nextInt();
			System.out.println("Enter Breadth:");
			int breadth = s.nextInt();
			Rectangle1 r = new Rectangle1("Rectangle",length,breadth);
			double a = r.calculateArea();
			System.out.println("Area of Rectangle= "+a);
			
		}
		else if(choice == 2) {
			
			System.out.println("Enter Side:");
			int side=s.nextInt();
			Square2 sq = new Square2("Square",side);
			double a=sq.calculateArea();
			System.out.println("Area of Square = "+a);
		}
		else if(choice==3) {
			System.out.println("Enter Radius:");
			int radius = s.nextInt();
			Circle1 c = new Circle1("radius",radius);
			double r=c.calculateArea();
			System.out.println("Area of Circle= "+r);
			
		}
		else {
			System.out.println("Wrong Choice");
		}
		

	}

}