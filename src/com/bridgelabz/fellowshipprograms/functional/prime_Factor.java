package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class prime_Factor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number to find Prime Factors ");   
		int number=sc.nextInt();
		
		System.out.println("Given Number is : " + number);
		System.out.print("Prime Factors are : " );
		
		int primefactor=Utility.prime_factor(number);
		
	}

}
