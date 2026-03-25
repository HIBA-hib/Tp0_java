package tp0;
import java.util.Scanner;


public class Partie3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        // Exercice 8
        System.out.println("Saisir matrice 3x3 :");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                mat[i][j] = sc.nextInt();

        System.out.println("Affichage :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }

        // Exercice 9
        int somme = 0;
        for (int[] row : mat)
            for (int val : row)
                somme += val;

        System.out.println("Somme = " + somme);

        // Exercice 10 (transposée)
        int[][] trans = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                trans[j][i] = mat[i][j];

        System.out.println("Transposée :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(trans[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }

}
