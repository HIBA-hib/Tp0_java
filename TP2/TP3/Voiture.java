package TP3;

public class Voiture extends Vehicule {
	private int nbPortes;
	
	public Voiture ( int nbPortes ,String matricule, String marque){
	      this.nbPortes=nbPortes;
	      this.marque=marque;
	      this.matricule=matricule;
	      
	       
	      
	}
    @Override
    public void stationner() {
		System.out.println("La voiture se gare dans une place standard ");
    }
	
		
	@Override
	public void affiche () {
		super.affiche();
		System.out.println("Nombre de portes"+nbPortes);
		
		
	}
	
		

	

}
