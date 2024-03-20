package com.important.program;

import java.util.Scanner;

public class AutoMorphicNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		boolean result = AutoMorphic.detectAutoMorphic(n);
		if(result==true) {
			System.out.println("the entered number"+n+"is a automorphic number");
			
		}else {
			System.out.println("the entered number"+n+"is not a automorphic number");
		}
		
		
	}

}
class AutoMorphic{
	static boolean detectAutoMorphic(int n){
		int square=n*n;
		while(n!=0) {
		if(n%10!=square%10) {
			return false;
		}
		n=n/10;
		square=square/10;
	}
		return true;
	}
}
