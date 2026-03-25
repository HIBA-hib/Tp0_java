package tp0;
import java.util.Scanner;

public class Parti1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Exercice 1
	        System.out.print("Entrez un entier : ");
	        int n = sc.nextInt();
	        if (n > 0) System.out.println("Positif");
	        else if (n < 0) System.out.println("Négatif");
	        else System.out.println("Nul");

	        // Exercice 2
	        System.out.print("Entrez 3 nombres : ");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
	        int max = Math.max(a, Math.max(b, c));
	        System.out.println("Le plus grand : " + max);

	        // Exercice 3
	        System.out.print("Entrez un nombre pour la table : ");
	        int t = sc.nextInt();
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(t + " x " + i + " = " + (t * i));
	        }

	        // Exercice 4
	        System.out.print("Entrez N : ");
	        int N = sc.nextInt();
	        int somme = 0, i = 1;
	        while (i <= N) {
	            somme += i;
	            i++;
	        }
	        System.out.println("Somme = " + somme);

	        sc.close();
	    }
	

}
