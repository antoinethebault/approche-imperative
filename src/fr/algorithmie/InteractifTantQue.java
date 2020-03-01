package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
	
	public static void main(String[] args) {
		// declaration des variables
		Scanner saisie = new Scanner(System.in);
		int nb;
		int somme=0;

		// saisie d'un nombre
		do {
			System.out.println("Saisir un nombre entre 1 et 10 : ");
			nb = saisie.nextInt();
		}while (nb<1 || nb>10);
		
		//affichage du resultat
		System.out.println("Le nombre est : "+nb);
		
		saisie.close();
	}}
