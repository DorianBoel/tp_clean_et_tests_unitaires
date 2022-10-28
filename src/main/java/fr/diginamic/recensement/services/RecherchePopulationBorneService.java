package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.function.IntConsumer;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Ville;
import fr.diginamic.recensement.exceptions.IntegerParseException;
import fr.diginamic.recensement.exceptions.InvalidLimitsException;
import fr.diginamic.recensement.exceptions.UnregisteredCodeException;

/**
 * Recherche et affichage de toutes les villes d'un département dont la
 * population est comprise entre une valeur min et une valeur max renseignées
 * par l'utilisateur.
 * 
 * @author DIGINAMIC
 *
 */
public class RecherchePopulationBorneService extends MenuService {

	@Override
	public void traiter(Recensement rec, Scanner scanner) throws IntegerParseException, InvalidLimitsException, UnregisteredCodeException {
		
		final CheckedIntConsumer checkPositive = (n) -> {
			if (n < 0) {
				throw new InvalidLimitsException("Ne peut pas être un nombre négatif");
			}
		};
		
		try {
			
			System.out.println("Quel est le code du département recherché ? ");
			String choix = scanner.nextLine();
			
			Set<String> deptMap = rec.getDepartementMap().keySet();
			
			if (!deptMap.contains(choix.trim())) {
				throw new UnregisteredCodeException(String.format("Aucun département correspondant au code '%s'", choix));
			}

			System.out.println("Choississez une population minimum (en milliers d'habitants): ");
			String saisieMin = scanner.nextLine();
			int min = Integer.parseInt(saisieMin.trim()) * 1000;
			checkPositive.acceptThrows(min);
			
			System.out.println("Choississez une population maximum (en milliers d'habitants): ");
			String saisieMax = scanner.nextLine();
			int max = Integer.parseInt(saisieMax.trim()) * 1000;
			checkPositive.acceptThrows(max);
			
			if (min > max) {
				throw new InvalidLimitsException("La valeur maximum doit être supérieure à la valeur minimum");
			}
		
			List<Ville> villes = rec.getVilles();
			for (Ville ville : villes) {
				if (ville.getCodeDepartement().equalsIgnoreCase(choix)) {
					if (ville.getPopulation() >= min && ville.getPopulation() <= max) {
						System.out.println(ville);
					}
				}
			}
			
		} catch(NumberFormatException err) {
			throw new IntegerParseException(err);
		}
	}
	 
	@FunctionalInterface
	private static interface CheckedIntConsumer extends IntConsumer {
	  
		 @Override
		 @Deprecated
		 default void accept(int n) {
			 try {
				 acceptThrows(n);
			 } catch (Exception e) {
				 throw new RuntimeException(e);
			 }
		 }
		 
		 void acceptThrows(int n) throws InvalidLimitsException;
		
	}

}
