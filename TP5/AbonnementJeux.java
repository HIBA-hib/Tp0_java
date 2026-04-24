package TP5;

public class AbonnementJeux extends Abonnement   {
	  private int nbJeuxInclus;
	    private int heuresJeuParMois;

	    public AbonnementJeux(String nom, double prix, int profils, int jeux, int heures) {
	        super(nom, prix, profils);
	        this.nbJeuxInclus = jeux;
	        this.heuresJeuParMois = heures;
	    }

	   

		
		public double CalculerCoutMensuel() {
			 double cout = getPrixBase();
		        if (nbJeuxInclus > 50) cout += 25;
		        if (heuresJeuParMois > 40) cout += 15;
		        return cout;
		}

		
		public int CalculerScoreSatisfaction() {
			int score = 40;
	        if (nbJeuxInclus >= 30) score += 20;
	        if (heuresJeuParMois >= 20) score += 20;
	        if (getnbProfils() >= 2) score += 10;
	        return Math.min(score, 100);
		}

}
