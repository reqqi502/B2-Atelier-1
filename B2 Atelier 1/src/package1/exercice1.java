package package1;
import java.util.Scanner;

public class exercice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("entré le premier nombre ?");
		int num1 = s.nextInt();
		if(num1 <= 0) {
			System.out.println("le nombre est négative veuillé entré un nombre positive !!!!");
		}
		System.out.println("le racine  de votre nombre :" + Math.sqrt(num1));
		System.out.println("Tapez  0 pour sortir du programme");
		int num2 = s.nextInt();
		if (num2 == 0) {
			System.out.println("programme sign out !!!! :-) ");
		}
	}
	

}
