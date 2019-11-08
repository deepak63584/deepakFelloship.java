package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class wind_chill 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit");
		double f = sc.nextDouble();
		System.out.println("enter wind speed in miles per hour");
		double v = sc.nextDouble();
		double windChill = Utility.windChill(f, v);
		}

}
