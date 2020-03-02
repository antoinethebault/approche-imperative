package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		//declaration des variables
		Scanner saisie = new Scanner(System.in) ;
		int rang;
		int Nmoins1=1;
		int Nmoins2=0;
		int N=1;
		
		//choix du rang
		System.out.println("Choisissez un rang dans la suite de Fibonacci (>=2):");
		rang=saisie.nextInt();
		
		//calcul et affichage du nombre de rang N dans la suite de Fibonacci
		for (int i=0; i<rang-1; i++) {
			N=Nmoins1+Nmoins2;
			Nmoins2=Nmoins1;
			Nmoins1=N;
		}
		System.out.println("Le nombre de rang "+rang+" correspond a "+N);

	}

}
