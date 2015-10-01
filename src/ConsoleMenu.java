import java.util.*;

public class ConsoleMenu
{
	static public void mainMenu(List<Product> products){

		System.out.println("Введіть");
		System.out.println("1 - для продуктів");
		System.out.println("2 - для техніки");
		System.out.println("C - для перегляду кошика");
	
		String inString;
		Scanner sc = new Scanner(System.in);
		inString = sc.next();
		
		switch (inString.toLowerCase())
		{
			case "1": {
					ConsoleMenu.subProductsMenu(products);
					break;
				}
			case "2": {
					ConsoleMenu.subTechnicsMenu(products);
					break;
				}
			case "3": {
					ConsoleMenu.cartMenu();
					break;
				}
		}
	}
	
	static public void subProductsMenu(List<Product> products){
	
		System.out.println("Введіть");
		System.out.println("1 - для овочів");
		System.out.println("2 - для фруктів");
		System.out.println("E - повернутись");
		
		String inString;
		Scanner sc = new Scanner(System.in);
		inString = sc.next();
		
		switch (inString.toLowerCase())
		{
			case "1": {
					
					for (Product item : products)
					{
						// Если номер товара начинается на 11
						if (item.getId()/100==11)
						System.out.println(item.getName());
					}
					break;
				}
			case "2": {
					for (Product item : products)
					{
						// Если номер товара начинается на 12
						if (item.getId()/100==12)
							System.out.println(item.getName());
					}
					break;
				}
			case "3": {
					//
					break;
				}
		}
		
	}
	
	static public void subTechnicsMenu(List<Product> products){
		
		System.out.println("Введіть");
		System.out.println("1 - для телевізорів");
		System.out.println("2 - для телефонів");
		System.out.println("E - повернутись");
	}
	
	static public void cartMenu(){
		System.out.println("Вміст кошика:");
		
		// TODO вивести вміс кошика
	}
}
