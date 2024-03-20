package com.important.program;

import java.util.Scanner;

public class SquareOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value");
		int n=scan.nextInt();
	    int square=1;
	    for(int i=1;i<=2;i++) {
	    	square=square*n;
		
	    }System.out.println(square);
	}

}
