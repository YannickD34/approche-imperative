package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
		
		// Crée un tableau qui contient la somme des 2 précédents tableaux
		int[] arraySomme;
		if (array1.length < array2.length) {
			arraySomme = new int[array2.length];
			for (int i = 0; i < array2.length; i++) {
				arraySomme[i] = array2[i];
			}
			for (int j = 0; j < array1.length; j++) {
				arraySomme[j] += array1[j];
			}
		}
		else {
			arraySomme = new int[array1.length];
			for (int i = 0; i < array1.length; i++) {
				arraySomme[i] = array1[i];
			}
			for (int j = 0; j < array2.length; j++) {
				arraySomme[j] += array2[j];
			}
		}
		for (int i = 0; i < arraySomme.length; i++) {
			System.out.print(arraySomme[i] + " ");
		}
		
	}

}
