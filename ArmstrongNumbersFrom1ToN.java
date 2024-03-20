package com.important.program;

import java.util.Scanner;

public class ArmstrongNumbersFrom1ToN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a range to print armstrong numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		for(int i=num1;i<=num2;i++) {
			int power = Demo.getCount(i);
			int result = Demo.getSum(i,power);
			if(i==result) {
				System.out.println(i);
			}
		}
		
	}

}
class Demo{
	static int getCount(int i) {
		int digit;
		int count=0;
		while(i!=0) {
	      digit=i%10;
	      count++;
	      i=i/10;
			
		}
		return count;
		
	}
	static int getSum(int i,int power) {
		int digit;
		int sum=0;
		while(i!=0) {
			digit=i%10;
		     int value= (int)Math.pow(digit, power);
		     sum=sum+value;
		     i=i/10;
		}
		return sum;
		
	}
}
