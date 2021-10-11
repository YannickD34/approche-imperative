package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		Random rand = new Random();
		int nbAléatoire = 1 + rand.nextInt(100);
		System.out.println("Jouons au plus ou moins ! Trouvez le nombre aléatoire entre 1 et 100 : ");
		Scanner scanner = new Scanner(System.in);
		boolean nbPasEncoreTrouve = true;
		int nbEssais = 0;
		int tmp;
		do {
			tmp = scanner.nextInt();
			nbEssais++;
			if (tmp < nbAléatoire)
				System.out.println("Le nombre à trouver est plus grand");
			else if (tmp > nbAléatoire)
				System.out.println("Le nombre à trouver est plus petit");
			else
				nbPasEncoreTrouve = false;
		}
		while(nbPasEncoreTrouve);
		scanner.close();
		System.out.println("Bravo, vous avez trouvé en " + nbEssais + " coups");
		
	}

}
