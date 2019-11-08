package com.bridgelabz.fellowshipprograms.algorithms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class prime_Palindrom 
{
	public static void main(String[] args) {
		System.out.println("prime between 0 to 1000");
		int primeno = Utility.prime();
		System.out.println("prime no between 0 to 1000 also pallindrome");
		int primepali = Utility.primePallindrome();
		System.out.println("prime and anagrams");
		int primeanag = Utility.primeAnagrams();
	}

}
