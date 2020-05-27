package com.bookstore;

final class Book {

	Book(String name, double price, int noOfCopies) {
		this.name = name;
		this.price = price;
		this.noOfCopies = noOfCopies;
	}

	String getName() {
		return this.name;
	}

	int getNoOfCopies() {
		return this.noOfCopies;
	}

	void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	

	@Override
	public String toString() {
		return "Book:" + name + ", price=" + price + ", noOfCopies=" + noOfCopies;
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
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
	private String name;
	private double price;
	private int noOfCopies;
}
