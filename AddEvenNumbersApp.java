package com.important.program;

import java.util.Scanner;

public class AddEvenNumbersApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int result=EvenNumbers.addEvenNumbers(n);
		System.out.println("even numbers sum is:"+result);
		
	}
}
class EvenNumbers{
	static int addEvenNumbers(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
