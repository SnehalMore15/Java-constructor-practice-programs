package com.Test;

import java.util.Scanner;

public class Mobile {
	private String brand;
	private double price;

	public Mobile(String b, double p) {
		brand = b;
		price = p;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void setBrand(String b) {
		brand = b;
	}

	public void setPrice(double p) {
		price = p;
	}

	public double getDiscount() {
		return price * 10 / 100;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter brand: ");
		String b = sc.nextLine();

		System.out.print("Enter price: ");
		double p = sc.nextDouble();

		Mobile m = new Mobile(b, p);

		System.out.println("Brand = " + m.getBrand());
		System.out.println("Price = " + m.getPrice());
		System.out.println("Discount = " + m.getDiscount());

		System.out.print("Enter updated price: ");
		double updatedPrice = sc.nextDouble();

		m.setPrice(updatedPrice);

		System.out.println("Updated Price = " + m.getPrice());
		sc.close();
	}
}
