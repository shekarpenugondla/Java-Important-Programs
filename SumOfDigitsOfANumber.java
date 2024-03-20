package com.important.program;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int digit;
		int sum=0;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("the sum of digit are:"+sum);
		
		
	}

}
