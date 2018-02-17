package zadaci_15_02_2018;

import java.util.Scanner;

public class NeparnePozicijeString {

	/*
	 * 4. Napisati program koji pita korisnika da unese neki string te mu ispisuje
	 * sve karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik
	 * unese string Beijing Chicago, program vraća BiigCiao.
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite neki string");
		System.out.println("--------------------");
		String rijec = input.nextLine();

		for (int i = 0; i < rijec.length(); i += 2) {

			System.out.print(rijec.charAt(i));

		}

	}

}
