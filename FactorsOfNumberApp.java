package com.important.program;

import java.util.Scanner;

public class FactorsOfNumberApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
	int n=scan.nextInt();
	Factors.factors(n);
	
	}
	

}
class Factors{
	static void factors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
			
		}
		
	}
}
