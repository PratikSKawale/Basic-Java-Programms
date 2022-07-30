package com.AssignmentNo_1;
//5.Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter base value: ");
		int  base=sc.nextInt();
		System.out.println("Enter power factor: ");
		int exp=sc.nextInt();
		int pow=1;
		
		while(exp!=0) {
		pow=base*pow;
			exp--;
		}
		System.out.println("Result : "+pow);
	}

}
