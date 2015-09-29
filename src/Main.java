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
		
		
		System.out.println("Введіть");
		System.out.println("1 - для продуктів");
		System.out.println("2 - для техніки");
		System.out.println("C - для перегляду кошика");
		
		
		String inString;
		Scanner sc = new Scanner(System.in);
		inString = sc.next();
		System.out.println(inString);
			switch (inString.toLowerCase())
			{
				case "1": {
					System.out.println("Введіть");
					System.out.println("1 - для овочів");
					System.out.println("2 - для фруктів");
					System.out.println("E - повернутись");
					}
				case "2": {
					System.out.println("Введіть");
					System.out.println("1 - для телевізорів");
					System.out.println("2 - для телефонів");
					System.out.println("E - повернутись");
					}
				case "3": {
					System.out.println("Вміст кошика:");
						
					// TODO 
					// Вивести вміст поточного кошика
					}
					
			}
		//myCart.addToCart();


	}
}
