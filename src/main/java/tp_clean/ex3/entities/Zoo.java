package tp_clean.ex3.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tp_clean.ex3.enums.EnclosureType;

/**
 * Represents a zoological park establishment.
 *
 * @author DorianBoel
 */
public class Zoo {

	/**
	 * The zoo's full name.
	 */
	private String name;
	
	/**
	 * A list of enclosures the zoo is comprised of.
	 */
	private List<ZooEnclosure> enclosures = new ArrayList<>();
	
	/**
	 * Constructor for {@link Zoo}.
	 * 
	 * Creates a new zoo with the given name.
	 * 
	 * @param nom The zoo's name
	 */
	public Zoo(String nom){
		this.name = nom;
		for (EnclosureType type : EnclosureType.values()) {
			this.enclosures.add(new ZooEnclosure(type));
		}
	}
	
	/**
	 * Adds a new animal to one of this zoo's enclosure
	 * that can accept it, if such an enclosure exists.
	 * 
	 * @param animal The animal to be added
	 */
	public void addAnimal(Animal animal) {
		for (ZooEnclosure enclos : enclosures) {
			if (enclos.accepts(animal)) {
				enclos.addAnimal(animal);
				return;
			}
		}
	}
	
	/**
	 * Displays the list of every animal in this zoo.
	 */
	public void displayAnimals(){
		for (ZooEnclosure enclosure : enclosures) {
			enclosure.displayAnimals();
		}
	}

	/**
	 * Getter for {@link #name}.
	 *
	 * @return This zoo's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for {@link #enclosures}.
	 *
	 * @return This zoo's list of enclosures
	 */
	public List<ZooEnclosure> getEnclosures() {
		return Collections.unmodifiableList(enclosures);
	}

	/**
	 * Setter for {@link #name}.
	 *
	 * @param The new name to replace the current one
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
