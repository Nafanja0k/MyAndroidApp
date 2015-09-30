public class Cellphone extends Technic {

	// націнка у зв’язку з усушкою/утряскою фруктів)
	protected double storageFee = 1.01;
	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=2;
	
	public void Cellphone() {
		// TODO Auto-generated constructor stub
	}

	
	public double getPrice()
	{
		return this.inPrice * this.margin * this.storageFee;
	}

	public int getId()
	{
		// TODO: Implement this method
		return 0;
	}

}
