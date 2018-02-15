package zadaci_13_02_2018;

import java.util.Scanner;

public class IdenticalArray {
	/*
	 * 
	3. Nizovi niz1 i niz2 su striktno identični ukoliko su svi njihovi elementi na istim pozicijama jednaki.
	Napisati metodu koja vraća true ukoliko su nizovi niz1 i niz2 striktno identični. Koristiti sljedeći header:
	public static boolean equals(int[ ] niz1, int[ ] niz2)
	Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno identični.
	 * 
	 */
	static  Scanner input = new Scanner(System.in); 
	public static void main(String[] args) {
		 
		System.out.println("Unesi 10 brojeva u prvi niz");
		System.out.println("---------------------------");
		int[] firstArray = new int[10];
		for (int i=0; i<firstArray.length; i++) {
			firstArray[i] = input.nextInt();
		}
		System.out.println("Unesi 10 brojeva u drugi niz");
		System.out.println("---------------------------");
		int[] secondArray = new int[10];
		for (int i=0; i<secondArray.length; i++) {
			secondArray[i] = input.nextInt();
		}
		if (equals(firstArray, secondArray)) {
			System.out.println("Nizovi su identicni");
		}
		else {
			System.out.println("Nizovi nisu identicni");
		}
		     

	}
	
	
	public static boolean equals(int firstArray[], int secondArray[]) {
		for (int i=0; i<firstArray.length && i<secondArray.length; i++) {
			if (firstArray[i] != secondArray[i]) {
				return false;
			}
		}
		return true;
	}

}
