package LibraryManagement.BookSale.entity;

import java.io.Serializable;

public class Sale implements Serializable{
	
	private Integer saleId;
	
	private Integer bookId;
	
	private String bookName;
	
	private String authorName;
	
	private Integer quantity;

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

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
		return "Sale [saleId=" + saleId + ", bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}

}
