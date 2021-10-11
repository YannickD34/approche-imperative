package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nbEntrées = 0;
		int nbPlusGrand = -2147483648;
		int tmp;
		System.out.print("Veuillez entrer 10 nombres : ");
		do {
			tmp = scanner.nextInt();
			if (tmp > nbPlusGrand)
				nbPlusGrand = tmp;
			nbEntrées++;
		}
		while(nbEntrées < 10);
		scanner.close();
		System.out.println("Le nombre entré le plus grand est " + nbPlusGrand);
		
	}

}
