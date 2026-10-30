package com.Test;

public class Product {
	private double price;

	public void setPrice(double price) {
		this.price = price;
	}

	public double getprice() {
		return price;

	}

	public double getDiscount() {
		return price * 10 / 100;
	}

}
