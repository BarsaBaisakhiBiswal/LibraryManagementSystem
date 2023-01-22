package LibraryManagement.BookFetch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import LibraryManagement.BookFetch.entity.BookEntity;
import LibraryManagement.BookFetch.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/getAllBooks")
	public List<BookEntity> getAllBooks() {
		List<BookEntity>  bookList = new ArrayList<>();
		try {
			bookList = bookService.getAllBooks();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
	@RequestMapping("/getBookByBookId/{bookId}")
	public BookEntity getBookByBookId(@PathVariable Integer bookId) {
		
		return bookService.getBookByBookId(bookId);
		
	}
	

}
