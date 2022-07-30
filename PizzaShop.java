package com.AssignmentNo_1;  //14:Create menu driven program for Pizza Shop.And display total amount,
import java.util.Scanner;
public class PizzaShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Dominos\nWe are happy to Serve you");
		System.out.println("Select your choice from the following menu: ");
		System.out.println("1.Margherita\n2.Double Cheese Margherita\n3.Mexican Green Wave.");
		System.out.println("4.Veg Extravaganza\n5.Cheese n Corn \n6.Pepper Barbecue Chicken");
		System.out.println("7.Exit");
		int i = sc.nextInt();
		double bill = 0;
		switch (i) {
		case 1:
			System.out.println("Thank you , you have oerderd Margherita ");
			bill = bill + 99;
			break;
		case 2:
			System.out.println("Thank you , you have oerderd Double Cheese Margherita ");
			bill = bill + 185;
			break;
		case 3:
			System.out.println("Thank you , you have oerderd Mexican Green Wave ");
			bill = bill + 215;
			break;
		case 4:
			System.out.println("Thank you , you have oerderd Veg Extravaganza ");
			bill = bill + 235;
		case 5:
			System.out.println("Thank you , you have oerderd Cheese n Corn  ");
			bill = bill + 165;
			break;
		case 6:
			System.out.println("Thank you , you have oerderd Pepper Barbecue Chicken  ");
			bill = bill + 185;
			break;
		case 7:
			System.exit(0);
			break;
		default:
			System.out.println("Sorry Invalid Input\nPlease select correct option from above menu only");}
		System.out.println("Your bill amount is :" + bill);

	}

}
