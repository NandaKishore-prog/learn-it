package com.book.service;

import java.util.ArrayList;

import com.book.details.Author;
import com.book.details.Book;
import com.book.details.Publisher;

public interface Filter {
	default void filterbyAuthor(Author author, Book[] books) {
		boolean notfound = true;
		for (int i = 0; i < books.length; i++) {
			for (int j = 0; j < books[i].getAuthors().length; j++) {
				String frstn = books[i].getAuthors()[j].getFirstName();
				String lasttn = books[i].getAuthors()[j].getLastName();

				if (frstn == author.getFirstName()
						& lasttn == author.getLastName()) {
					notfound = false;
					System.out.println(books[i].toString());
				}
			}
		}
		if (notfound) {
			System.out.println("that particular book is not in the DataBase");
		}

	}
	default void FilterBooksByPublisher(Publisher publisher, Book[] books) {

		boolean notfound = true;
		for (int i = 0; i < books.length; i++) {

			String frstn = books[i].getPublisher().getPublisherName();
			if (frstn == publisher.getPublisherName()) {
				notfound = false;
				System.out.println(books[i].getPublisher());

			}
		}

		if (notfound) {
			System.out.println(
					"that particular publisher  is not in the DataBase");
		}
	}

}
