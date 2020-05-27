package com.bookstore;

import java.util.LinkedList;
import java.util.List;

final class Customer {
	
	public Customer(String name) {
		this.name = name;
	}

	List<Book> getRequestedBooks() {
		return this.requestedBooks;
	}

	List<Book> getDeliveredBooks() {
		return this.gotBooks;
	}
	public Customer requestBooks(List<Book> books) {
		this.requestedBooks.addAll(books);
		return this;
	}
	
	
	@Override
	public String toString() {
		return "Customer: " + name + "\nBooks requested are\n" + requestedBooks + ", \nBooks got are\n" + gotBooks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	private String name;
	private List<Book> requestedBooks = new LinkedList<>();
	private List<Book> gotBooks = new LinkedList<>();
	

}
