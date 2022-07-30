package com.AssignmentNo_1;
//3.Write a program to swap two numbers
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("The number before swapping are, num1="+num1+" & num2 ="+num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("The numbers after swapping are, num1="+num1+" & num2 ="+num2);	
	}
}
