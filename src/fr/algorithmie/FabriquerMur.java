package fr.algorithmie;

public class FabriquerMur {
	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		boolean resultat = false; 
		int longueurAtteinte=0;
		
		while (longueurAtteinte<=longueur-5 && nbBig>0) {
			longueurAtteinte+=5;
			nbBig--;
		}
		
		while (longueurAtteinte<=longueur-1 && nbSmall>0) {
			longueurAtteinte+=1;
			nbSmall--;
		}
		if (longueurAtteinte==longueur)
			resultat=true;
		
		return resultat;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}
}
