package com.Fleetstudio.Testcases;

import java.util.Scanner;


//It should be greater > 1

//It should be divisible by itself and 1


public class PrimeNumber {

	public static void main(String[] args) {
		
	
		 int num=29; // checking the number is prime or not
		int count=0;
			
		if(num>1) {
			
			for(int i=1; i<=num;i++ ) {
				
				if(num%i == 0) {
					count++;
					
				}
			}
			
			if(count==2) {
				System.out.println("prime number");
				
			
			}else
			{
				System.out.println("Not a prime number");
			}
		}else
		{
			System.out.println("Not a prime number");	
		}
		
		
	}
	
	
	
}
