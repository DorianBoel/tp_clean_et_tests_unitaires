package tp_nettoyage.ex3.enums;

import tp_nettoyage.ex3.interfaces.AnimalTrait;

/**
 * Enumeration listing every zoological
 * family used to classify an animal.
 *
 * @author DorianBoel
 */
public enum AnimalFamily implements AnimalTrait {

	/**
	 * Represents the mammal subgroup (Mammalia).
	 */
	MAMMAL("mammifère"),
	
	/**
	 * Represents the reptile subgroup (Reptilia).
	 */
	REPTILE("reptile"),
	
	/**
	 * Represents the fish subgroup (Ichtyes).
	 */
	FISH("poisson");
	
	/**
	 * The type identifying this trait.
	 */
	private static final TraitType type = TraitType.FAMILY;
	
	/**
	 * The label identifying the trait.
	 */
	private String label;

	/**
	 * Enum constructor for {@link AnimalFamily}.
	 * 
	 * @param label The label identifying the family
	 */
	private AnimalFamily(String label) {
		this.label = label;
	}

	/**
	 * Getter for {@link #label}.
	 * 
	 * @return This type's label
	 */
	public String getLabel() {
		return label;
	}
	
	@Override
	public TraitType getType() {
		return type;
	}
	
}
