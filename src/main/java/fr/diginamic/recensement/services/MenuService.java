package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.exceptions.IntegerParseException;
import fr.diginamic.recensement.exceptions.InvalidLimitsException;
import fr.diginamic.recensement.exceptions.UnregisteredCodeException;

/**
 * Classe représentant un service
 * 
 * @author DIGINAMIC
 *
 */
public abstract class MenuService {

	/**
	 * Méthode abstraite de traitement que doivent posséder toutes les méthodes de
	 * services
	 * 
	 * @param lignes  lignes du fichier
	 * @param scanner scanner
	 * @throws IntegerParseException 
	 * @throws InvalidLimitsException 
	 * @throws UnregisteredCodeException 
	 */
	public abstract void traiter(Recensement recensement, Scanner scanner) throws IntegerParseException, InvalidLimitsException, UnregisteredCodeException;
}
