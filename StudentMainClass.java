package com.Test;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(101);
		s.setname("Raj");

		System.out.println("Student Id is ----> " + s.getId());
		System.out.println("Student name is ----> " + s.getname());
	}

}
