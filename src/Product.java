abstract public class Product
{
	// Вхідна ціна товару
	protected inPrice;
	// назва товару
	protected name;
	
	public void Product(String name, double inPrice){
		this.name = name;
		this.inPrice = inPrice;
	};
	
	abstract public getPrice();

}
