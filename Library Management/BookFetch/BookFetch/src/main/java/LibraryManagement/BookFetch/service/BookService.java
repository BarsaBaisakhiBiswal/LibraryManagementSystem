package LibraryManagement.BookFetch.service;

import java.util.List;

import LibraryManagement.BookFetch.entity.BookEntity;

public interface BookService {

	public List<BookEntity> getAllBooks();
	

	public BookEntity getBookByBookId(Integer bookId) ;
	

}
