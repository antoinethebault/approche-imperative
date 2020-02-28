package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		//declaration des variables
		int[] tableau = {4,3,6,1,4};
		boolean valeur = false;
		
		//la valeur vaut true si le tableau est de longueur strictement supérieure à 1 
		//et que le premier et le dernier élément du tableau ont la même valeur
		if (tableau.length>1 && tableau[0]==tableau[tableau.length-1])
			valeur=true;
		
		System.out.println("La valeur booleenne vaut : "+valeur);

	}

}
