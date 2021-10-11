package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Veuillez entrer un nombre : ");
		int nb = scanner.nextInt();
		scanner.close();
		int somme = 0;
		for (int i = 1; i <= nb; i++) {
			somme += i;
		}
		System.out.print("La somme de tous les entiers compris entre 1 et " + nb + " est " + somme);
		
		
	}

}
