package com.important.program;

import java.util.Scanner;

public class NumberOfDigitsInANumberApp2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int result = NumberOfDigits.numberOfDigits(num);
		System.out.println(result);
		
		

	}

}
class NumberOfDigits{
	static int numberOfDigits(int num) {
		int digit;
		int count=0;
		while(num!=0) {
			digit=num%10;
			count++;
			num=num/10;
		}
		return count;
		
	}
}
