package com.important.program;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		Strong strong=new Strong();
		boolean result=strong.detectStrong(n);
		if(result==true) {
			System.out.println("entered number "+n+"is strong number");
		}
		else {
			System.out.println("entered number "+n+"is not strong number");
		}
		
		
	}
}
class Strong{
	int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
 boolean detectStrong(int num){
	 int temp=num;
	 int sum=0;
	 int digit=0;
	 while(temp!=0) {
		 digit=temp%10;
		 sum=sum+fact(digit);
		 temp=temp/10;
	 }
	 if(sum==num) {
		 return true;
	 }else {
		 return false;
	 }
	
	
}
}
