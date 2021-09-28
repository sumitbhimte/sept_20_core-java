package com.ltts;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListPlayers {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter top 5 scorers of IPL season 13");
		for(int i=0;i<5;i++)
		{
			String name = input.nextLine();
			list1.add(name);
		}
		ArrayList list2 = new ArrayList();
		System.out.println("Enter top 5 scorers of IPL season 12");
		for(int i=0;i<5;i++)
		{
			String name = input.nextLine();
			list2.add(name);
		}
		System.out.println("Consistent run Scorers:\n"+new ListPlayers().intersection(list1, list2));
	}
	public <T> List<T> intersection(List<T> list1,List<T> list2){
		List<T> list = new ArrayList<T>();
		for(T t:list1) {
			if(list2.contains(t)) {
				list.add(t);
			}
		}
		return list;
		
	}
}
