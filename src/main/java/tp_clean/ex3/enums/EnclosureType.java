package tp_clean.ex3.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tp_clean.ex3.interfaces.AnimalTrait;
import tp_clean.ex3.interfaces.Labeled;

/**
 * Enumeration listing every existing type
 * of animal enclosure that can appear in a zoo.
 *
 * @author DorianBoel
 */
public enum EnclosureType implements Labeled {

	/**
	 * Represents an enclosure made for housing fish.
	 */
	AQUARIUM("aquarium", .2, Diet.CARNIVOROUS, Diet.HERBIVOROUS, AnimalFamily.FISH),
	
	/**
	 * Represents an enclosure made for housing reptiles.
	 */
	REPTILE_TERRARIUM("ferme reptile", .1, Diet.CARNIVOROUS, Diet.HERBIVOROUS, AnimalFamily.REPTILE),
	
	/**
	 * Represents an enclosure made for housing herbivorous mammals native to a savanna.
	 */
	AFRICAN_SAVANNA("savane africaine", 10, Diet.HERBIVOROUS, AnimalFamily.MAMMAL),
	
	/**
	 * Represents an enclosure made for housing carnivorous mammals.
	 */
	CARNIVORE_ZONE("zone carnivore", 10, Diet.CARNIVOROUS, AnimalFamily.MAMMAL);
	
	/**
	 * The enclosure type's identification label.
	 */
	private String label;
	
	/**
	 * The daily amount of food in kg required to feed a single animal in this
	 * type of enclosure.
	 */
	private double dailyFoodPortion;
	
	/**
	 * The list of traits an animal must possess in order to
	 * be able to live in this type of enclosure.
	 */
	private Map<TraitType, List<AnimalTrait>> traits = new HashMap<>();
	
	/**
	 * Enum constructor for {@link EnclosureType}.
	 * 
	 * @param label The type's label
	 * @param dailyFoodPortion The type's daily required food portion per animal
	 * @param traits The list of traits defining the animals who can inhabit the type of enclosure
	 */
	private EnclosureType(String libelle, double dailyFoodPortion, AnimalTrait ...traits) {
		this.label = libelle;
		this.dailyFoodPortion = dailyFoodPortion;
		for (AnimalTrait trait : traits) {
			TraitType type = trait.getType();
			if (this.traits.get(type) != null) {
				this.traits.get(type).add(trait);
			} else {
				this.traits.put(type, new ArrayList<>(Arrays.asList(trait)));
			}
		}
	}

	/**
	 * Getter for {@link #label}.
	 *
	 * @return This enclosure type's label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Getter for {@link #dailyFoodPortion}.
	 *
	 * @return The daily amount of food required to feed an animal 
	 * in this type of enclosure.
	 */
	public double getDailyFoodPortion() {
		return dailyFoodPortion;
	}

	/**
	 * Getter for {@link #traits}.
	 *
	 * @return
	 */
	public Map<TraitType, List<AnimalTrait>> getTraits() {
		return Collections.unmodifiableMap(traits);
	}
	
}
