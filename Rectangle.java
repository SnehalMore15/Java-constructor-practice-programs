package com.Test;

import java.util.Scanner;

public class Rectangle {

	int length;
	int width;

	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}

	int getArea() {
		return length * width;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length: ");
		int l = sc.nextInt();

		System.out.print("Enter width: ");
		int w = sc.nextInt();

		Rectangle r = new Rectangle(l, w);

		System.out.println("Area = " + r.getArea());
		sc.close();
	}
}
