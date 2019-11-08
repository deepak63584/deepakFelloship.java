package com.bridgelabz.fellowshipprograms.algorithms;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class temprature_Conversion 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter temp in c or f");
		int tem = s.nextInt();
		char t = s.next().charAt(0);
		if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
			System.out.println("enter correct input");
			tem = s.nextInt();
			t = s.next().charAt(0);
		}
		Utility.temperaturConversion(tem, t);
	}
}
