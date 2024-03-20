package com.important.program;

import java.util.Scanner;

public class EvenNo1To100App {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		Even.even1TO100(n);
		
		
	}

	
}
class Even{
	static void even1TO100(int n){
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	
		
		
	}
}

