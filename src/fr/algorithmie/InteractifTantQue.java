package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nb;
		do {
			System.out.print("Veuillez entrer un nombre compris entre 1 et 10 : ");
			nb = scanner.nextInt();
		}
		while(nb > 10 || nb <= 0);
		scanner.close();
		System.out.println("Vous avez entré " + nb);
		
	}

}
