
public class CarteCredit extends CartePaiement {
	private Double plafond;
	private Double encours;

	public CarteCredit(Double plafond, Double enCours) {
		super();
		this.plafond = plafond;
		this.encours = enCours;
	}
	
	public boolean autorisePaiement(Double montant) {
		if (this.encours + montant <= this.plafond) {
			return true;
		} else {
			return false;
		}
	}
	
}
