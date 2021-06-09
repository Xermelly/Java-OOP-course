package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
	public double total() {
		double total = 0;
		for(OrderItem o : items) {
			total += o.getPrice();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: "+sdf.format(getMoment()));
		sb.append("\nOrder status: "+getStatus());
		sb.append("\nClient: "+ client);
		sb.append("\nOrder itemss:\n");
		for(OrderItem o : items) {
			sb.append(o+"\n");
		}
		sb.append("Total order: $"+String.format("%.2f", total()));
		return sb.toString();
		
	}
}
