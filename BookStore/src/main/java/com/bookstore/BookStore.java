package com.bookstore;

final class BookStore {
	 
	public void display() {
		inventory.display();
		deliveries.display();
		queue.display();
		System.out.println();
	}
	
	public void serveCustomers() {	
		System.out.println("Serving customers in Queue\n");
		while(queue.isEmpty()) {
			serveCustomer(queue.dequeue());	
		}		
	}

	public Delivery getDeliveries() {			
		return this.deliveries;
	}


	public CustomerQueue getQueue() {		
		return this.queue;
	}

	public BookInventory getInventory() {		
		return this.inventory;
	}
	
	private void serveCustomer(Customer customer) {
		deliverBooks(customer);
	}

	private void deliverBooks(Customer customer) {
		for(Book requestedBook : customer.getRequestedBooks()) {
			deliverBook(customer, requestedBook);			
		}
		System.out.println(customer+"\n");
	}

	private void deliverBook(Customer customer, Book requestedBook) {
		if (inventory.isExists(requestedBook)) {
			inventory.remove(requestedBook);	
			customer.getDeliveredBooks().add(requestedBook);
		}
	}
	
	private BookInventory inventory = new BookInventory();
	private CustomerQueue  queue = new CustomerQueue();
	private Delivery  deliveries = new Delivery();
	
}
