abstract public class Product
{
	// Вхідна ціна товару
	private double inPrice;
	// назва товару
	private String name;
	// 
	// націнка на товар (накопичується в підлеглих класах)
	protected double margin = 1.0;
	//унікальний номер товару для автоінкременту
	static private int autoincrement = 0;
	
	public void Product(String name, double inPrice){
		this.name = name;
		this.inPrice = inPrice;
	};
	
	public double getInPrice(){
		return this.inPrice;
	}
	
	public double getPrice(){
		return this.inPrice * this.margin;
	}
	
	public double getMargin(){
		return  this.margin;
	}
	
	public String getName(){
		return name;
	}
	abstract public int getId();
	
	
	
	static public int next(){
		return autoincrement++;
	}
}
