package com.bridgelabz.fellowshipprograms.algorithms;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class vending_machine 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter amoumt");
		int value = s.nextInt();
		Utility.returnnotes(value);
	}

}
