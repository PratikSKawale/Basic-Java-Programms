package com.AssignmentNo_1;

//11:Write a  program to print all Prime numbers between 1 to n.
import java.util.Scanner;
public class AllPrimeNumber {
	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				int a=0, b, i, j, flag;
				System.out.printf("Enter Last number of series : ");
				b = sc.nextInt();
				System.out.printf("Prime numbers in the nnumber  series are: ");

				for (i = a; i <= b; i++) {
					if (i == 1 || i == 0)
						continue;
					flag = 1;

					for (j = 2; j <= i / 2; ++j) {
						if (i % j == 0) {
							flag = 0;
							break;
						}
					}
					if (flag == 1)
						System.out.println(i);
				}
			}
		}

	
	