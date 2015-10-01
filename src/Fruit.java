public class Fruit extends Food {

	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=1;
	
	public Fruit(String name, double inPrice) {
		// вызывается конструктор родительского класса
		// первым параметром передается сформированный 
		// идентификатор групп
		super.Product(
			super.getClassId()*1000+classId*100,
			name,
			inPrice);
		}
	
	public Fruit(String name, double inPrice, double margin) {
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
