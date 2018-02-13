package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxArrayNumber {
	/*
	 * 5. Napisati program koji učitava niz brojeva, pronalazi najveći broj te ispisuje koliko se puta taj broj ponavlja. 
	 * 	  Pretpostavimo da se unos brojeva završava sa nulom.
	 * 
	 */
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		
		int maxNumber  = 0;
		int counter = 0;

		System.out.println("Unesi cijeli broj, 0 prekida unos: ");
		System.out.println("---------------------------------- ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int number = input.nextInt();
		while (number != 0) {
			list.add(number);
			number = input.nextInt();
		}

		maxNumber = Collections.max(list);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == maxNumber) {
				counter++;
			}
		}
		System.out.println(
				"Najveci uneseni cijeli broj je: " + maxNumber + " i  ponavljao se " + counter + " puta.");

		input.close();
		
		

	}

}
