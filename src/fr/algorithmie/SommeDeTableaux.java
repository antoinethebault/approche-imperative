package fr.algorithmie;

public class SommeDeTableaux {
	public static void main(String[] args) {
		
		//declaration des variables
		int[] tableau1 = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] tableau2 = {-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};
		int[] tableau3;
		
		//calcul de la somme des tableaux si ils ont la meme longueur
		if (tableau1.length==tableau2.length) {
			System.out.println("Calcul de la somme des tableaux");
			tableau3 = new int [tableau1.length];
			for (int i=0; i<tableau1.length;i++) {
				tableau3[i] = tableau1[i]+tableau2[i];
				System.out.print(tableau3[i]+" ");
			}
		}
		else {
			System.out.println("Les tableaux ne font pas la meme longueur");
		}
	}
}
