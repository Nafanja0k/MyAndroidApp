abstract public class Product
{
	// Вхідна ціна товару
	protected double inPrice;
	// назва товару
	protected String name;
	
	public void Product(String name, double inPrice){
		this.name = name;
		this.inPrice = inPrice;
	};
	
	abstract public double getPrice();

}
