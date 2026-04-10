package TP3;

public class Moto extends Vehicule {
	private boolean avecCasque;
	public Moto(String matricule, String marque, boolean avecCasque) {
	    super(matricule, marque);
	    this.avecCasque = avecCasque;
	}
	 @Override
	    public void stationner() {
			System.out.println("La moto se gare dans une place reservée au deux roues ");
	 }
	 @Override
	 public void affiche () {
			super.affiche();
			System.out.println("avec le casque"+avecCasque);
			
		}
}
