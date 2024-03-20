package com.important.program;

import java.util.Scanner;

class PalindromeNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
	    int num=scan.nextInt();
	    int result=Palindrome.palindrome(num);
	    if(num==result) {
	    	
	    	System.out.println("palindrome number");
	    }else {
	    	System.out.println("not a palindrome number");
	    }
	}

}
class Palindrome{
	static int palindrome(int num) {
		int rev=0;
		int digit;
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		return rev;
		
	}
}
