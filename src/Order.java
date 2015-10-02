public class Order
{

	public int productId;
	public double quantity;
	public double price;
	
	public Order(int productId, double quantity, double price){
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
	

	public Order(int productId, int quantity, double price){
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
}
