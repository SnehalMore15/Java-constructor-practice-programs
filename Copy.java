package com.Test;

import java.util.Scanner;

public class Copy {
	String name;
	int age;

	public Copy(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Copy(Copy c) {
		name = c.name;
		age = c.age;

	}

	public static void main(String[] args) {
		Copy c1 = new Copy("raj", 21);
		Copy c2 = new Copy(c1);
		System.out.println("name: " + c2.name);
		System.out.println("age: " + c2.age);

	}

}
