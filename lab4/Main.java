package com.example.ooplab4;

public class Main {

	public static void main(String args[]) {
		BankAccount b1 = new BankAccount();
		b1.setAccountNumber("ABCD123");
		b1.setBalance(10000.519);
		System.out.println("Account Number: "+b1.getAccountNumber());
		System.out.println("Balance: "+b1.getBalance());
		
		System.out.println("\n\nTask 2:");
		BankAccount2 b2=new BankAccount2("Maishan Nadis","118","20/04/1969");
		b2.showDetails();
		b2.deposit(20000);
		b2.withdraw(10000);
		b2.deposit(5000);
		b2.showDetails();
	}

}
