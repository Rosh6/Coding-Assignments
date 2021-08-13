package org.assign.lcm;

import java.util.Scanner;

public class LcmOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		
		int num1= scn.nextInt();
		int num2= scn.nextInt();
		
		int lcm=0;
		
		lcm = (num1>num2)? num1: num2;
		
		while(true) {
			if(lcm % num1==0 && lcm% num2==0) {
				
				System.out.println("LCM of two numbers is " + lcm);
				break;
			}
			lcm++;
		}
		

	}

}
