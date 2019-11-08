package com.bridgelabz.fellowshipprograms.algorithms;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class monthlyPayment {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal ,year and rate");
		double p = s.nextDouble();
		double y = s.nextDouble();
		double r = s.nextDouble();
		System.out.println("mothly payment is " + Utility.monthlyPayment(p, y, r));

	}

}
