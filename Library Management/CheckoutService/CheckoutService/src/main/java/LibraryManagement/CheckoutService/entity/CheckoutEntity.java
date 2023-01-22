package LibraryManagement.CheckoutService.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="checkout_ms")
@Entity
public class CheckoutEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "checkout_id")
	private Integer checkoutId;
	
	@Column(name = "book_id")
	private Integer bookId;
	
	@Column(name = "quantity")
	private Integer quantity;

	public Integer getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(Integer checkoutId) {
		this.checkoutId = checkoutId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CheckoutEntity [checkoutId=" + checkoutId + ", bookId=" + bookId + ", quantity=" + quantity + "]";
	}
	
	

}
