package tp_clean.ex2;

/** Représente un compte bancaire générique
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	/** Ce constructeur est utilisé pour créer un compte bancaire
	 * @param solde représente le solde du compte
	 */
	public CompteBancaire(double solde) {
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public abstract void debiterMontant(double montant);
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
