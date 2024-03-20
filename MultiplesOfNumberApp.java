package com.important.program;

import java.util.Scanner;

public class MultiplesOfNumberApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
int n=scan.nextInt();
Multiples.multiples(n);

	}
}
class Multiples{
	static void multiples(int n) {
		for(int i=1;i<=100;i++) {
			if(i%n==0) {
				System.out.println(i);
			}
		}
	}
}
	
	
	
