package com.important.program;

import java.util.Scanner;

public class MultiplicationTableApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		MultiplicationTable.multiplicationTable(n);
	}
}
class MultiplicationTable{
	static void multiplicationTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}