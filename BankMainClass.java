package com.Test;

public class BankMainClass {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setbalance(1000);
		b.deposit(500);
		b.withdraw(200);

		System.out.println(b.getbalance());
	}

}
