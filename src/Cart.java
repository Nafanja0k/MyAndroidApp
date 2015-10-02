
import java.util.*;

public class Cart
{

	String name;
	// В кошику є набір замовлень
	List<Order> orders = new ArrayList<Order>();
	
	public Cart(String name){
		this.name = name;
		//orders = new Order();
	}
	// Додаємо замовлення в кошик
	public void addToCart(int productId, double quantity, double price){
		this.orders.add(new Order(productId, quantity, price));
	}
	public void addToCart(int productId, int quantity, double price){
		this.orders.add(new Order(productId, quantity, price));
	}
	
	public void removeFromCart(){
		
	}
}
