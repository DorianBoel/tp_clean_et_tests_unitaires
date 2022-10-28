package tp_clean.ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private int poidsMax;
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int poidsMax) {
		this.nom = nom;
		this.poidsMax = poidsMax;
		this.items = new ArrayList<>();
	}
	
	public boolean canHold(Item item) {
		return item.getPoids() <= getPoidsMax();
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	/** Getter pour l'attribut poids max
	 * @return the poids max
	 */
	public int getPoidsMax() {
		return poidsMax;
	}

	/** Setter pour l'attribut items
	 * @param poidsMax the poids max to set
	 */
	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}
	
}
