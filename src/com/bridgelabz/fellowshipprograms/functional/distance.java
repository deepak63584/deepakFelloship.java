package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class distance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for x:");
		int x = sc.nextInt();
		
		System.out.println("Enter the value for y:");
		int y = sc.nextInt();
		
		int distanceresult = Utility.distancetest(x, y);

	}

}
