
public class Fruit extends Food {

	// націнка у зв’язку з усушкою/утряскою фруктів)
	protected double shrinkage = 1.01;
	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=1;
	// унікальний номер товару
	private int id;
	
	public Fruit(String name, double inPrice) {
		// хочу чтоб вызывался конструктор родительского класо,
		// но получаю ошибку
		//super(name,inPrice);
		
		// суперкласс  Product має статичну змінну 
		// для підрахунку порядкового номеру об'єкту
		// за допомогою методу next();
		id = classId*100+this.next();
		
	}
	
	public double getPrice(){
		return this.inPrice * this.margin * this.shrinkage;
	}

	public int getId()
	{
		System.out.println(this.id + " - " + this.name);
		return this.id;
	}


	
}
