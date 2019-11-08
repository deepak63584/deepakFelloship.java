package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class flipCoin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter  no of times  to flip");
		
		int times = sc.nextInt();
		
		int flipPercen = Utility.flipPercen(times);
	}

}
