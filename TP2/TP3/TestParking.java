package TP3;

public class TestParking {
	public static void main (String []args) {
	Vehicule[] v = new Vehicule[4];
	v[0]=new Voiture(4,"D1314","BMW");
	v[1]=new Voiture(4,"D1315","Dacia");
	v[2] = new Camion("DD44", "Volvo", 10000.0);
	v[3] = new Moto("CC33", "Yamaha", true);

	for (Vehicule veh : v) {
        veh.stationner();
        veh.affiche();
        
    }
	System.out.println(" Les Voitures seulement ");
    for (Vehicule veh : v) {
        if (veh instanceof Voiture) {
            veh.affiche();
        }
    }
    Vehicule x = new Voiture(4,"F1323","Audi");
    Voiture v1 = (Voiture) x;
    System.out.println("Downcasting réussi !");
    
	
	}
	
}
