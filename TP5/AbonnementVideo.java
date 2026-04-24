package TP5;

public class AbonnementVideo extends Abonnement implements Reducible {

    private boolean optionHD;
    private boolean option4K;

    public AbonnementVideo(String nom, double prix, int profils, boolean hd, boolean k4) {
        super(nom, prix, profils);
        this.optionHD = hd;
        this.option4K = k4;
    }

    
    public double CalculerCoutMensuel() {
        double cout = getPrixBase();
        if (optionHD==true) cout += 10;
        if (option4K==true) cout += 20;
        return cout;
    }
    

    
    public int CalculerScoreSatisfaction() {
        int score = 60;
        if (optionHD==true) score += 10;
        if (option4K==true) score += 20;
        if (getnbProfils() >= 4) score += 10;
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