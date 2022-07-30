package com.AssignmentNo_1;
//9.Write a  program to find sum of all even and odd numbers between 1 to n. 
import java.util.Scanner;
public class SumOddEven {
public static void main(String[] args) {
		int sumeven=0,sumodd=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter n'th value : ");
		int n =sc.nextInt() ;
			for(int  i=0;i<=n;i++) {
			if(i%2==0)
		{
			sumeven=sumeven+i;
		}
	}
		System.out.println("Sum of even no is : "+sumeven);
		for (int i=0;i<=n;i++) {
			if(i%2!=0)
			{sumodd=sumodd+i;
				}
	}
		System.out.println("Sum of odd no is : "+sumodd);
	}
}
	
