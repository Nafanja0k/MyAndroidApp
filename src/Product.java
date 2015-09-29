public class Product
{
	private String name;
	private int group;
	private int subGroup;
	private int id;
	private double price;
	
	public void Product(String name, int group, int subGroup, int id){
		this.name = name;
		this.group = group;
		this.subGroup = subGroup;
		this.id = id;
	};
	
	
	public void setPrice(int product){
		
	
	};
	
	public void addToCart(int product_id){
		
	}
	
	public String getProduct(int product_id){
		//Вертаємо стрічкою згенерований номер товару 
		return this.group + "." +this.subGroup + "." + this.id;
	};
}
