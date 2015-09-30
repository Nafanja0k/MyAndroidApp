
import java.util.*;
public class FillProducts
{
	static void fill(List<Product> products){
		
		products.add(new Fruit("Яблоки",10.35));
		products.add(new Fruit("Сливы",23.70, 1.35));
		
		products.add(new Vegetable("Капуста",2.35));
		products.add(new Vegetable("Картошка",3.70));
	}
}
