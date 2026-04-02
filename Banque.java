package tp2;
public class Banque {

    private String nom; 
    private CompteBancaire[] comptes;
    private int nbActuels;

    public Banque(String nom, int capacite) {
        this.nom = nom; 
        this.comptes = new CompteBancaire[capacite];
        this.nbActuels = 0;
    }
    public String getNom() {
        return nom;
    }

    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels++] = c;
        } else {
            System.out.println("Banque pleine !");
        }
    }

    public void afficherTous() {
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
    public static void main(String[] args) {

        Banque b = new Banque("TestBank", 10);

        CompteBancaire c1 = new CompteBancaire("Ali", 1000, 200);
        CompteBancaire c2 = new CompteBancaire("hiba", 1500, 300);

        b.ajouterCompte(c1);
        b.ajouterCompte(c2);

        b.afficherTous();
    }
}