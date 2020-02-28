package fr.algorithmie;

public class RechercheMax {

	public static void main(String[] args) {
		//declaration de la variable
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//Recherche le plus grand element
		int max=array[0];
		for (int i=1; i<array.length;i++) {
			if (array[i]>max)
				max=array[i];
		}
		System.out.println ("Le plus grand element du tableau : "+max);
	}

}
