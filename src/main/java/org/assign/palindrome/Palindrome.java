package org.assign.palindrome;

import java.util.Scanner;

public class Palindrome {
	
public static void checkStr(String s1) {
	
		
		char c1[] =s1.toCharArray();
		int j=c1.length-1;
		boolean palindrome=true;
		for (int i=0;i<c1.length-1;i++) 
		{ 
			if(c1[i]==c1[j]) {
					
				palindrome=true;
			    j--;
		}
		else {
			palindrome=false;
		}
	}
	if (palindrome=true) {
		System.out.println("String is a palindrome");
	}
}
	
	
public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the string: \n");
		
		String str= scn.next();
		
		if(str.length()==1) {
			System.out.println("Not a palindrome");
		}
		
		else checkStr(str);
		
	}
}
