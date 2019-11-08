package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class hormonic_Num 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no you want to find hormonic :");
		
		double n = sc.nextDouble();
		
	    double sum=Utility.harmonicnumber(n);
	    
	    System.out.println("Resuls is : "+sum);
		
	}

}
