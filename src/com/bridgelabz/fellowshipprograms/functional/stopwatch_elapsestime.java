package com.bridgelabz.fellowshipprograms.functional;

import java.util.Scanner;

import com.bridgelabz.fellowshipprograms.utility.Utility;

public class stopwatch_elapsestime 
{
	 public static void main(String[] args) 
	 { 

		 	Scanner sc = new Scanner(System.in);
		 	/* double sttime = sc.nextDouble();
	        System.out.println("Emter the time");
	        double elapsed = 1e-15;  
	        double stime = sttime;           

	        double elapsestime = Utility.stopwatch(stime, sttime,elapsed);*/
		 
			System.out.println("enter 1 to start");
			double stime = sc.nextDouble();
			System.out.println("enter to stop");
			double sttime = sc.nextDouble();
			double elapsed = 1e-15;
			double stopelapses = Utility.stopwatch(stime, sttime, elapsed);
		 
	    }

}
