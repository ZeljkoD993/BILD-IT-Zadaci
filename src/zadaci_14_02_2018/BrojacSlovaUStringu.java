package zadaci_14_02_2018;

import java.util.Scanner;

public class BrojacSlovaUStringu {
	
	/*
	 * 5. Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeći header: public static int countLetters(String s). 
	 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
	 */

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	
		
		System.out.println("Unesite string: ");
		System.out.println("-----------------");
		String string = input.nextLine();

		System.out.println("Broj slova u stringu je: " + borojSlovaUStringu(string));
		
		

	}
	
	public static int borojSlovaUStringu(String s) {

		int brojSlova = 0;

		for (int i = 0; i < s.length(); i++)
			if (Character.isLetter(s.charAt(i)))
				brojSlova++;

		return brojSlova;
	}


}
