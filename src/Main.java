import java.util.*;


public class Main
{
	public static void main(String[] args)
	{
		// products - список об'єктів класу Product
		List<Product> products = new ArrayList<Product>();
		// Створюємо кошик myCart
		Cart myCart = new Cart("myCart");
		
		// Заповнюємо список продуктів
		FillProducts.fill(products);
		
		ConsoleMenu.mainMenu(products, myCart);
		
			
		 
		/*for (Product item : products) {
			System.out.println(item.getId() + " - " + item.getName());
			System.out.println("Вх. ціна: " + item.getInPrice() + " націнка :" + item.getMargin() + " роздрібна ціна: " + item.getPrice());
			System.out.println("--------");
		}
		*/
		//myCart.addToCart();


	}
}
