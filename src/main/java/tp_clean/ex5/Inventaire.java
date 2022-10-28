package tp_clean.ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 4));
		caisses.add(new Caisse("Moyens objets", 20));
		caisses.add(new Caisse("Grands objets", Integer.MAX_VALUE));
	}

	public void addItem(Item item) throws NullParamException {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		
		if (item == null) {
			throw new NullParamException("Cannot accept null where an object is expected");
		}
		
		for (Caisse caisse : caisses) {
			if (caisse.canHold(item)) {
				caisse.getItems().add(item);
				return;
			}
		}
		
	}

	public int taille() {
		
		//TODO faites évoluer ce code.
		return caisses.stream().reduce(0, (total, caisse) -> total + caisse.getItems().size(), Integer::sum);
	}
}
