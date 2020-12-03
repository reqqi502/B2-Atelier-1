package B2_Atelier1;
import java.util.Scanner;

public class Ex2_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String choixnom;
	        Scanner s=new Scanner(System.in);
	        System.out.println("----Bonjour !----");
	        System.out.println();
	        System.out.println("Voulez vous devenir one kind ?(max/rex)");
	        System.out.print("Votre choix : ");
	        choixnom=s.next();
	        if(choixnom.equals("rex")){
	            System.out.println("Je  suis  en  colère.  Ghhhhhhhhhh!!!  WWWWOARF  !! WWWWOARF !! -Je mange de la viande");
	        }
	        if(choixnom.equals("max")){
	            System.out.println("Je ne suis pas du tout en colère. Iwiw !! awaw !! -Je mange du poisson");
	        }
       
	}

}
