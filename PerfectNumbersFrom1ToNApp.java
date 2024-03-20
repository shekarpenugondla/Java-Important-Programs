package com.important.program;

import java.util.Scanner;

public class PerfectNumbersFrom1ToNApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the range to display all perfect numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int count=0;
        for(int i=num1;i<=num2;i++) {
        	int result = perfect(i);
        	
        	if(result==i) {
        		System.out.println(i);
        		count++;
        	}
        }
        System.out.println("the number of perfect numbers between "+num1+"and "+num2+"isare:"+count);
        	
        
	}
	static int perfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}return sum;
	}
}