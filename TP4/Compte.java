
public class Compte {
	protected String numero;
	protected String titulaire;
	protected double solde ;
	public Compte() {
		
	}
	public Compte(String numero, String titulaire,double solde ) {
		this.numero=numero;
		this.titulaire=titulaire;
		this.solde=solde;
		
		
	}
	public String getNumero() {
		return numero;
		
	}
	public String getTitulaire() {
		return titulaire;
		
	}
	public double getSolde() {
		return  solde;
		
	}
	public void setNumero(String numero) {
		this.numero=numero;
		
	}
	
	public void setTitulaire(String T) {
		this.titulaire=T;
		
	}
	public void setSolde(double S) {
		this.solde=S;
		
	}
	public void deposer(double m) {
		solde=solde+m;
		
	}
	public void retirer(double mRetirer) {
		if(solde> mRetirer) {
			solde=solde- mRetirer;
			
		}else {
			System.out.println("le manton a retirer superieur au solde");
		}
		
	}
	public void afficher() { 
		
         System.out.println("Numero:"+numero+",Titulaire:"+titulaire+"Solde:"+solde);
	}
	
	
	

}
