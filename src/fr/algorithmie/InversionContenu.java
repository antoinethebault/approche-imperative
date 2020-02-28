package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// declaration des variables
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[array.length];

		// copie des elements de array dans arrayCopy en ordre inverse
		int j=0;
		for (int i = array.length-1; i >= 0; i--) {
			arrayCopy[j] = array[i];
			j++;
		}

		// affichage du tableau array
		System.out.println("Affichage du tableau array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

		// affichage du tableau arrayCopy
		System.out.println("\n\nAffichage du tableau arrayCopy (ordre inverse)");
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.print(arrayCopy[i]+" ");
		}
	}

}
