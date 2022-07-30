package com.AssignmentNo_1;
//4.Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120
import java.util.Scanner;
public class Factorial {

public static void main(String[] args) {
Scanner sc= new Scanner (System.in);
System.out.println("Enter a number to get Factorial:  ");
int num=sc.nextInt();
int fact=1;
for(int i=num;i>=1;i--)
{
	 fact = fact*i;
}
System.out.println("The factorial of "+num+" is : "+fact);
	}

}
