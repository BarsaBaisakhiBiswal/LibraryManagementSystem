package LibraryManagement.BookSale.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import LibraryManagement.BookSale.entity.Book;
import LibraryManagement.BookSale.service.SaleBookService;

@Controller
@RequestMapping("/bookWeb")
public class BookSaleController {
	@Autowired
	private SaleBookService saleBookService;
	
	
	@RequestMapping("/")
	public String dashBoard(Model model) {
		List<Book> bookList = saleBookService.getAllBooks();
		model.addAttribute("book", bookList);
		return "Dashboard";
	}
	
	@RequestMapping("/saveData")
	public String saveData(@ModelAttribute Book book,Model model) {
		String msg = saleBookService.saveData(book);
		
		model.addAttribute("valid",msg);
		if(msg.equals("Book Not Available")) {
			List<Book> bookList = saleBookService.getAllBooks();
			model.addAttribute("book", bookList);
			return "Dashboard";
		}
		return "redirect:/bookWeb/";
	}

}
