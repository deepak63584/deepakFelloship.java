package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class gambling 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your stack Amount:");
		int stack = sc.nextInt();
		
		System.out.println("Enter your goal Amount:");
		int goal = sc.nextInt();
		
		System.out.println("Enter the times to gamble:");
		int times = sc.nextInt();
		
		int gamble = Utility.gamble(times, stack, goal);
		
		
	}

}
