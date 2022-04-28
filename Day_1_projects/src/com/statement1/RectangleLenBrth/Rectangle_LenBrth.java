package com.statement1.RectangleLenBrth;

import java.util.Scanner;

public class Rectangle_LenBrth {
	
	int length;
	int breadth;
	int area;

	public Rectangle_LenBrth()
    {
    	length = 0;
    	breadth= 0;
    }

	void input() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		length = in.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		breadth = in.nextInt();
	}

	void calculate() {
		area = length * breadth;

	}

	void display() {
		System.out.println("Area of Rectangle = " + area);

	}

	public static void main(String args[]) {
		Rectangle_LenBrth obj1 = new Rectangle_LenBrth();
		obj1.input();
		obj1.calculate();
		obj1.display();
		System.out.println("Enter the values below;\n");
		
		Rectangle_LenBrth obj2 = new Rectangle_LenBrth();
		obj2.input();
		obj2.calculate();
		obj2.display();
		System.out.println("Enter the values below;\n");
		
		Rectangle_LenBrth obj3 = new Rectangle_LenBrth();
		obj3.input();
		obj3.calculate();
		obj3.display();
		System.out.println("Enter the values below;\n");
		
		Rectangle_LenBrth obj4 = new Rectangle_LenBrth();
		obj4.input();
		obj4.calculate();
		obj4.display();
		System.out.println("Enter the values below;\n");
		
		Rectangle_LenBrth obj5 = new Rectangle_LenBrth();
		obj5.input();
		obj5.calculate();
		obj5.display();
	}

}
