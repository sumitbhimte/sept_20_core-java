package com.ltts;

import java.util.Scanner;

public class ExceptionOvers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of overs:");
		int n = input.nextInt();
		try{
			int arr[] = new int[n];
			System.out.println("Enter the number of runs:");
			for(int i=0;i<n;i++)
			{
				arr[i]= input.nextInt();
			}
			System.out.println("Enter the over number");
			int x = input.nextInt();
			System.out.println("Runs scored in this over:"+arr[x]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(NegativeArraySizeException e) {
			System.out.println(e);
		}		
	}
}