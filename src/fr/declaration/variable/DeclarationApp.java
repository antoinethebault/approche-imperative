package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		// declaration des variables :
		byte b = 127;
		short s = 32767;
		int i = 2_100_000_000;
		long l = 2L;
		float f = 3.4F;
		double d = 1.79D;
		char c = 'c';
		boolean bool = true;
		String randomString = "Voici le résultat d’un calcul :\n 1+5=6";
		
		//affichage des variables :
		System.out.println("Affichage des valeurs :");
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		System.out.println(randomString);
	}

}
