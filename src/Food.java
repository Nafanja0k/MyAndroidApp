
abstract public class Food extends Product{
	// Торгова націнка на їжу
	protected double margin = 1.1;
	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=1;
	
	public void Food(String name, double inPrice) {
		super.name = name;
		super.inPrice = inPrice;
		// TODO Auto-generated constructor stub
	
	}
	
	//abstract public double getPrice();
}
