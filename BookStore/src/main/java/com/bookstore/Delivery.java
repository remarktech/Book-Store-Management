package com.bookstore;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

final class Delivery {	
 
	Delivery push(Book book) {		
			books.add(book);		
			return this;
	}
	
	Delivery push(List<Book> books) {
			this.books.addAll(books);
			System.out.println("Books Delivered to BookStore are:");
			display();
			return this;
	}	

	boolean isExists(Book book) {
			return books.contains(book);
	}

	void display() {
		System.out.println("\nBook stack in deliveries "+books+"\n");		
	}
	
	Book pop(Book book) {		
		return books.poll();	
	}	

	List<Book> popAll() {
		System.out.println("Deliveries moved to inventory :");
		List<Book> deliveries = new LinkedList<>(books);		
		books.clear();		
		return deliveries;
	}
	
	private Deque<Book> books = new LinkedList<>();
}
