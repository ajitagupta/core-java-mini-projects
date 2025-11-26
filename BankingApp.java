package com.feb18;

import java.util.Scanner;

class BankDetails {
	private String accno;
	private String name;
	private String acc_type;
	private long balance;
	Scanner sc = new Scanner(System.in);

	// method to get loan(Made By Mainak Das)
	public void getLoanFromBank(){
		long amt;
		System.out.print("How much loan do you wanted to take : ");
		amt = sc.nextLong();
		if (this.balance<150000 && amt>1000000){
			System.out.println("Since, you are not eligible for loan of amount : "+amt);
		}
		else if(amt>500000 && this.balance<30000){
			System.out.println("Since, you are not eligible for loan of amount : "+amt);
		}
		else{
			System.out.println("You are eligible to take loan.... \nEnter Your Credentials Below ---- ");
			System.out.println("Enter Your Loan Type : ");
			String type=sc.next(); 
			System.out.println("Enter Your Full Name  :");
			String name=sc.nextLine();
			System.out.println("Enter Your Acount No : ");
			String accno=sc.next();
			System.out.println("Your Loan Imformations Are Given Below : ");
			
			System.out.println("-------- Loan Type : "+type+" -------- \nFull Name : "+name+"\nAccount NO. : "+accno+"\nLoan Amount : "+amt);
			System.out.println("## Verified By Your Bank ##");
			System.out.println("Congratulations..... Your Loan Request Have Successfully Granted.");
			System.out.println("Thanks For Using Our App.....");
		}
	}

	// method to open new account
	public void openAccount() {
		System.out.print("Enter Account No: ");
		accno = sc.next();
		System.out.print("Enter Account type: ");
		acc_type = sc.next();
		System.out.print("Enter Name: ");
		name = sc.next();
		System.out.print("Enter Balance: ");
		balance = sc.nextLong();
	}

	// method to display account details
	public void showAccount() {
		System.out.println("Name of account holder: " + name);
		System.out.println("Account no.: " + accno);
		System.out.println("Account type: " + acc_type);
		System.out.println("Balance: " + balance);
	}

	// method to deposit money
	public void deposit() {
		long amt;
		System.out.println("Enter the amount you want to deposit: ");
		amt = sc.nextLong();
		balance = balance + amt;
		System.out.println("After depositing money current balance is:" + balance);
	}

	// method to withdraw money
	public void withdrawal() {
		long amt;
		System.out.println("Enter the amount you want to withdraw: ");
		amt = sc.nextLong();
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Balance after withdrawal: " + balance);
		} else {
			System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
		}
	}

	// method to search an account number
	public boolean search(String ac_no) {
		if (accno.equals(ac_no)) {
			showAccount();
			return (true);
		}
		return (false);
	}
}// Bankdetails ended

public class BankingApp {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		// create initial accounts
		System.out.print("How many number of customers do you want to input? ");
		int n = sc.nextInt();
		BankDetails C[] = new BankDetails[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = new BankDetails();
			C[i].openAccount();
		}
		// loop runs until number 5 is not pressed to exit
		int ch;
		do {
			System.out.println("\n ***Banking System Application***");
			System.out.println(
					"1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < C.length; i++) {
					C[i].showAccount();
				}
				break;
			case 2:
				System.out.print("Enter account no. you want to search: ");
				String ac_no = sc.next();
				boolean found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 3:
				System.out.print("Enter Account no. : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 4:
				System.out.print("Enter Account No : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].withdrawal();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn't exist..!!");
				}
				break;
			case 5:
				System.out.println("See you soon...");
				break;
			}
		} while (ch != 5);
	}
}
