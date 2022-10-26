package tp_nettoyage.ex3.interfaces;

import tp_nettoyage.ex3.enums.TraitType;

/**
 * Interface to be implemented by enumerations
 * listing the traits regarding an animal's behavior
 * and/or classification.
 *
 * @author DorianBoel
 */
public interface AnimalTrait extends Labeled {
	
	/**
	 * Getter for the trait's type.
	 * 
	 * @return The trait's type
	 */
	TraitType getType();
	
}
