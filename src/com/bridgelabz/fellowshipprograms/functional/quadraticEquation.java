package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class quadraticEquation 
{
	public static void main(String[] args)
	{
			Scanner s = new Scanner(System.in);
			System.out.println("enter a ");
			int a = s.nextInt();
			System.out.println("enter b");
			int b = s.nextInt();
			System.out.println("enter c");
			int c = s.nextInt();
			int quardequatn = Utility.roots(a, b, c);
			
		}
}
