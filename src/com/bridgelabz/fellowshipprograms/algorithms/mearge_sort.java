package com.bridgelabz.fellowshipprograms.algorithms;

import java.util.Arrays;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class mearge_sort 
{
	public static void main(String[] args) 
	{
	        int nums[] = {7, -5, 3, 2, 1, 0, 45};
	        System.out.println("Original Array:");
	        System.out.println(Arrays.toString(nums));
	        Utility.sort(nums, 0, nums.length-1);
	        System.out.println("Sorted Array:");
	        System.out.println(Arrays.toString(nums));
	}

}
