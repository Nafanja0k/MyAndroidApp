
public class Fruit extends Food {

	// націнка у зв’язку з усушкою/утряскою фруктів)
	protected double shrinkage = 1.01;
	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=1;
	// унікальний номер товару
	private int id;
	
	public Fruit(String name) {
		// TODO Auto-generated constructor stub
		id = classId*100+this.next();
	
	}
	
	public double getPrice(){
		return this.inPrice * this.margin * this.shrinkage;
	}

	public int getId()
	{
		// TODO: Implement this method
		return 0;
	}


	
}
