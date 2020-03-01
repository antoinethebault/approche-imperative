package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// declaration des variables
		Scanner saisie = new Scanner(System.in);
		int nb;;
		int max;

		// saisie des 10 nombres et recherche le plus grand
		System.out.println("Saisir 10 nombres : ");
		max=saisie.nextInt();
		for (int i=2;i<=10;i++) {
			nb = saisie.nextInt();
			if (nb>max)
				max=nb;
		}

		// affichage du resultat
		System.out.println("le plus grand est : "+max);

		saisie.close();

	}

}
