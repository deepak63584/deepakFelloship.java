package com.bridgelabz.fellowshipprograms.functional;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class AdditionOfTwoNumbers 
{
	public static void main(String []args)
	{
		int fno =2;
		int sno = 4;
		int sum = Utility.add(fno, sno);
		System.out.println(sum);
		int sub = Utility.sub(fno, sno);
		System.out.println(sub);
	}
	
}
