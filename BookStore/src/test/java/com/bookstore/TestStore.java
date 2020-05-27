package com.bookstore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

final class TestStore {

	@BeforeAll
	static void setupBookStore() {
		System.out.println("Book store set up done!!!\n");
		bookStore.getInventory().addAll(DataStore.initialInventory());
	}
	
	@BeforeEach
	void openBookStore() {
		System.out.print("Book store opened: ");
	}
 
	@Test
	void monday() {		
			System.out.println("Monday\n");		
			
			bookStore.getDeliveries().push(DataStore.getDeliveriesMondayMorning());	
			
			bookStore.getInventory().addAll(bookStore.getDeliveries().popAll());
			
			bookStore.getQueue().enqueue(new Customer("Anmol")).requestBooks(DataStore.bookRequestedByAnmol());
			bookStore.getQueue().enqueue(new Customer("Santhosha")).requestBooks(DataStore.bookRequestedBySanthosha());			
			
			bookStore.serveCustomers();					
			
			bookStore.getDeliveries().push(DataStore.getDeliveriesMondayEvening());	
		
			
			bookStore.getQueue().enqueue(new Customer("Samudra")).requestBooks(DataStore.bookRequestedBySamudra());			
			bookStore.getQueue().enqueue(new Customer("Sidharth")).requestBooks(DataStore.bookRequestedBySidharth());	
			bookStore.getQueue().enqueue(new Customer("Pankaj")).requestBooks(DataStore.bookRequestedByAnmol());
			bookStore.getQueue().enqueue(new Customer("Shiril")).requestBooks(DataStore.bookRequestedBySidharth());
			bookStore.getQueue().enqueue(new Customer("Ashish")).requestBooks(DataStore.bookRequestedBySanthosha());
			bookStore.getQueue().enqueue(new Customer("Manoj")).requestBooks(DataStore.bookRequestedBySidharth());
			
			bookStore.serveCustomers();				
			
			bookStore.getQueue().enqueue(new Customer("Naidile")).requestBooks(DataStore.bookRequestedBySidharth());
			bookStore.getQueue().enqueue(new Customer("Naresh")).requestBooks(DataStore.bookRequestedBySamudra());
			bookStore.getQueue().enqueue(new Customer("Chandra")).requestBooks(DataStore.bookRequestedBySidharth());
			
	}

	@Test
	void tuesday() {		
			System.out.println("Tuesday\n");	
			bookStore.getInventory().addAll(bookStore.getDeliveries().popAll());
			bookStore.getQueue().enqueue(new Customer("Raj")).requestBooks(DataStore.bookRequestedBySidharth());
			bookStore.serveCustomers();	
	}
	
	@Test
	void wednesday() {		
			System.out.println("Wednesday\n");				
			bookStore.serveCustomers();				
	}
	
	@AfterEach
	void closeBookStore() {
		//bookStore.serveCustomers();		
		System.out.println("BookStore closed for the day");
		bookStore.display();
		
	}
	
	private static BookStore bookStore = new BookStore();
}
