package com.AssignmentNo_1;
//13:Write a program to find greatest of three numbers using nested if-else.
import java.util.Scanner;
public class CalculateGreatestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		System.out.println("Enter num3 : ");
		int num3=sc.nextInt();
		if(num1>num2 & num1>num3)
			System.out.println("The greatest among the number is num1 : "+num1);
		else if(num2>num1 & num2>num3)
			System.out.println("The greatest among the number is num2 : "+num2);
		else
			System.out.println("The greatest among the number is num3 : "+num3);

	}

}
