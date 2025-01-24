package com.book.service;


import com.book.details.Author;
import com.book.details.Book;
import com.book.details.Publisher;

public interface search{

	default void SearchBooksByAuthor(Author author, Book[] books) {

		boolean notfound = true;
		for (int i = 0; i < books.length; i++) {
			for (int j = 0; j < books[i].getAuthors().length; j++) {
				String frstn = books[i].getAuthors()[j].getFirstName();
				String lasttn = books[i].getAuthors()[j].getLastName();

				if (frstn == author.getFirstName()
						& lasttn == author.getLastName()) {
					notfound = false;
					System.out.println(books[i].getAuthors()[j].toString());
				}
			}
		}
		if (notfound) {
			System.out.println("that particular book is not in the DataBase");
		}

	}

	default void SearchBooksByPublisher(Publisher publisher, Book[] books,int id) {

		boolean notfound = true;
		for (int i = 0; i < books.length; i++) {

			String frstn = books[i].getPublisher().getPublisherName();
			if (frstn == publisher.getPublisherName()&&id==books[i].getPublisher().getId()) {
				notfound = false;
				System.out.println(books[i].getPublisher());

			}
		}

		if (notfound) {
			System.out.println(
					"that particular publisher  is not in the DataBase");
		}
	}

	default void SearchBooksAfterSpecifiedYear(int yearFromInclusively,
			Book[] books) {

		boolean notfound = true;
		for (int i = 0; i < books.length; i++) {

			int frstn = books[i].getPublishingYear();
			if (frstn >= yearFromInclusively) {
				notfound = false;
				System.out.println(books[i].getName() + "\t"
						+ books[i].getPublishingYear());

			}
		}

		if (notfound) {
			System.out.println(
					"that particular publisheryear  is not in the DataBase");
		}

	}

}
