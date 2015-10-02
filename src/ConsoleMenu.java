import java.util.*;

public class ConsoleMenu
{
	static public void mainMenu(List<Product> products, Cart myCart){

		String inString;
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Введіть");
			System.out.println("1 - для продуктів");
			System.out.println("2 - для техніки");
			System.out.println("C - для перегляду кошика");
			System.out.println("q - для виходу");
			
			inString = sc.next();
		
				switch (inString.toLowerCase())
				{
				case "1": {ConsoleMenu.subProductsMenu(products, myCart);
					break;}
				case "2": {ConsoleMenu.subTechnicsMenu(products, myCart);
					break;}
				case "c": {ConsoleMenu.cartMenu(myCart);
					break;}
				case "q": {quit = true;
					break;}
				default : System.out.println("Невірний ввід! повторіть спробу.");
				}
		}
		while (!quit);
	}
	
	static public void subProductsMenu(List<Product> products, Cart myCart){
	
		String inString;
		int inId;
		int inQuantity;
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Введіть");
			System.out.println("1 - для овочів");
			System.out.println("2 - для фруктів");
			System.out.println("e - повернутись");
			System.out.println("a - для додавання в кошик");
			
			inString = sc.next();
		
				switch (inString.toLowerCase())
				{
					case "1": {
						for (Product item : products)
						{
							// Если номер товара начинается на 11
							if (item.getId()/100==11) System.out.println(item.getId() + " - " + item.getName());
						}
						break;}
					case "2": {
						for (Product item : products)
						{
							// Если номер товара начинается на 12
								if (item.getId()/100==12) System.out.println(item.getId() + " - " + item.getName());
						}
						break;}
					case "a": {
							System.out.println("введіть код товару і кількість (через пробіл)");
							inId = sc.nextInt();
							inQuantity = sc.nextInt();
							
							// Дуже неефективний пошук продукту
							for (Product item : products)
								if (item.getId()==inId)
									myCart.addToCart(inId, inQuantity, item.getPrice());
							break;}
						
					
					case "e": {
						quit = true;;
						break;}
					default : System.out.println("Невірний ввід! повторіть спробу.");
				}
		}
		while (!quit);
	}
	
	static public void subTechnicsMenu(List<Product> products, Cart myCart){
		
		String inString;
		boolean quit = false;
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Введіть");
			System.out.println("1 - для телевізорів");
			System.out.println("2 - для телефонів");
			System.out.println("e - повернутись");

			inString = sc.next();

			switch (inString.toLowerCase())
			{
				case "1": {
						for (Product item : products)
						{
							// Если номер товара начинается на 21
							if (item.getId()/100==21) System.out.println(item.getId() + " - " + item.getName());
						}
						break;}
				case "2": {
						for (Product item : products)
						{
							// Если номер товара начинается на 22
							if (item.getId()/100==22) System.out.println(item.getId() + " - " + item.getName());
						}
						break;}
				case "e": {
						quit = true;;
						break;}
				default : System.out.println("Невірний ввід! повторіть спробу.");
			}
		}
		while (!quit);
	}
	
	static public void cartMenu(Cart myCart){
		System.out.println("Вміст кошика:");
		for (Order item : myCart.orders) {
			System.out.println(item.productId + " - " + item.price);
			
			}
		// TODO вивести вміс кошика
	}
}
