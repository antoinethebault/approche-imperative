package fr.algorithmie;

public class AffichageInverse {
	
	public static void main(String[] args) {
		//declaration de la variable
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//affichage de l'ensemble des elements du tableau
		System.out.println("affichage des elements du tableau :");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		//affichage de l'ensemble des elements du tableau en ordre inverse
		System.out.println("\n\naffichage des elements du tableau en ordre inverse :");
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
		
		int[] arrayCopy = array;
	}
	
}
