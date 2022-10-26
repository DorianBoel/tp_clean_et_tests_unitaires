package tp_nettoyage.ex2;

/** Représente un compte bancaire de type compte courante
 * @author DIGINAMIC
 */
public class CompteCourant extends CompteBancaire {
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	protected double decouvert;
	
	/**
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}
	
	/** Débite un montant au solde
	 * @param montant
	 */
	@Override
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
	}
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
