package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class triplets_sum_Zero 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of inputs");
		int n = sc.nextInt();
		int triplets = Utility.sum_of_Zero(n);

	}

}
