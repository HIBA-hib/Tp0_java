package TP5;

public class TestAbonnements {
	public static void main(String[] args) {

        Abonnement[] tab = new Abonnement[3];

        tab[0] = new AbonnementVideo("Netflix", 100, 4, true, true);
        tab[1] = new AbonnementMusique("Spotify", 80, 2, 25, true);
        tab[2] = new AbonnementJeux("GamePass", 120, 3, 60, 50);

        for (Abonnement a : tab) {
            a.afficherInfos();
            System.out.println("Cout: " + a.CalculerCoutMensuel());
            System.out.println("Score: " + a.CalculerScoreSatisfaction());
            System.out.println("_____");
        }

        Reducible[] r = new Reducible[2];
        r[0] = (Reducible) tab[0];
        r[1] = (Reducible) tab[1];

        for (Reducible red : r) {
            System.out.println("Reduction 20%: " + red.appliquerReduction(20));
            System.out.println("Reduction 50%: " + red.appliquerReduction(50));
        }
    }
}


