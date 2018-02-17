package zadaci_15_02_2018;

import java.util.Scanner;

public class InvesticijaGodisnja {
	
   /*
    * 1. Napisati program koji učitava iznos investicije, godišnju interesnu stopu i broj godina te vraća buduću vrijednost investicije koristeći
    *  se sljedećom formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12.
    *   Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj godina program vam vraća 1032.98 
    *   kao buducu vrijednost investicije.
    * 
    */

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {


		System.out.println("Unesite iznos investicije: ");
		System.out.println("-------------------------- ");
		double iznosInvesticije = input.nextDouble();

		System.out.println("Unesite iznos interesne stope: ");
		System.out.println("-------------------------- ");
		double interesnaStopa = input.nextDouble();

		System.out.println("Unesite broj godina: ");
		System.out.println("---------------------");
		double brojGodina = input.nextDouble();

		interesnaStopa = interesnaStopa / 1200;
		double buducaVrijednost = iznosInvesticije * Math.pow(1 + interesnaStopa, brojGodina * 12);

		System.out.printf("Buduca vrijednost investicije je: %.2f", buducaVrijednost);


	}

}
