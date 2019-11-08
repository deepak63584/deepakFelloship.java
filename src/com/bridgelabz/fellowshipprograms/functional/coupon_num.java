package com.bridgelabz.fellowshipprograms.functional;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class coupon_num 
{
	public static void main(String[] args) 
	{
		/*char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=10000000;
		
		int random=(int) (Math.random()*max);
		
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			
			random /= chars.length;
			
		}
		String couponCode=sb.toString();
		
		System.out.println(couponCode);*/
		String[] couponcode2 = { };
		int couponCode = Utility.coupon_code(couponcode2);
	}
}
