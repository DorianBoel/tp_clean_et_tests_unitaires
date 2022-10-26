package tp_nettoyage.ex3.entities;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import tp_nettoyage.ex3.enums.AnimalFamily;
import tp_nettoyage.ex3.enums.Diet;
import tp_nettoyage.ex3.enums.TraitType;
import tp_nettoyage.ex3.interfaces.AnimalTrait;

/**
 * Represents an animal in a zoo.
 *
 * @author DorianBoel
 */
public class Animal {

	/**
	 * The species the animal belongs to.
	 */
	private String species;
	
	/**
	 * A map containing the animal's traits.
	 */
	private HashMap<TraitType, AnimalTrait> traits = new HashMap<>();
	
	/**
	 * Creates a new animal with the given info.
	 * 
	 * @param species The animal's species
	 * @param family The animal's zoological family
	 * @param diet The animal's dietary habit
	 */
	public Animal(String species, AnimalFamily family, Diet diet) {
		this.species = species;
		this.traits.put(TraitType.FAMILY, family);
		this.traits.put(TraitType.DIET, diet);
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s %s", species, getFamily().getLabel(), getDiet().getLabel());
	}

	/**
	 * Getter for {@link #species}.
	 *
	 * @return This animal's species
	 */
	public String getEspece() {
		return species;
	}

	/**
	 * Getter for {@link #traits}.
	 *
	 * @return This animal's set of traits
	 */
	public Map<TraitType, AnimalTrait> getTraits() {
		return Collections.unmodifiableMap(traits);
	}

	/**
	 * Gets this animal's family.
	 * 
	 * @return This animal's family
	 */
	public AnimalTrait getFamily() {
		return traits.get(TraitType.FAMILY);
	}

	/**
	 * Gets this animal's diet.
	 * 
	 * @return This animal's diet
	 */
	public AnimalTrait getDiet() {
		return traits.get(TraitType.DIET);
	}
	
	/**
	 * Setter for {@link #species}.
	 *
	 * @param The new species to replace the current one
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * Set this animal's family.
	 * 
	 * @param family The new family to replace the current one
	 */
	public void setFamille(AnimalFamily family) {
		this.traits.put(TraitType.FAMILY, family);
	}

	/**
	 * Set this animal's diet.
	 * 
	 * @param diet The new diet to replace the current one
	 */
	public void setDiet(Diet diet) {
		this.traits.put(TraitType.DIET, diet);
	}
	
}
