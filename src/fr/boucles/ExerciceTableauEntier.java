package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {

		// Déclaration d'un tableau d’entiers contenant tous les entiers de 1 à 10
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Affiche le premier élément du tableau
		System.out.println(tab[0]);
		
		// Affiche la longueur du tableau en utilisant la propriété length
		System.out.println(tab.length);
		
		// Affiche le dernier élément du tableau en utilisant la propriété length
		System.out.println(tab[tab.length-1]);
		
		// Modifie la valeur de l’élément d’index 4 en lui donnant la valeur 8.
		tab[4] = 8;
		
	}

}
