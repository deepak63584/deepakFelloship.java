package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class power_Of_2 
{
	 public static void main(String[] args)
     {
        //This is the given input number n
        //    int n = 8;
 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the power less than 32 :");
        
        int power = sc.nextInt();
        
        while(power>31) 
        {
        	System.out.println("Powers of 2 that are less than 2");
        	power = sc.nextInt();
        }
        int powerof=Utility.powerof2(power);
     }
}
