package entities;

import java.util.Date;

import entities.Enum.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status) {
		//super();
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public void addItem(OrdemItem item) {
		
	}

}
