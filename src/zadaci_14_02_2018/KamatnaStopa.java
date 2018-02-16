package zadaci_14_02_2018;

import java.util.Scanner;

public class KamatnaStopa {
	
	/*
	 * 1. Pretpostavimo da uplatimo $100 svaki mjesec na štedni račun koji ima godišnju interesnu stopu od 5%. 
	 * Mjesečna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na računu postaje 100 * (1 + 0.00417) = 100.417. 
	 * Nakon drugog mjeseca, vrijednost na računu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
	 * Nakon trećeg mjeseca, vrijednost na računu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
	 * Napisati program koji pita korisnika da unese mjesečni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje računa. 
	 * 
	 */
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.out.println("Unesite mjesecnu uplatu: ");
		 System.out.println("-------------------------");
		 double uplata = input.nextDouble();
		 System.out.println("Unesite broj mjeseci za stednju: ");
		 System.out.println("-------------------------");
		 int mjesec = input.nextInt();
		 System.out.println("Stanje vaseg racuna je: " + proracun(uplata, mjesec) + " KM.");

	}
	
	public static double proracun(double uplata, int mjesec) {
		double konacno=0;
		 for (int i=1; i<=mjesec; i++) {
			konacno = (uplata+konacno)* (1+0.00417);	
			}
		 return konacno;
	}

}
