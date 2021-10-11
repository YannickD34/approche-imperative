package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Veuillez entrer un nombre : ");
		int nb = scanner.nextInt();
		scanner.close();
		System.out.print("Les 10 nombres suivants sont : ");
		for (int i = nb+1; i <= nb+10; i++) {
			System.out.print(i + " ");
		}
		
	}

}
