package fr.algorithmie;

import java.util.Scanner ;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		//declaration des variables
		Scanner saisie = new Scanner(System.in) ;
		
		//saisie d'un nombre
		System.out.println("Saisir un nombre : ");
		int nb = saisie.nextInt() ;
		
		//affichage des 10 suivants
		for (int i=1; i<=10; i++)
			System.out.print((nb+i)+", ");
		
		saisie.close();

	}

}
