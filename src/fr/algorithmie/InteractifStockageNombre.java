package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {

		int taille = 5;
		int[] tableauDeNombres = new int[taille]; // On créé un tableau de 5 entiers (valorisés à 0)
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int nbNombresAjoutes = 0; // On stocke le nombre de nombres ajoutés au tableau afin de vérifier qu'on ne dépasse pas la taille du tableau
		while (true) {
			System.out.println("Veuillez choisir une option dans le menu suivant :"); // Menu affiché à l'utilisateur lors de l'éxécution du programme
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			int tmp = scanner.nextInt();
			if (tmp == 1) {
				if (nbNombresAjoutes == taille) { // Si l'utilisateur souhaite ajouter un nombre mais que le tableau est déjà plein
					taille+=5; // On va augmenter la taille du tableau afin de pouvoir rajouter 5 nouveaux entiers
					tableauDeNombres = Arrays.copyOf(tableauDeNombres, taille); // On redéfinit le tableauDeNombres en copiant son précédant contenu dedans et avec sa nouvelle taille augmentée
				}
				System.out.print("Veuillez entrer un nombre à ajouter : ");
				tableauDeNombres[nbNombresAjoutes] = scanner.nextInt(); // On ajoute l'entier entré par l'utilisateur dans notre tableau
				nbNombresAjoutes++;
			}
			if (tmp == 2) {
				System.out.print("Voici le contenu du tableau : ");
				for (int i = 0; i < tableauDeNombres.length; i++) { // Affichage du tableau de nombres créé
					System.out.print(tableauDeNombres[i] + " ");
				}
			}
			System.out.println();
			System.out.println();
		}
				
	}

}
