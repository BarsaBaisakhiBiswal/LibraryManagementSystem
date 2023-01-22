package LibraryManagement.BookFetch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import LibraryManagement.BookFetch.entity.BookEntity;
import LibraryManagement.BookFetch.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	
	@Override
	public List<BookEntity> getAllBooks() {
		List<BookEntity> bookList = new ArrayList<>();
		try {
			bookList = bookRepository.findAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}

	@Override
	public BookEntity getBookByBookId(Integer bookId) {
		return bookRepository.findById(bookId).get();
	

	}

}
