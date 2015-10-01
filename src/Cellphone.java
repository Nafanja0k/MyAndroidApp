public class Cellphone extends Technic {

	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=2;

	public Cellphone(String name, double inPrice) {
		// вызывается конструктор родительского класса
		// первым параметром передается сформированный 
		// идентификатор групп
		super.Product(
			super.getClassId()*1000+classId*100,
			name,
			inPrice);
	}

	public Cellphone(String name, double inPrice, double margin) {
		// вызывается конструктор родительского класса
		// первым параметром передается сформированный 
		// идентификатор групп
		super.Product(
			super.getClassId()*1000+classId*100,
			name,
			inPrice);
		this.margin = margin;
	}

}
