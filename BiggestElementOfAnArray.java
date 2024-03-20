package com.important.program;

import java.util.Scanner;

public class BiggestElementOfAnArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		System.out.println("enter the elements of a array");
		int a[]=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		}
		int largest=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>a[0]) {
				largest=a[i];
			}
		}
		System.out.println("the largest element is:"+largest);
	}

}
