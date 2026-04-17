package TP4;

public class CompteEpargne  extends Compte {
	private double tauxInternet;
	public CompteEpargne (String numero, String titulaire, double solde, double tauxInteret  ) {
    	super( numero, titulaire, solde);
		this.tauxInternet=tauxInternet;
	}
   
	
	public void calculerInteret(double tauxInternet) {
		solde+=solde*tauxInternet;
		
	}
	@Override
    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Retrait interdit : solde insuffisant");
        }
    }
		

}
