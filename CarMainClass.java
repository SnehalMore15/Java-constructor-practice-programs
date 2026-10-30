package com.Test;

public class CarMainClass {
	public static void main(String[] args) {
		Car c = new Car();

		c.setBrand("Tata");
		c.setPrice(800000);

		System.out.println(c.getBrand());
		System.out.println(c.getPrice());

	}
}