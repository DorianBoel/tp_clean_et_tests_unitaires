package tp_clean.ex3.enums;

import tp_clean.ex3.interfaces.AnimalTrait;

/**
 * Enumeration listing every type of diet 
 * an animal can have.
 *
 * @author DorianBoel
 */
public enum Diet implements AnimalTrait {

	/**
	 * Represents an animal's carnivorous diet.
	 */
	CARNIVOROUS("carnivore"),
	
	/**
	 * Represents an animal's herbivorous diet.
	 */
	HERBIVOROUS("herbivore");

	/**
	 * The type identifying this trait.
	 */
	public static final TraitType TYPE = TraitType.DIET;
	
	/**
	 * The label indentifying the diet.
	 */
	private String label;
	
	
	/**
	 * Enum constructor for {@link Diet}.
	 * 
	 * @param label The label identifying the diet
	 */
	private Diet(String label) {
		this.label = label;
	}

	/**
	 * Getter for {@link #label.}
	 * 
	 * @return This diet's label
	 */
	public String getLabel() {
		return label;
	}
	
	@Override
	public TraitType getType() {
		return TYPE;
	}
	
}
