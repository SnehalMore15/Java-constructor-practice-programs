package com.Test;

public class BankAccount {
	private double balance;

	public void setbalance(double amount) {
		balance = amount;
	}

	public void deposit(double amount) {
		balance = balance + amount;

	}

	public void withdraw(double amount) {
		balance = balance - amount;

	}

	public double getbalance() {
		return balance;
	}

}
