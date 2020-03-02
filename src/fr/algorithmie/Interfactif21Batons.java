package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		// declaration des variables
		int nbAleatoire = new Random().nextInt(2) + 1;
		Scanner saisie = new Scanner(System.in);
		int nbBatons = 21;

		// choix aleatoire de celui qui commence
		System.out.println("----Jeu des 21 batons----");
		if (nbAleatoire == 1)
			System.out.println("Vous commencez");
		else
			System.out.println("L'ordinateur commence");

		// jeu: retirer entre 1 et 3 batons a chaque tour
		//jusqu'a ce qu'il n'y ait plus de batons
		while (nbBatons > 0) {
			//si le joueur a commence on fait jouer le joueur puis l'ordinateur
			//on coupe la boucle si un des deux perd
			if (nbAleatoire == 1) {
				System.out.println("Choisissez le nombre de batons a retirer (1, 2 ou 3) : ");
				nbBatons = nbBatons - saisie.nextInt();
				if (nbBatons <= 0) {
					System.out.println("Vous avez perdu");
					break;
				}
				System.out.println("Il reste " + nbBatons + " batons");
				nbBatons = ordinateurRetire(nbBatons);
				if (nbBatons <= 0) {
					System.out.println("L'ordinateur a perdu");
					break;
				}
			} 
			//si l'ordinateur a commence on fait jouer l'ordinateur puis le joueur
			//on coupe la boucle si un des deux perd
			else {
				nbBatons = ordinateurRetire(nbBatons);
				if (nbBatons <= 0) {
					System.out.println("L'ordinateur a perdu");
					break;
				}
				System.out.println("Choisissez le nombre de batons a retirer (1, 2 ou 3) : ");
				nbBatons = nbBatons - saisie.nextInt();
				if (nbBatons <= 0) {
					System.out.println("Vous avez perdu");
					break;
				}
				System.out.println("Il reste " + nbBatons + " batons");

			}
		}
		saisie.close();

	}

	//fonction utilisee quand l'ordinateur retire des batons
	public static int ordinateurRetire(int nbBatons) {
		//declaration de la variable
		int nbRetireBatons = new Random().nextInt(3) + 1;
		
		//mise en place de la strategie en fin de jeu
		if (nbBatons == 6 || nbBatons== 5)
			nbRetireBatons = 1;
		else if (nbBatons == 4)
			nbRetireBatons = 3;
		else if (nbBatons == 3)
			nbRetireBatons = 2;
		else if (nbBatons == 2 || nbBatons==1)
			nbRetireBatons = 1;
		nbBatons -= nbRetireBatons;
		System.out.println("L'ordinateur a retire " + nbRetireBatons + " batons");
		System.out.println("Il reste " + nbBatons + " batons");
		return nbBatons;
	}
}
