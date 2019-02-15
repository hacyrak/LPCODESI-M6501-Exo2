
public abstract class CartePaiement {
	
	protected CartePaiement() {
		
	}
	
	public void payeAchat(Double montant) {
		if (this.autorisePaiement(montant)) {
			System.out.println("Vous avez payer "+montant+"€");
		} else {
			System.out.println("Vous ne pouvez pas payer !"+montant+"€");
		}
	}
	
	public abstract boolean autorisePaiement(Double montant);
}
