package com.AssignmentNo_1;
//7:  Sum of series : 1+2+3+….+n
import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter last number in series :  ");
		int num=sc.nextInt();
		int sum=0;
		for (int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}

}
