package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		// Affiche tous les nombres de 1 à 10
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// Affiche 20 fois mon nom et prénom (avec compteur pour vérifier)
		for (int i = 0; i < 20; i++) {
			System.out.println(i+1 + " Yannick Dubreuil");
		}
		
		System.out.println();
		System.out.println();
		
		// Affiche les éléments pairs de 2 à 100
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// Affiche les éléments impairs de 1 à 99
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}

	}

}
