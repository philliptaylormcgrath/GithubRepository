package unicalc;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		System.out.println("Please input a word: ");
	
		String firstString = input.nextLine();
	
		Scanner inputTwo = new Scanner(System.in);
	
		System.out.println("Please input another word: ");
		
		String secondString = input.nextLine();
		
		System.out.println("The words you entered are " + firstString + " and " + secondString);
		
		//new code
		
		int strOneLength = firstString.length();
		
		int strTwoLength = secondString.length();
		
		int totalOne = 0;
		int totalTwo = 0;
		int outPutTotal = 0;
		
		int X = 0;
		
		 while (strOneLength > 0) {
			 totalOne = totalOne + firstString.charAt(0 + X);
			 X = X + 1;
			 strOneLength = strOneLength - 1;
			 
			 
			 
		 }
		 //System.out.println(totalOne);
		 
		 int Y = 0;
		 
		 while (strTwoLength > 0) {
			 totalTwo = totalTwo + secondString.charAt(0 + Y);
			 Y = Y + 1;
			 strTwoLength = strTwoLength - 1;
			 
		 }
		//System.out.println(totalTwo);
		 
		 outPutTotal = (totalOne - totalTwo);
		 
		 System.out.println(Math.abs(outPutTotal));
		 
		 
		//char fifthChar = firstString.charAt(4);
		//int codePointE = (int)fifthChar;
		
		//char fourthChar = firstString.charAt(3);
		//int codePointD = (int)fourthChar;
		
		
		//System.out.println(totalOne);
	}
}
//remaining objectives - Convert each string separately into unicode
//- Subtract them
// - convert the answer into absolute value
//display answer