package com.atm.simulation;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		//declare and initialize balance,withdraw and deposit
		int balance = 10000;
		int withdraw;
		int deposit;

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("**Automated Teller Machine**");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Balance Check");
			System.out.println("4.exit");
			System.out.println("Choose the operation you want to perform:");

			//get choice from the user
			int choice = sc.nextInt();

			switch (choice) {

			case 1: {

				System.out.println("Enter money to be withdrawn:");
				//get withdrawl money from the user
				withdraw = sc.nextInt();
				
				// check whether the balance is greater than or equal to the withdrawal amount
				if(balance >= withdraw) {
					
					// remove the withdrawl amount from the total balance	
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					
					//display error message
					System.out.println("Insufficient Money");
				}
				System.out.println("");
				break;
			}
			case 2: {

				System.out.println("Enter money to be deposited:");
				// get deposit amount from the user
				deposit = sc.nextInt();
				
				//add deposit money to the balance
				balance = balance + deposit;
				
				System.out.println("Your money has been Successfully Deposited");
				System.out.println("");
				break;
			}
			case 3: {

				//display the total user balance
				System.out.println("Balance: " + balance);
				System.out.println("");
				break;
			}
			case 4:{
				
				//exit from the menu
				System.exit(0);
			}

			default:
				System.out.println("Invalid Choice, please choose from the given choices");
				System.out.println();
			}
		}
	}
}
