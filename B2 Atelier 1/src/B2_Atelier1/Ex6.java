package B2_Atelier1;

public class Ex6 {

		// TODO Auto-generated method stub

	String nom;
	String Adress ;
	double solde ;
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		if(!nom.equals(nom)) {
			System.out.println("thats not true");
		}
		this.nom = nom;
	}
	
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		if(!adress.equals(adress)) {
			System.out.println("thats not true");
		}
		this.Adress = adress;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		if(Double.isNaN(solde)){
			System.out.println("thats not true");
		}
		this.solde = solde;
	}

}
