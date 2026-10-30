package com.Test;

public class LibraryBook {
	private int bookId;
	private String title;
	private String author;

	LibraryBook(int id, String t, String a) {
		bookId = id;
		title = t;
		author = a;
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void display() {
		System.out.println("Book ID: " + getBookId());
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println();
	}

	public static void main(String[] args) {
		LibraryBook b1 = new LibraryBook(101, "Java", "James");
		LibraryBook b2 = new LibraryBook(102, "Python", "Guido");
		LibraryBook b3 = new LibraryBook(103, "C Programming", "Dennis");

		b1.display();
		b2.display();
		b3.display();
	}
}
