package zadaci_15_02_2018;

import java.util.Scanner;

public class DuzinaPiste {

	/*
	 * 
	 * 5. Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, možemo
	 * izračunati minimalnu dužinu piste potrebne da avion uzleti koristeći se
	 * sljedećom formulom: dužina = v * v / 2a. Napisati program koji pita korisnika
	 * da unese v u m/s i a u m/s² te ispisuje korisniku minimalnu dužinu piste.
	 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je
	 * 514.286)
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Unesite brzinu ");
		System.out.println("-------------- ");
		
		double brzina = input.nextDouble();
		
		System.out.println("Unesite ubrzanje ");
		System.out.println("------------------");
		double ubrzanje = input.nextDouble();

		double duzina = Math.pow(brzina, 2) / (2 * ubrzanje);

		System.out.println("Minimalna duzina piste za avion je: " + duzina + " m");

	}

}
