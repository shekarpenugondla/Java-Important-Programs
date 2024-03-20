package com.important.program;

import java.util.Scanner;

public class FactorialApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter n value");
	int n=scan.nextInt();
	int result=Factorial.factorial(n);
	System.out.println(result);
	
	
	}
	
}
class Factorial{
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
}
