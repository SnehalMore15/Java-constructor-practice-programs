package com.Test;

import java.util.Scanner;

class Book {
	String title;
	double price;

	Book(String t, double p) {
		title = t;
		price = p;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter book title:");
		String title = sc.nextLine();

		System.out.println("Enter book price:");
		double price = sc.nextDouble();

		Book b = new Book(title, price);

		System.out.println("Book Title: " + b.title);
		System.out.println("Book Price: " + b.price);

		sc.close();
	}

}
