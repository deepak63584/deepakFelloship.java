package com.bridgelabz.fellowshipprograms.algorithms;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class day_Of_Week {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day, month and year :");
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("the day is : "+Utility.dayOfWeek(d, m, y));
		
		

	}

}
