package com.bridgelabz.fellowshipprograms.utility;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Utility
{
	public static Scanner sc = new Scanner(System.in);
	// Adition of 2 no-
	public static int add(int fno, int sno)
	{
		int sum = fno+sno;
		return sum;
	}
	
	// Susstraction of 2 no-
	public static int sub(int fno, int sno)
	{
		int sub = fno-sno;
		return sub;
	}
	
	// Leap year program
	public static int leapOrNot(int year)
	{
	if(year!=0)
	{
	   if(year%400==0)
                  	System.out.println(year+" is a leap year");
                  else  if(year%100==0)
	    	System.out.println(year+" is not a leap year");
                   	else if(year%4==0)                    
	    		System.out.println(year+" is a leap year");
                     	       else 
	   		 System.out.println(year+" is not a leap year");                       
 	 }
	else
		System.out.println("Year zero does not exist ");
	return year;
	}
	
	// flip-coin program
	public static int flipPercen(int times) 
	{
		double heads = 0;
		
		for (int i = 0; i < times; i++) 	
		{
			if (Math.random() > 0.5) 
			{
				heads++;
			}
		}
		
		System.out.println("No of heads is : " + (heads));
		
		System.out.println("No of tails is : " + (times-heads));
		
		System.out.println("heads percentage is " + (float) (heads / times) * 100);
		
		System.out.println("tails percentage is " + (float) (times - heads) / times * 100);
		
		return times;
	}
	
	//Power of 2-
	public static int powerof2 (int power)
	{
		
		int n = 1;
		for(int i = 1; i <= power; i++)
		{
			 n = n * 2;
		}
		System.out.println("Power of 2 "+power+"times is :"+n);
           
		return power;
	 }
	
	//Prime-Factor-
	public static int prime_factor(int number)
	{
		for (int i = 2; i <= number; i++) 
		{
	       while (number % i == 0) 
	       		{
	                System.out.print(i + " ");
	                number = number / i;
	    		}
	     }	
	 
	        if (number < 1)
	        	System.out.println(number);
			return number;
	}
	
	//Hormonic Number series-
	public static double harmonicnumber (double n)
	{
		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum=0.0;
        int i=1;
        for ( i = 1; i <= n; i++) 
        {
            sum += 1.0 / i;
        }
		return sum;
	}
	
	//gambler-
	public static int gamble(int times ,int stack, int goal)
	{
		int bets = 0;
		int wins = 0;
		
		for(int i = 0; i < times; i++)
		{
			int cash = stack;
			while(cash > 0 && cash < goal)
			{
				bets++;
				if(Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if(cash == goal)
				wins++;
		}
		System.out.println(wins+" wins out of "+times);
		
		System.out.println("wins percentage is " + (float) (wins / times) * 100);
		
		System.out.println("loss percentage is " + (float) (times - wins) / times * 100);
		
		System.out.println("Total bets in "+times+"games "+bets);
		
		return wins;
		
	}	
	
	//Coupen number genrator by using random function
	public static int coupon_code(String[] couponcode2)
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
	
		while (random>0)
			{
				sb.append(chars[random % chars.length]);
				random /= chars.length;
			}
	String couponCode=sb.toString();
	
	System.out.println(couponCode);
	return random;
	}

	
	//2D-ARRAY PROGRAM-INT,DOUBLE AND BOOLEAN
	public static int[][] arrayInt(int m, int n) 
		{
			int a[][] = new int[m][n];
			System.out.println();
			System.out.println("Integer Array");

			for (int i = 0; i < m; i++) 
			{
				for (int j = 0; j < n; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			return a;
		}

		public static double[][] arrayDouble(int m, int n) 
		{
			double b[][] = new double[m][n];
			System.out.println();
			System.out.println("Double Array");

			for (int i = 0; i < m; i++) 
			{
				for (int j = 0; j < n; j++) 
				
				{
					b[i][j] = sc.nextDouble();
				}
			}
			return b;
		}

		public static String[][] arrayBoolean(int m, int n) 
		
		{
			String c[][] = new String[m][n];
			System.out.println();
			System.out.println("Boolean Array");

			for (int i = 0; i < m; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					c[i][j] = sc.nextLine();
				}
			}
			return c;
		}

		// display method
		public static int display(int[][] a, double[][] b, String[][] c, int m, int n) 
		{
			PrintWriter pw = new PrintWriter(System.out,true);

			// display integers
			System.out.println();
			pw.println("2D ARRAY INTEGER");

			for (int i = 0; i < m; i++) 
			{
				for (int j = 0; j < n; j++)
				{
					pw.print("\t" + a[i][j] + " ");
				}
				pw.println("\t");
			}

			// display double
			System.out.println();
			pw.println("2D ARRAY DOUBLE");

			for (int i = 0; i < m; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					pw.print("\t" + b[i][j] + " ");
				}
				pw.println("\t");
			}

			// display boolean
			System.out.println();
			pw.println("2D ARRAY BOOLEAN");

			for (int i = 0; i < m; i++)
			{
				for (int j = 0; j < n; j++) 
				{
					pw.print("\t" + c[i][j] + " ");
				}
				pw.println("\t");
			}
			return 0;
		}
	 //Generic method for displaying 2d array
	 
		<t> void displayArray(t[][] arr) 
		{
			PrintWriter pw = new PrintWriter(System.out);

			// display integers
			System.out.println();
			for (int i = 0; i < arr.length; i++) 
			{
				for (int j = 0; j < arr[i].length; j++) 
				{
					pw.print("\t" + arr[i][j] + " ");
				}
				pw.println("\t");
			}
		}
	
		
	//Sum Of Zero-	
	public static int sum_of_Zero(int n)
	{
	int[] arr = new int[n];
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter values");
	// taking integer input for creating array
	for (int i = 0; i < n; i++) 
	{
		arr[i] = sc.nextInt();
	}
	// checking for triplets by loop
	for (int i = 0; i < arr.length; i++) 
	{
		for (int j = i + 1; j < arr.length; j++) 
		{
			for (int k = j + 1; k < arr.length; k++) 
			{
				if (arr[i] + arr[j] + arr[k] == 0) 
				{
					count++;
					System.out.println(arr[i] + "+" + arr[j] + "+" + arr[k] + "=" + "0");
				}
			}
		}
	}
	// output
	System.out.println("total pairs are " + count);
	return count;
	}	
	
	//DISTANCE PROGRAM-
	public static int distancetest (int x,int y)
	{
		double distance =Math. sqrt(x*x + y*y);
		System.out.println("Euclidian Distance is:");
		System.out.println(distance);
		return 0;
			
	}
	
	//PERMUTATION PROGRAM-
	public static String[] permutIteration(String s2) 
	{
		int count = 0;
		ArrayList<String> arl = new ArrayList<String>();
		//List<? extends Object> list = new ArrayList<String>();
		 //ArrayList<String> obj = new ArrayList<String>(
		for (int i = 0; i < s2.length(); i++) 
		{
			for (int j = 0; j < s2.length(); j++) 
			{
				String s1 = s2;
				System.out.println(i + " " + j);
				System.out.println(swap(s1, i, j));
				count++;
			}
		}
		System.out.println("no of permutation :"+count);
		return arl.toArray(new String[arl.size()]);
		
	}

	public static String swap(String s1, int i, int j) 
	{
		char[] ch = s1.toCharArray();
		char temp;
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
	}
	
	//Stopwatch Program for measuring elapse time
	public static double elapsed(double c) {

		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}

		return t;
	}
	
	//Stopwatch program
	public static double stopwatch(double stime,double sttime,double elapsed)
	{
		stime=0;
		sttime=0;
		elapsed=0;
		
		//to start timer
		
			stime=System.currentTimeMillis();
			System.out.println("Start Time is: "+stime);
		
		// to stop timer
		
			sttime=System.currentTimeMillis();
			System.out.println("Stop Time is: "+sttime);
		
		
		//Elapesed time
			elapsed=stime-sttime;
			return elapsed;
	}
	
	
	//WINDCHILL PROGRAM- 
	public static double windChill(double f, double v) 
	{

		double w = 35.74 + 0.62158 * f + (0.4275 * f - 35.75) * Math.pow(v, 0.16);
		if (Math.abs(f) > 50 || v > 120 || v < 3)
			System.out.println("enter the valid input");
		else
			System.out.println(w);
		return 0;
	}
	
	//QUADRATIC EQUATION-
	public static int roots(int a, int b, int c) 
	{
		// calculating equatn value
		int equatn = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(equatn, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(equatn, 1 / 2)) / (2 * a);
		System.out.println(x1);
		System.out.println(x2);
		return equatn;

	}
	
	
	//ANAGRAM-
	/*
	  Function to count the characters in a string alphabaticlally and return array
	  of the count of each alphabet
	  
	  @param s the string given to count
	  @return the array for counted characters
	 */
	public static int[] count(String s) {
		s = s.toLowerCase();
		int[] c = new int[25];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 97]++;
		}
		return c;
	}

	/*
	 Function to count the value in given integer be place
	  
	  @param n the integer value to count
	  @return the integer array for the count value
	 */
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	//ANAGRAM-check the two strings are anagrams or no
	public static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] s1count = count(s1);
		int[] s2count = count(s2);
		for (int i = 0; i < s2count.length; i++) {
			if (s2count[i] != s1count[i]) {
				return false;
			}
		}
		return true;
	}

	
	//to check the values are anagrams or not
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	
	//Function to print the prime no between to 1 to 1000
	
	public static int prime() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				System.out.print(j + " ");
		}
		return 0;
	}

	
	/*chekc if given no is prime or not
	  n thenumber which to check for prime
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;
	}

	
	//Function helping prime() to check if prime is pallindrome and print it
	public static int primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
		}
		return 0;
	}

	//Function to check if no is anagram or not
	public static int primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();//generics concept
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
		return 0;
	}
	/*
	 Function to find the is pallindrome or not
	 
	 n the integer which to check for pallindrome
	 return true if its pallindrome or false if its not
	 */
	public static boolean isPallindrome(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
	
	
	/* A utility function to print array of size n*/
    public static int printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println();
		return n; 
    } 
    
    public static int printArray(String arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println();
		return n; 
    } 
	
	//Insertion sort for integer
	public static int[] insertionSort(int arr[])
	{
		int temp;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if((arr[j]-arr[j-1])<0)
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
					break;
			}
		}
		return arr;
	}
	
	
	//Insertion sort for String
		public static String[] insertionSortString(String strarr[])
		{
			String temp;
			for(int i=1;i<strarr.length;i++)
			{
				for(int j=i;j>0;j--)
				{
					if(strarr[j].compareTo(strarr[j-1])<0)
					{
						temp=strarr[j];
						strarr[j]=strarr[j-1];
						strarr[j-1]=temp;
					}
					else
						break;
				}
			}
			return strarr;
		}
		
		
		
	//Bubble Sort for Integer
	public static int[] bubbleSort(int numbers[])
   	 {
        int temp;
        for(int i = 0; i < numbers.length; i++)
       	{
            for(int j = 1; j < (numbers.length -i); j++)
            {
            	//if numbers[j-1] > numbers[j], swap the elements
        		if(numbers[j-1] > numbers[j])
    			{
    				temp = numbers[j-1];
   					numbers[j-1]=numbers[j];
    				numbers[j]=temp;
    			}
   		 	}
    	}
		return numbers;
	}

	//Bubble Sort for String
	public static String[] bubbleSortString(String numbers[])
   	 {
        String temp;
        for(int i = 0; i < numbers.length; i++)
       	{
            for(int j = 1; j < (numbers.length -i); j++)
            {
            	//if numbers[j-1] > numbers[j], swap the elements
        		if(numbers[j-1].compareTo(numbers[j])<0)
    			{
    				temp = numbers[j-1];
   					numbers[j-1]=numbers[j];
    				numbers[j]=temp;
    			}
   		 	}
    	}
		return numbers;
	}
	
	//Integer Binary search
	public static int binary(int[] arr, int n) {
		int high = arr.length - 1, low = 0, mid;
		arr = bubbleSort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (n == arr[mid]) {
				return mid;
			} else if (arr[mid] < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	//String binary search
	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		arr = bubbleSortString(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;
			} else if (arr[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	// Mearge sort-
	/*public static int merge(int[] array,int low,int mid,int high)
	{
        int i,j,k;
        int[] c= new int[high-low+1];
        k = 0;
        i=low;
        j=mid+1;
        while(i<=mid && j<=high)
        {
            if(array[i]<=array[j])
                c[k++] = array[i++];
            else
                c[k++] = array[j++];
        }
        while(i<=mid)
            c[k++] = array[i++];
        while(j<=high)
            c[k++] = array[j++];
        k=0;
        for(i = low; i<=high; i++)
            array[i] = c[k++];
		return 0;
	}*/
	public static int merge(int nums[], int left, int m, int right)
    {
        int n1 = m - left + 1;
        int n2 = right - m;
 
        int Left_part_arra[] = new int [n1];
        int Right_part_arra[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
            Left_part_arra[i] = nums[left + i];
        for (int j=0; j<n2; ++j)
            Right_part_arra[j] = nums[m + 1+ j];

        int i = 0, j = 0;
 
        int k = left;
        while (i < n1 && j < n2)
        {
            if (Left_part_arra[i] <= Right_part_arra[j])
            {
                nums[k] = Left_part_arra[i];
                i++;
            }
            else
            {
                nums[k] = Right_part_arra[j];
                j++;
            }
            k++;
        }
 
        while (i < n1)
        {
            nums[k] = Left_part_arra[i];
            i++;
            k++;
        }
 
        while (j < n2)
        {
            nums[k] = Right_part_arra[j];
            j++;
            k++;
        }
		return 0;
    }
 
    // merge()
    public static int sort(int nums[], int left, int right)
    {
        if (left < right)
        {
            // Find the middle point
            int m = (left+right)/2;
 
            // Sort first halve
            sort(nums, left, m);
			// Sort second halve
            sort(nums , m+1, right);
 
            // Merge the sorted halves
            merge(nums, left, m, right);
        }
		return 0;
    }
    
    
    //Temprature Conversion
    public static int temperaturConversion(int tem, char t) 
    {
		int conver;
		if (t == 'c' || t == 'C') 
		{
			conver = ((tem * (9 / 5)) + 32);
		} else if (t == 'f' || t == 'F') 
		{
			conver = ((tem - 32) * (5 / 9));
		} else {
			System.out.println("Enter correct input");
			return 0;

		}
		System.out.println("coverted temp is " +conver );
		return conver;
	}
    
    
    public static int dayOfWeek(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		return d0;
	}
    
    
    public static double monthlyPayment(double p, double y, double r) {
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}

 
	
	
	
}
