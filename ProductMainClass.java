package com.Test;

public class ProductMainClass {
	public static void main(String[] args) {
		Product p = new Product();
		p.setPrice(1000);

		System.out.println(p.getprice());
		System.out.println(p.getDiscount());
		System.out.println(p.getprice() - p.getDiscount());

	}

}
