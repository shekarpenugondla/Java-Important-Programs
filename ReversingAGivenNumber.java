package com.important.program;

import java.util.Scanner;

public class ReversingAGivenNumber {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int result = Reverse.reverse(n);
		System.out.println(result);
	}
}
class Reverse{
	static int reverse(int n) {
		int rev=0;
		int digit;
		while(n!=0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}return rev;
	}
}
