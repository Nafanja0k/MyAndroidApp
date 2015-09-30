abstract public class Product
{
	// Вхідна ціна товару
	protected double inPrice;
	// назва товару
	protected String name;
	//унікальний номер товару для автоінкременту
	static private int autoincrement = 0;
	
	public void Product(String name, double inPrice){
		this.name = name;
		this.inPrice = inPrice;
	};
	
	abstract public double getPrice();
	abstract public int getId();
	
	static public int next(){
		return autoincrement++;
	}
}
