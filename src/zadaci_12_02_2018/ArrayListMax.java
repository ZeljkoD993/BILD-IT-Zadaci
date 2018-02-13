package zadaci_12_02_2018;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMax {
	
	/*
	 * 1. Napisati sljedecu metodu koja vraca najvecu vrijednosti u ArrayListu Integera.
		Metoda vraca null ukoliko je lista null iil ukoliko lista sadrzi 0 elemenata.
		public static Integer max(ArrayList<Integer> list)

	 */
	
	static Scanner input = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		System.out.println("Unesite 10 clanova niza");
		System.out.println("-----------------------");
		
		for(int i = 0; i < 10; i++) {
			int number = input.nextInt();
			lista.add(number);
		}
		
		input.close();
		System.out.println("Najveca vrijednost liste je " + max(lista));

	}
	
	
	
	
	
	public static Integer max(ArrayList<Integer> list) {
		Integer maxNumber = 0;
		
		if (list.isEmpty() && list.size() == 0) {
			return null;
		} else {
			for(int l : list) {
				if (l > maxNumber) {
					maxNumber = l;
				}
			}
			
			return maxNumber;
			
		}
		
		
		
		
	}
	

}
