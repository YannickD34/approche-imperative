package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) { 
			int f0 = 0;
			int f1 = 1;
			int fn;
			System.out.print("Veuillez entrer un rang N à calculer : ");
			int tmp = scanner.nextInt();
			for (int i = 0; i <= tmp; i++) {
				fn = f0 + f1;
				f0 = f1;
				f1 = fn;
				System.out.println("fibo(" + i + ") = " + (fn-f0));
			}
			System.out.println();
		}

	}

}
