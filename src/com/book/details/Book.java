package com.book.details;

import java.math.BigDecimal;
import java.util.Arrays;

public class Book implements Cloneable {
	private int id;
	private String name;
	private Author[] authors;
	private Publisher publisher;
	private int publishingYear;
	private int amountOfPages;
	private BigDecimal price;
	private CoverType coverType;

	public Book(int id, String name, Author[] authors, Publisher publisher,
			int publishingYear, int amountOfPages, BigDecimal price,
			CoverType covertype) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = covertype;
	}

	public Author[] getAuthors() {
		return Arrays.copyOf(authors, authors.length);
	}

	@Override
	protected Publisher clone() throws CloneNotSupportedException {
		return (Publisher) super.clone();
	}

	public Publisher getPublisher() {
		Publisher copyPublisher = new Publisher(publisher.getId(),
				publisher.getPublisherName());
		return copyPublisher;
	}

	public String getName() {
		return name;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors="
				+ Arrays.toString(authors) + ", publisher=" + publisher
				+ ", publishingYear=" + publishingYear + ", amountOfPages="
				+ amountOfPages + ", price=" + price + ", coverType="
				+ coverType + "]";
	}

}
