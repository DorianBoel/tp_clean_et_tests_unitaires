package fr.diginamic.recensement.entites;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/** Données du recensement
 * @author DIGINAMIC
 *
 */
public class Recensement {
	
	/** villes : List<Ville>*/
	private List<Ville> villes  = new ArrayList<>();

	/** Getter
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/** Setter
	 * @param villes the villes to set
	 */
	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}
	
	public Map<String, Departement> getDepartementMap() {
		Map<String, Departement> mapDepts = new HashMap<>();

		for (Ville ville : villes) {
			Departement departement = mapDepts.get(ville.getCodeDepartement());
			if (departement == null) {
				departement = new Departement(ville.getCodeDepartement());
				mapDepts.put(ville.getCodeDepartement(), departement);
			}
			departement.addVille(ville);
		}
		return mapDepts;
	}
}
