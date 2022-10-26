package tp_nettoyage.ex5;

import java.util.Arrays;
import java.util.List;

public class Ex5 {

	public static void main(String[] args) {
		
		Inventaire inventaire = new Inventaire();
		
		List<Item> items = Arrays.asList(
			new Item("item1", 3),
			new Item("item2", 15),
			new Item("item3", 40)
		);
		
		for (Item item : items) {
			inventaire.addItem(item);
		}

		System.out.println(inventaire.taille());
		
	}

}
