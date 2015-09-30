public class Tv extends Technic {

	// націнка у зв’язку з усушкою/утряскою фруктів)
	protected double storageFee = 1,01;
	// номер групи/класу. Використовується для генерації номера товару
	protected classId=1;
	
	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice(){
		return this.inPrice * this.margin * this.storageFee;
	}

}
