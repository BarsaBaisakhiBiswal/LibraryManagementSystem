package LibraryManagement.BookSaleUpdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import LibraryManagement.BookSaleUpdate.entity.BookUpdateEntity;
import LibraryManagement.BookSaleUpdate.service.BookUpdateService;

@RestController
public class BookUpdateController {
	@Autowired
	private BookUpdateService bookUpdateService;

	@RequestMapping("/updateBook")
	public BookUpdateEntity getAllBooks(@RequestBody BookUpdateEntity bookEntity) {
		BookUpdateEntity book = new BookUpdateEntity();
		try {
			book =  bookUpdateService.save(bookEntity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
}
