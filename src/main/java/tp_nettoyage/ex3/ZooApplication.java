package tp_nettoyage.ex3;

import java.util.Arrays;
import java.util.List;

import tp_nettoyage.ex3.entities.Animal;
import tp_nettoyage.ex3.entities.Zoo;
import tp_nettoyage.ex3.enums.AnimalFamily;
import tp_nettoyage.ex3.enums.Diet;

public class ZooApplication {

	public static void main(String[] args) {
		
		// Instanciation d'un nouveau zoo
		Zoo zoo = new Zoo("Thoiry");
		
		// Initialisation d'une liste d'animaux
		List<Animal> animals = Arrays.asList(
			new Animal("Gazelle", AnimalFamily.MAMMAL, Diet.HERBIVOROUS),
			new Animal("Zèbre", AnimalFamily.MAMMAL, Diet.HERBIVOROUS),
			new Animal("Lion", AnimalFamily.MAMMAL, Diet.HERBIVOROUS),
			new Animal("Panthère", AnimalFamily.MAMMAL, Diet.CARNIVOROUS),
			new Animal("Requin blanc", AnimalFamily.FISH, Diet.CARNIVOROUS),
			new Animal("Truite dorée", AnimalFamily.FISH, Diet.HERBIVOROUS),
			new Animal("Boa constrictor", AnimalFamily.REPTILE, Diet.CARNIVOROUS),
			new Animal("Python", AnimalFamily.REPTILE, Diet.CARNIVOROUS)
		);
		
		// Ajout des animaux de la liste au zoo
		for (Animal animal : animals) {
			zoo.addAnimal(animal);
		}
		
		// Affichage de chaque animal du zoo
		zoo.displayAnimals();
		
	}

}
