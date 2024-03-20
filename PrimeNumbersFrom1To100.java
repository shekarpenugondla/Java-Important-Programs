package com.important.program;

import java.util.Scanner;

public class PrimeNumbersFrom1To100 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter n value");
		int n=scan.nextInt();
		int fact;
		for(int j=2;j<=n;j++) {
			fact=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					fact++;
				}
			}
			if(fact==2) {
				System.out.println(j);
			}
		}
	
	}

}
