package zadaci_12_02_2018;

import java.util.Scanner;

public class NumberOfVowels {
	
	
	/*
	 * 2. Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam) 
	 * Napisati program koji pita korisnika da unese string te mu ispište broj samoglasnika i suglasnika u datom stringu.

	 */
	
	
	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Unesite string:");
		System.out.println("---------------");
		
		String s = input.nextLine();
		counterVowels(s);
		
		

	}
	
	
	public static void counterVowels(String s) {
		int vowels = 0;
		int notVowels = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i)== 'u') {
				vowels++;
			} else
				notVowels++;
		}
		
		
		System.out.println("Broj samoglasnika u stringu je: " + vowels + " broj suglasnika je " + notVowels);
	}
	

}
