package zadaci_15_02_2018;

import java.util.Scanner;

public class ObrnutiBrojevi {

	/*
	 * 3. Napisati metode sa sljedećim headerima: public static int reverse(int
	 * number) i public static boolean isPalindrome(int number). Prva metoda prima
	 * cijeli broj kao argument i vraća isti ispisan naopako. (npr. reverse(456)
	 * vraća 654.) Druga metoda vraća true ukoliko je broj palindrom a false ukoliko
	 * nije. Koristite reverse metodu da implementirate isPalindrome metodu.
	 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj
	 * palindrome ili ne.
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite cijeli broj");
		System.out.println("-------------------");

		int broj = input.nextInt();
		System.out.println(reverse(broj));

		if (isPalindrome(broj))
			System.out.println(" Broj je palindrom ");
		else
			System.out.println("Broj nije palindrom");

		

	}

	public static int reverse(int number) {

		int reverse = 0;
		while (number != 0) {

			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number) {

		if (number == reverse(number)) {
			return true;
		}
		return false;
	}

}
