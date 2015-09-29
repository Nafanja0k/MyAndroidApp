public class Order
{
	public int id;
	public int productId;
	public double quantity;
	public double price;
	
	public Order(int id, int productId, double quantity, double price){
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
}
