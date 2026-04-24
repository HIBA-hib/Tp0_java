package TP5;

public class AbonnementMusique  extends Abonnement implements Reducible{
	 private int nbPlaylists;
	 private boolean optionOffline;
	 public AbonnementMusique(String nom, double prix, int profils, int playlists, boolean offline) {
	        super(nom, prix, profils);
	        this.nbPlaylists = playlists;
	        this.optionOffline = offline;
	    }
	 
	    public double CalculerCoutMensuel() {
	        double cout = getPrixBase();
	        if (optionOffline) cout += 15;
	        return cout;
	    }
	 
	    public int CalculerScoreSatisfaction() {
	        int score = 50;
	        if (nbPlaylists > 20) score += 20;
	        if (optionOffline) score += 20;
	        if (getnbProfils() > 1) score += 10;
	        return Math.min(score, 100);
	    }
	 
	    public boolean estEligibleReduction(double p) {
	        return p <= 30;
	    }
	 
	    public double appliquerReduction(double p) {
	        if (estEligibleReduction(p)) {
	            return CalculerCoutMensuel() * (1 - p / 100);
	        }
	        return CalculerCoutMensuel();
	    }
	
	 

}

