package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount();
		BankAccount acct2 = new BankAccount();
		BankAccount acct3 = new BankAccount();
		BankAccount acct4 = new BankAccount();
		
		acct1.withdrawMoney(20.0, "checking");
		acct1.depositMoney(50.0, "checking");
		acct1.withdrawMoney(20.0, "checking");
		
		acct2.depositMoney(100.0, "savings");
//		
		acct3.depositMoney(50.0, "savings");
		acct3.depositMoney(500.0, "checking");
		acct3.withdrawMoney(50.0, "checking");
		
		acct4.withdrawMoney(100.0, "checking");
		
		
		System.out.println("We have " + BankAccount.getNumberOfAccounts() + " bank accounts so far.");
		
		
	}
}
