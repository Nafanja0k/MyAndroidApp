
public class Fruit extends Food {

	// націнка у зв’язку з усушкою/утряскою фруктів)
	protected double shrinkage = 1,01;
	// номер групи/класу. Використовується для генерації номера товару
	protected classId=1;
	
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice(){
		return this.inPrice * this.margin * this.shrinkage;
	}

}
