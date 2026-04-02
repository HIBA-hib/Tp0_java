package tp2;

public class TestBanque {
	

	    public static void main(String[] args) {

	       
	        Banque banque = new Banque("MarocBank", 1500);

	     
	        CompteBancaire c1 = new CompteBancaire("HIBA", 1000000000, 500);
	        CompteBancaire c2 = new CompteBancaire("Ali", 21000, 300);
	        CompteBancaire c3 = new CompteBancaire("Hamza", 5600, 400);

	       
	        banque.ajouterCompte(c1);
	        banque.ajouterCompte(c2);
	        banque.ajouterCompte(c3);

	        
	        c1.deposer(500);
	        c1.retirer(1200);

	        c2.virementVers(c3, 1000);

	        
	        banque.afficherTous();

	      
	        System.out.println("Solde avec intérêts c2: " + c2.calculerSoldeAvecInterets());
	        System.out.println("Solde avec bonus c2: " + c2.calculerSoldeAvecInterets(0.015));

	    
	        System.out.println("Nombre de comptes: " + CompteBancaire.getNbComptes());
	        System.out.println("Taux d'intérêt: " + CompteBancaire.getTauxInteretAnnuel());
	    }
	

}
