package com.ltts;

import java.util.Scanner;

abstract class Shape{
	int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	abstract void calculateArea(int value); 
	
} 
class Circle extends Shape{

	@Override
	void calculateArea(int value) {
		float area =  (3.14f * this.value * this.value);
		System.out.println(area);
	}
}
class Square extends Shape{

	@Override
	void calculateArea(int value) {
		float area = this.value*this.value;
		System.out.println(area);
	}
}
public class ShapeMain {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    System.out.println("1.Circle\n2.Square\nSelect Shape:");
		    int str=input.nextInt();
		    if(str==1)
		    {
				Circle circle = new Circle();
				circle.setValue(25);
				circle.calculateArea(circle.getValue());
		    }
		    else if(str ==2) {
		    	Square square = new Square();
	            square.setValue(23);
				square.calculateArea(square.getValue());
		    }
		    else
		    	System.out.println("Invalid");
	}
}