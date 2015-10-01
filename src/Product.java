abstract public class Product
{
	// Вхідна ціна товару
	private double inPrice;
	// назва товару
	private String name;
	// унікальний номер товару
	private int id;
	// націнка на товар (накопичується в підлеглих класах)
	protected double margin = 1.0;
	// лічильник для номеру товару для автоінкременту
	static private int autoincrement = 0;
	
	
	public void Product(int groupId, String name, double inPrice){
		this.id = groupId+next();
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

	public int getId(){
		return this.id;
	}
	
	static public int next(){
		return autoincrement++;
	}
	
}
