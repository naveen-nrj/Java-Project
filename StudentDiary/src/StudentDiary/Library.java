package StudentDiary;

import java.util.Scanner;

public class Library {
	public String book;
	public String author;
	

	public Library() {
		book = "";
		author = "";
	}
	
	public Library(String book, String author ) {
		this.book = book;
		this.author = author;
	}
	
	public void bookdetails( ) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of the book");
		book = s.next();
		System.out.println("enter the author of the book");
		author = s.next();
	}
	 public void printdetails( ) {
		 System.out.println("Name:" + book + "\n" + "author" + author + "\n");
	 }
}
