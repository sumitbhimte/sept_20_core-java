package com.ltts;
import java.util.Scanner;
import java.util.ArrayList;
public class ListCricket {
	public static void main(String[] args) {
		ArrayList details = new ArrayList();
		Scanner input = new Scanner(System.in);
		System.out.println("Player Details\nEnter Player name:");
		String name = input.nextLine();
		details.add(name);
		System.out.println("Enter Country:");
		String country = input.nextLine();
		details.add(country);
		System.out.println("Enter skill:");
		String skill = input.nextLine();
		System.out.println("Enter age:");
		int age = input.nextInt();
		details.add(age);
		System.out.println("Enter the position to add skill:");
		int n = input.nextInt();
		details.add(n, skill);
		System.out.println(details.toString().replace("[", ",").replace("]", ","));
		System.out.println("Enter the position to remove:");
		int x = input.nextInt();
		details.remove(x);
		System.out.println(details.toString().replace("[", ",").replace("]", ","));		
	}
}
