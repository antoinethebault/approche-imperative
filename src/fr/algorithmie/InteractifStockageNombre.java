package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// declaration des variables
		int menu;
		Scanner saisie = new Scanner(System.in);
		int[] tableau = new int[10];
		int index = 0;

		while (true) {
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			menu = saisie.nextInt();
			if (menu == 1) {
				System.out.println("Saisissez le nombre a ajouter : ");
				tableau[index] = saisie.nextInt();
				index++;
			} else if (menu == 2) {
				for (int i = 0; i <= index - 1; i++) {
					System.out.print(tableau[i] + ", ");
				}
				System.out.println();
			}
		}

	}

}
