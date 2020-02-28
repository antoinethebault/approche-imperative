package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// declaration des variables
		int[] tableau1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] tableau2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
		int[] tableau3;

		// calcul de la somme des tableaux
		System.out.println("Calcul de la somme des tableaux");
		//on se base sur le tableau le plus grand
		tableau3 = new int[tableau1.length];
		for (int i = 0; i < tableau1.length; i++) {
			//si on a depasse la taille du tableau 2 on se base que sur le plus grand
			if (i>=tableau2.length)
				tableau3[i] = tableau1[i];
			else
				tableau3[i] = tableau1[i] + tableau2[i];
			System.out.print(tableau3[i] + " ");
		}
	}

}
