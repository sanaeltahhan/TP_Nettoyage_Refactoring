package ex2;

/**
 * Classe LivretA qui herite de CompteBancaire
 * 
 * @author eltahhansana
 *
 */
public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	double tauxRemuneration;

	
	/** Constructeur
	 * @param type
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, decouvert);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Methode qui permet d'appliquer la remuneration annuelle au solde
	 * 
	 */
	public void appliquerRemuAnnuelle(){
		 double solde = this.getSolde() + this.getSolde()*tauxRemuneration/100;
		
	}

}
