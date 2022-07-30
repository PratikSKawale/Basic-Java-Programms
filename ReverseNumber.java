package com.AssignmentNo_1;
import java.util.Scanner;

//10: Write a  program to enter a number and print its reverse
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number :  ");
		int num = sc.nextInt();
		
		 System.out.println("The entered number is : "+num);
		int rev = 0;  
		while(num != 0)   
		{  
		int remainder = num % 10;  
		rev = rev * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
		}  
	

	}


