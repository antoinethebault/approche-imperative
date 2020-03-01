package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// declaration des variables
		Scanner saisie = new Scanner(System.in);
		int nb;
		int somme=0;

		// saisie d'un nombre
		System.out.println("Saisir un nombre : ");
		nb = saisie.nextInt();
		
		//calcul de la somme des entiers compris entre 1 et le nombre
		for (int i=1; i<=nb; i++)
			somme+=i;
		
		//affichage du resultat
		System.out.println(somme);
		
		saisie.close();
	}

}
