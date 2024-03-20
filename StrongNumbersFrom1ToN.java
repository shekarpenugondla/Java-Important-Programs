
	
	package com.important.program;

	import java.util.Scanner;

	public class StrongNumbersFrom1ToN {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter therange of to display all a Strong numubers number");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			int count=0;
			Strong strong=new Strong();
			for(int i=num1;i<=num2;i++) {
				boolean m=strong.detectStrong(i);
			if(m==true) {
				System.out.println(i+"is strong number");
				count++;
			}
			
			
			}
			System.out.println("there are "+count+"number of strong numbers+"+
					"are the in the range of"+num1+"and"+num2+":");
			
		}
	}
class StrongNumbers{
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

