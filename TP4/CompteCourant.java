package TP4;

public class CompteCourant extends Compte {
	private double decouvertAutorise;
	
	public  CompteCourant() {
		
	}
    public  CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise  ) {
    	super( numero, titulaire, solde);
		this.decouvertAutorise=decouvertAutorise;
	}
   
    public void retirer(double mRetirer) {
		if(solde- mRetirer>= -(decouvertAutorise)) {
			solde=solde- mRetirer;
			
		}else {
			System.out.println("tu as depasséla limite du decouvert ");
		}
		
		
	}
    public void afficher() {
		super.afficher();
    	System.out.println("decouvertAutorise"+decouvertAutorise);
    		}
}
