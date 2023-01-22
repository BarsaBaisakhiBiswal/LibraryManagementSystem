package LibraryManagement.BookSale.service;

import java.util.List;

import LibraryManagement.BookSale.entity.Book;

public interface SaleBookService {

	List<Book> getAllBooks();

	String saveData(Book book);

}
