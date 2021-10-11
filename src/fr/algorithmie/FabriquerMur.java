package fr.algorithmie;

public class FabriquerMur {
	
	public static void main(String[] args) {
		
        // Tests de vérification
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
		int max = 0;
		while (nbBig > 0 && max+5 <= longueur) {
			max += 5;
			nbBig--;
		}
	
		while (nbSmall > 0 && max != longueur) {
			max++;
			nbSmall--;
		}
	return max == longueur;
	}
	
	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
		}
	}


}
