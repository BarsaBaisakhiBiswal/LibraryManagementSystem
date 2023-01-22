package LibraryManagement.BookSaleUpdate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LibraryManagement.BookSaleUpdate.entity.BookUpdateEntity;
import LibraryManagement.BookSaleUpdate.repository.BookUpdateRepositiry;

@Service
public class BookUpdateServiceImpl implements BookUpdateService {
 @Autowired
 private BookUpdateRepositiry bookUpdateRepositiry;
 
@Override
public BookUpdateEntity save(BookUpdateEntity bookEntity) {
	 BookUpdateEntity book = new BookUpdateEntity();
		try {
			book = bookUpdateRepositiry.save(bookEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
}
}
