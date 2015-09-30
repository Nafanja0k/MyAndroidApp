
public class Vegetable extends Food {

	// націнка у зв’язку з усушкою/утряскою фруктів)
	protected double shrinkage = 1,02;
	// номер групи/класу. Використовується для генерації номера товару
	protected classId=2;
	
	public Veegtable() {
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice(){
		return this.inPrice * this.margin * this.shrinkage;
	}

}
