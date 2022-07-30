package com.AssignmentNo_1;
//8.Check whether the number is palindrome or not?
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int rem, sum=0,num;		
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a  number : ");
	num=sc.nextInt();
		int  temp=num;    
		  while(num>0){    
		   rem=num%10;  //getting remainder  
		   sum=(sum*10)+rem;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(" Its a palindrome number ");    
		  else    
		   System.out.println("Its not a palindrome number");    
	}

	}


