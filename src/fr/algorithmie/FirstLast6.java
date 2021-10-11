package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {

		// Déclaration d'un tableau d’entiers
		int[] array = {6};
		
		// Le booléen vaut true uniquement si le tableau a au moins 1 élément et si le premier élément ou le dernier élément vaut 6.
		boolean firstLast6 = array.length > 0 && (array[0] == 6 || array[array.length-1] == 6);
		System.out.println(firstLast6);
		
	}

}
