package com.bridgelabz.fellowshipprograms.algorithms;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class sorting 
{
	public static void main(String[] args) 
	{
		 int arr[] = { 12, 11, 13, 5, 6 };
		 int arr1[] ={3,60,35,2,45,320,5};
		 String[] a = {"contribute", "geeks", "ide", "practice","abc","xyz","lmn" };
		 System.out.println("before sorting: ");
		 Utility.printArray(arr);
		 Utility.printArray(arr1);
		 Utility.printArray(a);
		 Utility.printArray(arr1);
		 System.out.println("After sorting:");
		 System.out.println("Insertion sort :");
		 Utility.insertionSort(arr);
		 Utility.insertionSortString(a);
		 Utility.printArray(arr);
		
		 System.out.println("bubble sort:-");
		 Utility.bubbleSort(arr1);
		 Utility.bubbleSortString(a);
		 Utility.printArray(arr1); 
		 Utility.printArray(a);
		 System.out.println("Binary search :");
		 Utility.binary(arr1, 60);
		 Utility.printArray(arr1);
		 System.out.println("Key Found at : " + Utility.binary(arr1, 60)+ " position");
		 Utility.binary(a, "ide");
		 Utility.printArray(a);
		 System.out.println("Key Found at : " +  Utility.binary(a, "ide")+ " position");
	}

}
