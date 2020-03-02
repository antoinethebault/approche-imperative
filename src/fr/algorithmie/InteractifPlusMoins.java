package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		//declaration des variables
		Scanner saisie = new Scanner(System.in);
		int nb;
		int essais=1;
		
		//choix d'un nombre aleatoire
		int secretNb = new Random().nextInt(100)+1;
		
		//saisie d'un nombre jusqu'a trouver le bon
		System.out.println("Saisissez un nombre :");
		nb=saisie.nextInt();
		while (nb!=secretNb) {
			if (nb<secretNb)
				System.out.println("Le nombre est plus grand");
			else
				System.out.println("Le nombre est plus petit");
			nb=saisie.nextInt();
			essais++;
		}
		System.out.println("Bravo, vous avez trouvé en "+essais+" coups");
		saisie.close();
	}

}
