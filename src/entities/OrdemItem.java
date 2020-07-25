package entities;

public class OrdemItem {
	
	private Integer quantity;
	private Double price;
	
	public OrdemItem() {
		
	}

	public OrdemItem(Integer quantity, Double price) {
		//super();
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public Double subTotal() {
		
	}
	

}
