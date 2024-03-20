package com.important.program;

import java.util.Scanner;


class FibonacciSeriesApp{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number to print series of fibonacci numbers");
		int n=scan.nextInt();
		Fibonacci.fibonacci(n);
		
		
	}
}
class Fibonacci{
	static void fibonacci(int n) {
		int num1=0;
		int num2=1;
		if(n==1) {
			System.out.println(num1);
		}
		else if(n==2){
			System.out.println(num1+" "+num2);
			
		}else {
			System.out.println(num1+" "+num2+" ");
			for(int i=3;i<=n;i++) {
				int fib=num1+num2;
				System.out.println(fib+" ");
				num1=num2;
				num2=fib;
				
			}
			
		}
	}
}
