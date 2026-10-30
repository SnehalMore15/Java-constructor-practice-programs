package com.Test;

import java.util.Scanner;

class Stud {
	private String name;
	private int marks;

	public Stud(String n, int m) {
		name = n;
		marks = m;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	public String getGrade() {
		if (marks >= 75) {
			return "A";
		} else if (marks >= 60) {
			return "B";
		} else if (marks >= 35) {
			return "C";
		} else {
			return "Fail";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name: ");
		String n = sc.nextLine();

		System.out.print("Enter marks: ");
		int m = sc.nextInt();

		Stud s = new Stud(n, m);

		System.out.println("Name = " + s.getName());
		System.out.println("Marks = " + s.getMarks());
		System.out.println("Grade = " + s.getGrade());

		sc.close();
	}
}
