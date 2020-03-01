package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		//declaration des variables
		int[] tableau = {0,1,2,3};
		int[] rotation = new int[tableau.length];
		
		//on effectue une rotation a droite de 'tableau' dans 'rotation'
		rotation[0]=tableau[tableau.length-1];
		for (int i=1; i<tableau.length; i++) {
			rotation[i]=tableau[i-1];
		}
		
		//affichage du tableau de rotation
		for (int i=0;i<rotation.length;i++)
			System.out.print(rotation[i]);
	}

}
