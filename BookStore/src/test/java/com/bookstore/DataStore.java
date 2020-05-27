package com.bookstore;

import java.util.Arrays;
import java.util.List;

final class DataStore {

	static List<Book> initialInventory() {		
		return  Arrays.asList(new Book[]{   new Book("Test driven development", 500.00, 2), 
											new Book("Java Complete Reference", 600.00, 3),
											new Book("Thinking in Java", 800.00, 4),
											new Book("Head First Design Pattern", 400.00, 5),
											new Book("Object Oriented Programing", 1500.00, 10)});	
	}	
		
	static List<Book> getDeliveriesMondayMorning() {
		return Arrays.asList( new Book[]  { new Book("Python Complete reference", 500.00, 3), 
											new Book("Test driven development", 500.00, 1),
											new Book("C++ Complete reference", 600.00, 3),				
											new Book("C Complete reference", 1500.00, 5)});
	}
	
	static List<Book> bookRequestedByAnmol() {		
		return Arrays.asList( new Book[]  { new Book("Python Complete reference", 500.00, 1), 
											new Book("C++ Complete reference", 600.00, 1),				
											new Book("Head First Design Pattern", 400.00, 1),
											new Book("Object Oriented Programing", 1500.00, 2)});
	}

	static List<Book> bookRequestedBySanthosha() {		
		return Arrays.asList( new Book[]  { new Book("Test driven development", 500.00, 1), 
											new Book("Java Complete Reference", 600.00, 1),
											new Book("Thinking in Java", 800.00, 2),
											new Book("C++ Complete reference", 600.00, 1),				
											new Book("C Complete reference", 1500.00, 1)});
	}
	
	static List<Book> bookRequestedBySamudra() {		
		return Arrays.asList( new Book[]  { new Book("Python Complete reference", 500.00, 1), 
											new Book("C++ Complete reference", 600.00, 1),				
											new Book("Head First Design Pattern", 400.00, 1),
											new Book("Test driven development", 500.00, 1), 
											new Book("Java Complete Reference", 600.00, 1),
											new Book("Thinking in Java", 800.00, 2),
											new Book("C Complete reference", 1500.00, 1),
											new Book("Object Oriented Programing", 1500.00, 2)});
	}

	public static List<Book> getDeliveriesMondayEvening() {
		return Arrays.asList( new Book[]  { new Book("Physics", 500.00, 20), 
											new Book("Chemistry", 600.00, 10),
											new Book("Biology", 800.00, 25),
											new Book("Statastics", 600.00, 5),				
											new Book("C Complete reference", 1500.00, 9)});
	}

	public static List<Book> bookRequestedBySidharth() {
		return Arrays.asList( new Book[]  { new Book("Physics", 500.00, 1), 
											new Book("Head First Design Pattern", 600.00, 1),
											new Book("Biology", 800.00, 2),
											new Book("Thinking in Java", 600.00, 1),				
											new Book("C Complete reference", 1500.00, 1)});
	}
	
}
