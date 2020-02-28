package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		//declaration des variables
		int[] tableau = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		boolean sortie=false;
		
		//la sortie vaut true si le tableau a au moins 1 élément 
		//et si le premier élément ou le dernier élément vaut 6.
		if (tableau.length>=1 && (tableau[0]==6 || tableau[tableau.length-1]==6))
			sortie = true;
		
		System.out.println("la valeur de sortie : "+sortie);
	}

}
