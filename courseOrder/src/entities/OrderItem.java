package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		subTotal(quantity, product);
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void subTotal(int quantity, Product product) {
		this.price = quantity * product.getPrice();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				product.getName()
				+", $"
				+String.format("%.2f", product.getPrice())
				+", Quantity: "
				+quantity
				+", SubTotal: $"
				+String.format("%.2f", this.price));
		return sb.toString();
	}
}
