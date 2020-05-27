package com.bookstore;

import java.util.LinkedList;
import java.util.Queue;

final class CustomerQueue { 
	
	public Customer enqueue(Customer customer) {
		customers.add(customer);
		return customer;
	}	

	public void display() {
		System.out.println("\nCustomers in Queue are \n"+customers);		
	}	

	public boolean isEmpty() {		// method name can be hasCustomer
		return !customers.isEmpty();
	}

	public Customer dequeue() {	 //method name can be nextCustomer	
		return customers.poll();
	}
	
	private Queue<Customer> customers = new LinkedList<>();

}
