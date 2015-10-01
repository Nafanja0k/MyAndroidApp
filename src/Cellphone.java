public class Cellphone extends Technic {

	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=2;
	// унікальний номер товару
	private int id;

	public Cellphone(String name, double inPrice) {
		// хочу чтоб вызывался конструктор родительского класса
		super.Product(name,inPrice);

		// суперкласс  Product має статичну змінну 
		// для підрахунку порядкового номеру об'єкту
		// за допомогою методу next();
		id = super.getClassId()*1000+classId*100+this.next();

	}

	public Cellphone(String name, double inPrice, double margin) {
		// хочу чтоб вызывался конструктор родительского класса
		super.Product(name,inPrice);

		// суперкласс  Product має статичну змінну 
		// для підрахунку порядкового номеру об'єкту
		// за допомогою методу next();
		id = super.getClassId()*1000+classId*100+this.next();

		this.margin = margin;
	}

	public int getId(){
		return this.id;
	}
}
