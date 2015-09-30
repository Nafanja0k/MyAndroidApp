abstract public class Product
{
	// Вхідна ціна товару
	private double inPrice;
	// назва товару
	private String name;
	// 
	// націнка на товар (накопичується в підлеглих класах)
	private double margin = 1;
	//унікальний номер товару для автоінкременту
	static private int autoincrement = 0;
	
	public void Product(String name, double inPrice){
		this.name = name;
		this.inPrice = inPrice;
	};
	
	public double getPrice(){
		return this.inPrice * this.margin;
	}

	abstract public int getId();
	
	static public int next(){
		return autoincrement++;
	}
}
