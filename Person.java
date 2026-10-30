package com.Test;

import java.util.*;

public class Person {
	int age;

	public Person() {
		age = 18;

	}

	public Person(int a) {
		age = a;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person p1 = new Person();
		System.out.println("Default age: " + p1.age);
		System.out.println("Enter age: ");
		int a = sc.nextInt();
		Person p2 = new Person(a);
		System.out.println("Entered age " + p2.age);
		sc.close();

	}
}
