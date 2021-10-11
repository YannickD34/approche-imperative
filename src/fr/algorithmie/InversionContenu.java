package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		// Création d'un entier qui est la taille du tableau array dont on se reservira plusieurs fois
		int len = array.length;
		
		// Création du tableau de copie de la même taille que array
		int[] arrayCopy = new int[len];
		
		// Copie tous les éléments de array dans arrayCopy mais dans l’ordre inverse
		int j = len-1;
		for (int i = 0; i < len; i++) {
			arrayCopy[j] = array[i];
			j--;
		}
		
		// Affiche l’ensemble des éléments des 2 tableaux
		System.out.println("array :");
		for (int i = 0; i < len; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("arrayCopy :");
		for (int i = 0; i < len; i++) {
			System.out.print(arrayCopy[i] + " ");
		}		
		
	}

}
