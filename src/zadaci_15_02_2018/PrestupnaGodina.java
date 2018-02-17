package zadaci_15_02_2018;

import java.util.Scanner;

public class PrestupnaGodina {

	/*
	 * 2. Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
	 * rasponu godina koje korisnik unese. Program pita korisnika da unese početnu
	 * godinu, krajnju godinu te ispisuje sve godine u tom rasponu. Razmak između
	 * godina treba biti jedan space.
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Unesite zeljenu pocetnu godinu: ");
		System.out.println("------------------------------- ");
		int pocetna = input.nextInt();

		System.out.println("Unesite zeljenu krajnju godinu: ");
		System.out.println("------------------------------- ");
		int krajnja = input.nextInt();

		int counter = 0;
		for (int i = pocetna; i < krajnja; i++) {
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
				counter++;
				if (counter % 10 == 0) {
					System.out.println(i);

				} else {
					System.out.print(i + " ");
				}
			}

		}
	}
}