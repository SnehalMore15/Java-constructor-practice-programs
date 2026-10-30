package com.Test;

import java.util.Scanner;

public class Emp {

	private double salary;

	public Emp(double s) {
		salary = s;
	}

	public double getSalary() {
		return salary;
	}

	public void incrementSalary() {
		salary = salary + (salary * 10 / 100);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter salary: ");
		double s = sc.nextDouble();

		Emp e = new Emp(s);

		System.out.println("Old Salary = " + e.getSalary());

		e.incrementSalary();

		System.out.println("New Salary = " + e.getSalary());
		sc.close();
	}
}
