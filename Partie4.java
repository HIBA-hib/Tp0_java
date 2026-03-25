package tp0;
import java.util.Scanner;

public class Partie4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Entrez une chaine : ");
	        String str = sc.nextLine();

	        // Exercice 11
	        System.out.println("Longueur : " + str.length());

	        // Exercice 12 (voyelles)
	        int count = 0;
	        for (char c : str.toLowerCase().toCharArray()) {
	            if ("aeiouy".indexOf(c) != -1) count++;
	        }
	        System.out.println("Nombre de voyelles : " + count);

	        // Exercice 13 (inverse)
	        String inverse = new StringBuilder(str).reverse().toString();
	        System.out.println("Inverse : " + inverse);

	        // Exercice 14 (palindrome)
	        if (str.equalsIgnoreCase(inverse))
	            System.out.println("Palindrome");
	        else
	            System.out.println("Non palindrome");

	        sc.close();
	    }
}
