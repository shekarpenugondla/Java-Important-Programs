package com.important.program;

import java.util.Scanner;

public class CubeOfNo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value");
		int n=scan.nextInt();
		int cube=1;
		for(int i=1;i<=3;i++) {
			cube=cube*n;
		}System.out.println("the cube of given number is="+cube);
		scan.close();
	}

}
