package tp_nettoyage.ex3.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import tp_nettoyage.ex3.interfaces.AnimalTrait;
import tp_nettoyage.ex3.interfaces.Labeled;

/**
 * Enumeration listing every type of trait implementing
 * the {@link AnimalTrait} interface.
 *
 * @author DorianBoel
 */
public enum TraitType implements Labeled {
	
	/**
	 * The zoological family an animal belongs to
	 */
	FAMILY("famille", AnimalFamily.values()),
	
	/**
	 * The dietary habits of an animal
	 */
	DIET("régime", Diet.values());
	
	/**
	 * The label identifying the type.
	 */
	private String label;
	
	/**
	 * A list containing all existing traits for the type of trait.
	 */
	private List<AnimalTrait> typeInstances = new ArrayList<>();
	
	/**
	 * Enum constructor for {@link TraitType}.
	 * 
	 * @param <T> An enumeration implementing the {@link AnimalTrait} interface
	 * @param label The type's label
	 * @param traits The list of traits belonging to the type
	 */
	private <T extends AnimalTrait> TraitType(String label, T[] traits) {
		this.label = label;
		this.typeInstances.addAll(Arrays.asList(traits));
	}
	
	/**
	 * Getter for {@link #label}.
	 * 
	 * @return This type's label
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Getter for {@link #typeInstances}.
	 * 
	 * @return The list of traits belonging to this type
	 */
	public List<AnimalTrait> getInstances() {
		return Collections.unmodifiableList(typeInstances);
	}
	
}
