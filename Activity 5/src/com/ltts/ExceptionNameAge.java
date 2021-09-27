package com.ltts;

import java.util.Scanner;
class InvalidAgeRangeException extends Exception{
	InvalidAgeRangeException(){
		System.out.println("CustomException: InvalidAgeRangeException");
	}
}
public class ExceptionNameAge {
	public static void main(String[] args) throws InvalidAgeRangeException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the player name:");
		String name = input.nextLine();
		System.out.println("Enter the player age:");
		int age = input.nextInt();
		if(age<19)
		{
			throw new InvalidAgeRangeException();
		}
		else
			System.out.println("Player Name:"+name+"\nPlayer age:"+age);
	}
}