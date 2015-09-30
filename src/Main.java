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
		
		ConsoleMenu.mainMenu();
		
		String inString;
		Scanner sc = new Scanner(System.in);
		inString = sc.next();
		System.out.println(inString);
		
		
			switch (inString.toLowerCase())
			{
				case "1": {
					ConsoleMenu.subProductsMenu();
					break;
					}
				case "2": {
					ConsoleMenu.subTechnicsMenu();
					break;
					}
				case "3": {
					ConsoleMenu.cartMenu();
					break;
					}
			}
		
		//myCart.addToCart();


	}
}
