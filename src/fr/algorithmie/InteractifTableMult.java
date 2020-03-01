package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// declaration des variables
		Scanner saisie = new Scanner(System.in);
		int nb;

		// saisie d'un nombre
		do {
			System.out.println("Saisir un nombre entre 1 et 10 : ");
			nb = saisie.nextInt();
		} while (nb < 1 || nb > 10);

		// affichage de la table de multiplication
		for (int i=1; i<=10; i++)
			System.out.println(nb+" * "+i+" = "+(nb*i));

		saisie.close();

	}

}
