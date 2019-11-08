package com.bridgelabz.fellowshipprograms.algorithms;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class anagramDetection 
{
	public static void main(String[] args) 
	{
		
		Scanner am = new Scanner(System.in);
	
		System.out.println("Enter first word");
		String s1= am.nextLine();
		System.out.println("Enter Second word");
		String s2= am.nextLine();
		
		System.out.println(Utility.anagram(s1,s2)? "Words are Anagram" : "Words are not Anagram");
	}
}
