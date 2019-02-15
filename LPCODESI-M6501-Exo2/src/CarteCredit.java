
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
			this.encours += montant;
			return true;
		} else {
			return false;
		}
	}
	
	public void affiche() {
		System.out.println("Votre plafond est à : "+ this.plafond+"€");
		System.out.println("En cours : "+ this.encours+"€");
	}
	
}
