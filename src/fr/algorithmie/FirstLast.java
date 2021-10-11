package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {

		// Déclaration d'un tableau d’entiers
		int[] array = {1};
		
		// Le booléen vaut true si le tableau est de longueur supérieure ou égale à 1 et que le premier et le dernier élément du tableau ont la même valeur
		boolean firstLast = array.length > 0 && array[0] == array[array.length-1];
		System.out.println(firstLast);
		
	}

}
