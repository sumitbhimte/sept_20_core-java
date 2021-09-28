package com.ltts;

import java.util.Scanner;
import java.util.*;
public class SetMoM {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=0;i<n+1;i++)
		{
			String name = input.nextLine();
			ts.add(name);
		}
		System.out.println(ts.toString().replace("[", "\n").replace("]", "\n"));
	}
}