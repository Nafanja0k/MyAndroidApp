
public class Vegetable extends Food {

	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=2;
	
	public Vegetable(String name, double inPrice) {
		// вызывается конструктор родительского класса
		// первым параметром передается сформированный 
		// идентификатор групп
		super.Product(
			super.getClassId()*1000+classId*100,
			name,
			inPrice);
	}

	public Vegetable(String name, double inPrice, double margin) {
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
