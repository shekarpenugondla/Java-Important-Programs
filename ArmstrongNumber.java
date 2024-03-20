package com.important.program;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to check whether the number is Armstrong or not");
		int n=scan.nextInt();
		int power = Armstrong.getCount(n);
		int result = Armstrong.getSum(n,power);
		if(n==result) {
			System.out.println("Entered number is armstrong number");
		}else {
			System.out.println("Entered number is not an armstrong number");
		}		
	}
}
class Armstrong{
	static int getCount(int n) {
	  int count=0;
	  int digit;
	  while(n!=0) {
		  digit=n%10;
		  count=count+1;
		  n=n/10;  
	  }
	  return count;	
	}
	static int getSum(int n,int power) {
		int digit;
		int sum=0;
		while(n!=0) {
		  digit=n%10;
		 int value =(int)Math.pow(digit, power);
		 sum=sum+value;
		 n=n/10; 
		}
		return sum;
		
	}
}




