package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class Two_D_array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();

		// calling methods
		int[][] a = Utility.arrayInt(m, n);
		double[][] b = Utility.arrayDouble(m, n);
		String[][] c = Utility.arrayBoolean(m, n);

		// calling display method
		int display = Utility.display(a, b, c, m, n);

	}

}
