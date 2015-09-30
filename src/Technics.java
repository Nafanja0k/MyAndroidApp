
public class Technic extends Product{
	// Торгова націнка на їжу
	protected margin = 1,1;
	// номер групи/класу. Використовується для генерації номера товару
	protected classId=2;
	
	public Technic() {
		
		// TODO Auto-generated constructor stub
	
	}
	
	abstract public getPrice();
}
