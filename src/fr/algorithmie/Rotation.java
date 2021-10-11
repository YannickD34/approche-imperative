package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {

		// Déclaration d'un tableau d’entiers
		int[] array = {0, 1, 2, 3};
		
		// Effectue une rotation à droite des éléments
		int lastElement = array[array.length-1];
		for (int i = array.length-2; i >= 0; i--) {
			array[i+1] = array[i];
		}
		array[0] = lastElement;
		
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		
	}

}
