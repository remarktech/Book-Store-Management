package com.bookstore;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class BookInventory {

	boolean isExists(Book book) {
		return this.books.contains(book);
	}

	void display() {
		System.out.println("\nBooks Available in Inventory: \n" + this.books);
	}
	
	BookInventory add(Book book) {
		incrementNoOfCopies(book);		
		if (!isExists(book)) {
			this.books.add(book);
		}
		return this;
	}	
	
	BookInventory addAll(List<Book> books) { //Name should be store
		
		System.out.println("Inventory updated\n");
		for (Book book : books) {
			add(book);
		}
		display();
		return this;
	}

	void remove(Book book) {
		decrementNoOfCopies(book);
		if (isExists(book)) {				
			Iterator<Book> bookIterator = this.books.iterator();
			while(bookIterator.hasNext()) {
				Book existingBook = bookIterator.next();
				if(existingBook.getName().equals(book.getName()) && existingBook.getNoOfCopies()==0) {
					bookIterator.remove();
					break;
				}
			}
		}		
	}

	private void decrementNoOfCopies(Book book) {
		if (isExists(book)) {
			for (Book existingBook : this.books) {
				if (book.equals(existingBook)) {
					existingBook.setNoOfCopies(existingBook.getNoOfCopies() - book.getNoOfCopies());
					break;
				}
			}	
		}		
	}
	
	private void incrementNoOfCopies(Book book) {
		if (isExists(book))  {
			for (Book existingBook : this.books) {
				if (book.equals(existingBook)) {
					existingBook.setNoOfCopies(existingBook.getNoOfCopies() + book.getNoOfCopies());
					break;
				}
			}
		}
	}	

	private List<Book> books = new LinkedList<>();

}
