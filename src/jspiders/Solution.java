package jspiders;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank bank=new BankImpl(5000);
		while(true) {
		
		

			System.out.println("1:Deposit amount\n2:withdraw amount");
			System.out.println("3:Check balance\n4:Exit");
			System.out.println("Enter choice"); 
			int choice=sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter amount to be deposited");
				int amountdeposit=sc.nextInt();
				bank.deposit(amountdeposit);
				//			bank.deposit(sc.nextint());
				break;
			case 2:
				System.out.println("Enter amount to be withdrawn");
				int amountwithdrawn=sc.nextInt();
				bank.withdraw(amountwithdrawn);
				//			bank.withdrawn(sc.nextInt());
				break;
			case 3:
				System.out.println( "available balance"+bank.getBalance());
				break;

			case 4:
				System.out.println("thank you!");
				System.exit(0);

			default: System.out.println(bank.displayErrorMessage());


			}
			System.out.println("---------------");
		}

	}
}