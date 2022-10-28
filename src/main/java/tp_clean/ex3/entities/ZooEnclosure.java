package tp_clean.ex3.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import tp_clean.ex3.enums.EnclosureType;
import tp_clean.ex3.enums.TraitType;
import tp_clean.ex3.interfaces.AnimalTrait;

/**
 * Represents an enclosure to house animals within a zoo.
 *
 * @author DorianBoel
 */
public class ZooEnclosure {
	
	/**
	 * The list of animals being housed in the enclosure.
	 */
	private List<Animal> animals = new ArrayList<>();
	
	/**
	 * The type of habitat of the enclosure.
	 */
	private EnclosureType type;
	
	/**
	 * Creates a new enclosure with the given {@link EnclosureType type}.
	 * 
	 * @param type The enclosure's type
	 */
	public ZooEnclosure(EnclosureType type) {
		this.type = type; 
	}
	
	/**
	 * Adds a new animal to this enclosure.
	 * 
	 * @param animal The animal to be added
	 */
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	/**
	 * Displays the list of animals currently in this enclosure.
	 */
	public void displayAnimals(){
		for (Animal animal: animals){
			System.out.println(String.format("%s (%s)", animal.toString(), type.getLabel()));
		}
	}
	
	/**
	 * Calculates the daily amount of food in kg required to feed
	 * every animal in this enclosure.
	 * 
	 * @return
	 */
	public double getDailyFoodPortion() {
		return animals.size() * type.getDailyFoodPortion();
	}
	
	/**
	 * Checks if a given animal is fit to inhabit this enclosure.
	 * 
	 * @param animal The animal to verify compatibility with
	 * @return {@code true} if the animal can inhabit this enclosure, {@code false} otherwise
	 */
	public boolean accepts(Animal animal) {
		Map<TraitType, AnimalTrait> animalCaracteristiques = animal.getTraits();
		for (AnimalTrait trait : animalCaracteristiques.values()) {
			if (!type.getTraits().get(trait.getType()).contains(trait)) {
				return false;
			}
		}
		return true;
	}
	
}
