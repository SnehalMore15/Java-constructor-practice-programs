package com.Test;

public class Employee {
	private double salary;

	public void setSalary(double s) {
		if (s > 0) {
			salary = s;
		} else {
			System.out.println("Error");
		}
	}

	public double getSalary() {
		return salary;
	}
}
