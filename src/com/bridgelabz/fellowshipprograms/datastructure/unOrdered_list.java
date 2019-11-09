package com.bridgelabz.fellowshipprograms.datastructure;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class unOrdered_list 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("/home/admin1/Desktop/thakur.txt");
		Scanner sf = new Scanner(f1);
		Scanner s = new Scanner(System.in);
		// addind values from file to list
		while (sf.hasNext()) {
			list.add(sf.next());
		}
	}
}
