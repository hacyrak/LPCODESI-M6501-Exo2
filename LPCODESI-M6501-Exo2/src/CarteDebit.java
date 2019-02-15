
public class CarteDebit extends CartePaiement {
	Compte compteAssocie;
	public CarteDebit(Compte compte) {
		super();
		this.compteAssocie = compte;
	}
	
	public boolean autorisePaiement(Double montant) {
		if (this.compteAssocie.getSolde() >= montant) {
			return true;
		} else {
			return false;
		}
	}
}
