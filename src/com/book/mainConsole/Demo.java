package com.book.mainConsole;

import java.math.BigDecimal;

import com.book.details.Author;
import com.book.details.Book;
import com.book.details.CoverType;
import com.book.details.Publisher;
import com.book.service.BookService;
import com.book.service.Filter;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] books = new Book[] {
				new Book(1, "Book_1",
						new Author[] { new Author(1, "Jon", "Johnson") },
						new Publisher(1, "Publisher_10"), 1990, 231,
						BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

				new Book(2, "Book_2",
						new Author[] { new Author(1, "Walter", "Peterson"),
								new Author(2, "William", "Wilson") },
						new Publisher(2, "Publisher_22223"), 2000, 120,
						BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

				new Book(3, "Book_3",
						new Author[] { new Author(2, "Walter", "Peterson") },
						new Publisher(1, "Publisher_1"), 1997, 350,
						BigDecimal.valueOf(34.99), CoverType.HARDCOVER),

				new Book(4, "Book_4",
						new Author[] { new Author(3, "Walter", "Peterson") },
						new Publisher(3, "Publisher_22223"), 1992, 185,
						BigDecimal.valueOf(19.99), CoverType.PAPERBACK) };
		Author a1 = new Author(4, "Craig", "Gregory");
		BookService bService = new BookService();
//		bService.SearchBooksByAuthor(a1, books);
//		bService.SearchBooksByPublisher(new Publisher(1, "Publisher_22223"), books);
//		bService.SearchBooksAfterSpecifiedYear(1990, books);

bService.filterbyAuthor(new Author(3, "Walter", "Peterson"), books);
bService.FilterBooksByPublisher(new Publisher(1, "Publisher_22223"), books);

	}

}
