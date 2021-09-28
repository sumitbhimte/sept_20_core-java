package com.ltts;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class ListIpl {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Scanner input = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			String name = input.nextLine();
			list.add(name);
		}
		System.out.println("Enter swap position:");
		int n = input.nextInt();
		Collections.swap(list, n, 0);
		System.out.println(list.toString().replace("[", ",").replace("]", ","));
}
}