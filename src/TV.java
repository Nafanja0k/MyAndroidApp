public class TV extends Technic {

	// номер групи/класу. Використовується для генерації номера товару
	protected int classId=1;
	// унікальний номер товару
	private int id;

	public void Cellphone(String name, double inPrice) {
		// Наценку на товар накапливаем (наценка на продукты * наценка фруктов)
		super.Product(name,inPrice);
	}

	public int getId(){
		return this.id;
	}
}
