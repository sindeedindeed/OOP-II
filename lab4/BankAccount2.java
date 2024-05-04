package com.example.ooplab4;

public class BankAccount2 {
	private String accountNumber,accountName,dob;
	private double balance;
	public BankAccount2(String accountName,String accountNumber,String dob) {
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.dob=dob;
		balance=0;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	public void showDetails() {
		System.out.println("\nName: "+accountName+"\nNumber: "+accountNumber+"\nDOB: "+dob+"\nBalance: "+balance);	
	}
}
