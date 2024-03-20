package com.important.program;

import java.util.Scanner;

public class EvenOddSumApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int a=scan.nextInt();
	EvenOdd.evenOddSum(a);
	
	
	}

}
class EvenOdd{
	static void evenOddSum(int a) {
		int evenSum=0;
		int oddSum=0;
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
				
			}else {
				oddSum=oddSum+i;
				
			}
		}
		System.out.println("even numbers sum is:"+evenSum);
		System.out.println("odd numbers sum is:"+oddSum);
	}
}
