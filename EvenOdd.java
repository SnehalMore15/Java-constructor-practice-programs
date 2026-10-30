package com.Test;

public class EvenOdd {
	public boolean isEven(int n) {
		return n % 2 == 0;

	}

	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		System.out.println(e.isEven(20));
		System.out.println(e.isEven(7));
	}

}
