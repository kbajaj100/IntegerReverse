package com.reverse.integer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		
		System.out.println("enter a number");
		
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		
		String x;
		
		//System.out.println("n is: " + n);
		
		x = Integer.toString(n);
		
		int len = x.length();
		System.out.println("length is: " + len);
		
		String rev = "";
		
		for (int i = len; i > 0; --i){
			rev = rev + x.charAt(i-1);
		}
		
		System.out.println("rev is " + rev);
	}
}
