package tp_clean.ex1;

import java.util.Date;

/**
 * Represents a company.
 *
 * @author DorianBoel
 */
public class Entreprise {

	/**
	 * Maximum capital value for any company.
	 */
	public static final int CAPITAL_MAX = 3_000_000;
	
	/**
	 * Siret number.
	 */
	private int siret;
	
	/**
	 * Company name.
	 */
	private String nom;
	
	/**
	 * Company address
	 */
	private String adresse;
	
	/**
	 * When the company was founded.
	 */
	private Date dateCreation;

	/**
	 * Creates a new company with given info.
	 * 
	 * @param siret The siret number
	 * @param nom The company name
	 * @param adresse The company's address
	 * @param dateCreation The company's date of creation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}
	
	/**
	 * Getter for {@link #siret}.
	 *
	 * @return This company's siret number
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Getter for {@link #nom}.
	 *
	 * @return This company's name
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter for {@link #adresse}.
	 *
	 * @return This company's address
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Getter for {@link #dateCreation}.
	 *
	 * @return This company's date of creation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Setter for {@link #siret}.
	 *
	 * @param The new siret number to replace the current one
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Setter for {@link #nom}.
	 *
	 * @param The new name to replace the current one
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter for {@link #adresse}.
	 *
	 * @param The new address to replace the current one
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Setter for {@link #dateCreation}.
	 *
	 * @param The new date of creation to replace the current one
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * Displays the company's status.
	 */
	public void displayStatus(){
		
	}
	
}
