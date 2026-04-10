package TP3;

public class Camion extends Vehicule  {
	private double chargeMax;
	 public Camion(String matricule, String marque, double chargeMax) {
	        super(matricule, marque);
	        this.chargeMax = chargeMax;
	    }

	 @Override
	    public void stationner() {
			System.out.println("Le camionse gare dans une zone pour véhecules lourds");
	 }
	 @Override
	 public void affiche () {
			super.affiche();
			System.out.println("Nombre de portes"+chargeMax);
			
	 }
}
