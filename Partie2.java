package tp0;
import java.util.Scanner;


public class Partie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Exercice 5 =====
        System.out.print("Donner la taille du tableau : ");
        int N = sc.nextInt();

        int[] tab = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }

        System.out.println("Tableau : ");
        for (int i = 0; i < N; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        // ===== Exercice 6 =====
        int[] tab10 = new int[10];

        System.out.println("Remplir 10 nombres : ");
        for (int i = 0; i < 10; i++) {
            tab10[i] = sc.nextInt();
        }

        System.out.print("Nombre à chercher : ");
        int val = sc.nextInt();

        int pos = -1;

        for (int i = 0; i < 10; i++) {
            if (tab10[i] == val) {
                pos = i;
            }
        }

        if (pos != -1) {
            System.out.println("Trouvé à la position : " + pos);
        } else {
            System.out.println("Non trouvé");
        }

        // ===== Exercice 7 =====
     // ===== Exercice 7 =====
        System.out.print("Donner la taille du tableau : ");
        int n2 = sc.nextInt();

        int[] tab2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            System.out.print("tab2[" + i + "] = ");
            tab2[i] = sc.nextInt();
        }

        int max = tab2[0];

        for (int i = 0; i < n2; i++) {
            if (tab2[i] > max) {
                max = tab2[i];
            }
        }

        System.out.println("Max du tableau : " + max);
    }

}
