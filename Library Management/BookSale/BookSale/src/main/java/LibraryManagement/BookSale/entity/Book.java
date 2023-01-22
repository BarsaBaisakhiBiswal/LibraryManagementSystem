package LibraryManagement.BookSale.entity;

import java.io.Serializable;
public class Book implements Serializable {

	
	private Integer bookId;
	
	
	private String bookName;
	
	
	
	private String authorName;
	
	
	private Integer quantity;


	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", quantity="
				+ quantity + "]";
	}
	
	
}
