package LibraryManagement.BookSale.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import LibraryManagement.BookSale.entity.Book;
import LibraryManagement.BookSale.entity.Sale;
@Service
public class SaleBookServiceImpl implements SaleBookService {

	@Value("${spring.application.url.getAllBooks}")
	String urlgetAllBooks;
	
	@Value("${spring.application.url.getBookById}")
	String urlgetBookById;
	
	@Value("${spring.application.url.updateBook}")
	String urlupdateBook;
	
	@Value("${spring.application.url.saveSale}")
	String saveSales;
	
	RestTemplate restTemplate = new RestTemplate();
	public static String msg = "";

	
	
	
	
	@Override
	public List<Book> getAllBooks() {
		ResponseEntity<Book[]> bookList  = restTemplate.getForEntity(urlgetAllBooks, Book[].class);
		Book books[] = bookList.getBody();
		List<Book> bookss = new ArrayList<>();
		for (Book book : books) {
			bookss.add(book);
		}
		return bookss;
	}

	@Override
	public String saveData(Book book) {
		Book bookSave = new Book();
		Sale sale = new Sale();
		ResponseEntity<Book> book_2 = restTemplate.getForEntity(urlgetBookById+book.getBookId(), Book.class);
		Book book_1 = book_2.getBody();
		bookSave.setBookId(book_1.getBookId());
		bookSave.setBookName(book_1.getBookName());
		if(book_1.getQuantity()-book.getQuantity()<=0) {
			return "Book Not Available";
		}
		bookSave.setQuantity(book_1.getQuantity()-book.getQuantity());
		bookSave.setAuthorName("Barsa");
		
		
		ResponseEntity<Book> update  = restTemplate.postForEntity(urlupdateBook, bookSave, Book.class);
		
		
		sale.setBookId(book_1.getBookId());
		sale.setBookName(book_1.getBookName());
		Integer qty = book.getQuantity();
		sale.setQuantity(qty);
		sale.setAuthorName("Barsa");
	    ResponseEntity<Sale> saveSale = restTemplate.postForEntity(saveSales, sale, Sale.class);
		
		
		
		return "Updated";
	}
	}


