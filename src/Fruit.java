public class Fruit extends Food {

	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=1;
	// унікальний номер товару
	private int id;
	
	public Fruit(String name, double inPrice) {
		// хочу чтоб вызывался конструктор родительского класса
		super.Product(name,inPrice);
		
		// суперкласс  Product має статичну змінну 
		// для підрахунку порядкового номеру об'єкту
		// за допомогою методу next();
		id = super.getClassId()*1000+classId*100+this.next();
		
	}
	public int getId(){
		System.out.println(this.id);
		return this.id;
	}
}
