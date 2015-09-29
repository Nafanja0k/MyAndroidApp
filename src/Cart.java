
import java.util.*;public class Cart
{

	String name;
	// В кошику є набір замовлень
	ArrayList<Order> orders;
	
	public Cart(String name){
		this.name = name;
		//orders = new Order();
	}

	public void addToCart(int id, int productId, double quantity, double price){
		this.id = id;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void removeFromCart(){
		
	}
}
