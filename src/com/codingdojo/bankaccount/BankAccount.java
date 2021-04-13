package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	String accountNumber;
	double checkingAccount;
	double savingsAccount;

	private static int numberOfAccounts = 0;
	private static int accountBalance = 0;

	public BankAccount() {
		this.accountNumber = randAccountNum();
		this.checkingAccount = 0.0;
		this.savingsAccount = 0.0;
		numberOfAccounts++;
	}

	private static String randAccountNum() {
		Random random = new Random();
		String output = "";
		for (int i = 0; i <= 10; i++) {
			output += String.valueOf(random.nextInt(10));
		}
		return output;
	}

	public void depositMoney(Double amount, String accountType) {
		if (accountType.equals("checking")) {
			this.setCheckingAccount(this.getCheckingAccount() + amount);
			System.out.println(" \n $" + amount + " was deposited into your checking account. Your balance is: " + this.getCheckingAccount());
		} 
		else if (accountType.equals("savings")) {
			this.setCheckingAccount(this.getCheckingAccount() + amount);
			System.out.println(" \n $" + amount + " was deposited into your savings account. Your balance is: " + this.getCheckingAccount());
		}

	}

	public static void checkAccountBalance() {
		System.out.println(accountBalance);
	}

	public void withdrawMoney(Double amount, String accountType) {
		if (accountType.equals("checking")) {
			if (this.getCheckingAccount() != 0.0) {
				this.setCheckingAccount(this.getCheckingAccount() - amount);
				System.out.println(" \n $" + amount + " was withrawn from your checking account. Your balance is: " + this.getCheckingAccount());
			}
			else {
				System.out.println(" \n Insufficient funds.");
			}
		}
		else if (accountType.equals("savings")) {
			if (this.getCheckingAccount() != 0.0) {
				this.setCheckingAccount(this.getCheckingAccount() - amount);
				System.out.println(" \n $" + amount + " was withdrawn from your savings account. Your balance is: " + this.getCheckingAccount());
			}
			else {
				System.out.println(" \n Insufficient funds.");
			}
		}

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(double checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

	public double getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(double savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}

	public static int getAccountBalance() {
		return accountBalance;
	}

	public static void setAccountBalance(int accountBalance) {
		BankAccount.accountBalance = accountBalance;
	}

}
