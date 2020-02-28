package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// declaration de la variable
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// affichage des entiers superieurs a 3
		System.out.print("affichage des entiers superieurs a 3 : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3)
				System.out.print(array[i]+" ");
		}

		// affichage des entiers pairs
		System.out.print("\naffichage des entiers pairs : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.print(array[i]+" ");
		}

		// affichage des valeurs correspondantes aux index pairs
		System.out.print("\naffichage des valeurs correspondantes aux index pairs : ");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0)
				System.out.print(array[i]+" ");
		}
		
		// affichage des entiers impairs
		System.out.print("\naffichage des entiers impairs : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				System.out.print(array[i]+" ");
		}
	}

}
