package B2_Atelier1;
import java.util.Scanner;

public class Ex4 {

		// TODO Auto-generated method stub
	String nom ;
    String address;
    int solde ;
    
	public static void affiche(String  nom , String address ,int  solde) {
		 System.out.println(nom);
		 System.out.println(address);
		 System.out.println(solde);
	}
	public static void calcul(String  nom , String address ,int  solde) {
		Scanner s = new Scanner(System.in);
		 System.out.println("entré votre solde ?");
		 int solde1 = s.nextInt();
			int tauInt = (int) (solde1 * 0.07/100);
		 System.out.println("bonjouuur mr votre solde est  :" +tauInt);
		
	}

}
