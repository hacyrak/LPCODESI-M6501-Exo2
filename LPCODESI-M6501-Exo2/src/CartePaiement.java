
public abstract class CartePaiement {
	
	protected CartePaiement() {
		
	}
	
	public void payeAchat(Double montant) {
		
	}
	
	public abstract boolean autorisePaiement(Double montant);
}
