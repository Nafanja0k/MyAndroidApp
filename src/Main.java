import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		// products - список об'єктів класу Product
		ArrayList<Product> products = new ArrayList<Product>();
		// Створюємо кошик myCart
		Cart myCart = new Cart("myCart");
		
		// Заповнюємо список продуктів
		FillProducts.fill(products);
		
		//myCart.addToCart();


	}
}
