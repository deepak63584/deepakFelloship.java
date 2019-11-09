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
		
		System.out.println("The day is :");
		switch(Utility.dayOfWeek(d, m, y))
		{
			case 0: 
				System.out.println("Sunday");
				break;
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;                  
			default:
				System.out.println("Invalid");
				break;                  
		}
		
		

	}

}
