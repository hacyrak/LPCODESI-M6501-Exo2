
public class Achat {
	public static void main (String[] args) {
		//CarteDebit
		Compte compte = new Compte(150.50);
		CarteDebit cartedebit = new CarteDebit(compte);
		System.out.println("Carte débit : ");
		cartedebit.affiche();
		cartedebit.payeAchat(100.00);
		cartedebit.affiche();
		cartedebit.payeAchat(100.00);
		cartedebit.affiche();
		
		System.out.println("---------------------");
		
		CarteCredit cartecredit = new CarteCredit(500.00, 273.98);
		System.out.println("Carte crédit : ");
		cartecredit.affiche();
		cartecredit.payeAchat(200.00);
		cartecredit.affiche();
		cartecredit.payeAchat(200.00);
		cartecredit.affiche();
	}
}
