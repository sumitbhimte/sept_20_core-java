package com.ltts;

import java.util.*;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<String> ts = new HashSet<>();
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt(); 
		for(int i=0;i<n+1;i++) { 
			String name = input.nextLine(); 
			ts.add(name); }
		System.out.println(ts);
		System.out.println(ts.size()-1);
	}
}