package tp2;

public class CompteBancaire {
	
	    private int numero;
	    private String titulaire;
	    private double solde;
	    private double decouvertAutorise;

	    private static int nbComptes = 0;
	    private static double tauxInteretAnnuel = 0.03;

	   
	    public CompteBancaire() {
	        this.numero = ++nbComptes;
	        this.titulaire = "Inconnu";
	        this.solde = 0;
	        this.decouvertAutorise = 0;
	    }

	    
	    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
	        this.numero = ++nbComptes;
	        setTitulaire(titulaire);
	        this.solde = solde;
	        setDecouvertAutorise(decouvertAutorise);
	    }

	  
	    public String getTitulaire() {
	        return titulaire;
	    }

	    public void setTitulaire(String titulaire) {
	        if (titulaire != null && !titulaire.isEmpty()) {
	            this.titulaire = titulaire;
	        }
	    }

	    public double getDecouvertAutorise() {
	        return decouvertAutorise;
	    }

	    public void setDecouvertAutorise(double decouvertAutorise) {
	        if (decouvertAutorise >= 0) {
	            this.decouvertAutorise = decouvertAutorise;
	        }
	    }

	    
	    public void afficher() {
	        System.out.println("Compte N°: " + numero +
	                "  Titulaire: " + titulaire +
	                "  Solde: " + solde +
	                "  Découvert: " + decouvertAutorise);
	    }

	    
	    public void deposer(double montant) {
	        if (montant > 0) {
	            solde += montant;
	        } else {
	            System.out.println("Montant de dépôt invalide.");
	        }
	    }

	   
	    public void retirer(double montant) {
	        if (montant > 0 && (solde + decouvertAutorise) >= montant) {
	            solde -= montant;
	        } else {
	            System.out.println("Retrait refusé.");
	        }
	    }

	    
	    public void virementVers(CompteBancaire autre, double montant) {
	        if (montant > 0 && (solde + decouvertAutorise) >= montant) {
	            this.retirer(montant);
	            autre.deposer(montant);
	        } else {
	            System.out.println("Virement impossible : montant ou solde insuffisant.");
	        }
	    }

	    
	    public double calculerSoldeAvecInterets() {
	        return solde + (solde * tauxInteretAnnuel);
	    }

	    
	    public double calculerSoldeAvecInterets(double bonus) {
	        return solde + (solde * (tauxInteretAnnuel + bonus));
	    }

	    
	    public static int getNbComptes() {
	        return nbComptes;
	    }

	    public static double getTauxInteretAnnuel() {
	        return tauxInteretAnnuel;
	    }

	    public static void setTauxInteretAnnuel(double taux) {
	        if (taux >= 0) {
	            tauxInteretAnnuel = taux;
	        }
	    }
	    public static void main(String[] args) {

	        CompteBancaire c1 = new CompteBancaire("hiba", 1000, 500);

	        c1.afficher();

	        c1.deposer(500);
	        c1.retirer(1200);

	        System.out.println("Solde avec intérêts: " + c1.calculerSoldeAvecInterets());
	    }

}
