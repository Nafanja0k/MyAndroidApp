public class ConsoleMenu
{
	static public void mainMenu(){

		System.out.println("Введіть");
		System.out.println("1 - для продуктів");
		System.out.println("2 - для техніки");
		System.out.println("C - для перегляду кошика");
	}
	
	static public void subProductsMenu(){
	
		System.out.println("Введіть");
		System.out.println("1 - для овочів");
		System.out.println("2 - для фруктів");
		System.out.println("E - повернутись");
	}
	
	static public void subTechnicsMenu(){
		
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
