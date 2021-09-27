package com.ltts;

import java.util.Scanner;
public class ExceptionRunRate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the runs scored");
		String str = input.next();
		int runs = Integer.parseInt(str);
		System.out.println("Enter the total overs:");
		int overs = input.nextInt();
		try {
			int runrate=runs/overs;
			System.out.println("Current RunRate:"+runrate);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}