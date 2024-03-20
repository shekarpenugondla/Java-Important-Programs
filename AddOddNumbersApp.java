package com.important.program;

import java.util.Scanner;

public class AddOddNumbersApp {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
	int result=OddNumbers.addOddNumbers(n);
	System.out.println("the sum os odd numbers is :"+result);
		
	}
}
class OddNumbers{
	static int addOddNumbers(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}return sum;
	}
}
