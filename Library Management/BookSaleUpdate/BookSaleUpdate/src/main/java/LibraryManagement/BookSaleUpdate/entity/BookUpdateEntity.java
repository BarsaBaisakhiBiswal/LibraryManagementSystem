package LibraryManagement.BookSaleUpdate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="book_ms")
@Entity
public class BookUpdateEntity {
	
	@Id
	@Column(name = "book_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	
	@Column(name = "book_Name")
	private String bookName;
	
	
	@Column(name = "author_Name")
	private String authorName;
	
	@Column(name="quantity")
	private Integer quantity;
	
	public Integer getBookId() {
		return bookId;
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

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "BookUpdateEntity [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", quantity=" + quantity + "]";
	}

}
