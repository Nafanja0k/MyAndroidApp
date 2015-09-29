public class Product
{
	private String name;
	private int group;
	private int subGroup;
	private int id;
	private double price;
	
	// Gruppa 1 - Produkty;
	// Podgruppa 1 - Frukty;
	// Podgruppa 2 - Ofoschi;
	// Gruppa 2 - Elektronika;
	// Podgruppa 1 - Televizory;
	// Podgruppa 2 - Telefony;
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
	
	public void getProduct(int product_id){
		
		System.out.println(this.group + "." +this.subGroup + "." + this.id);
		System.out.println(this.name);
	};
	
}
