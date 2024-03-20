package com.important.program;

import java.util.Scanner;

public class SwappingOfTwoNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=scan.nextInt();
		System.out.println("enter the value of b");
		int b=scan.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
		
		
	}

}
