package zadaci_12_02_2018;

import java.util.Scanner;

public class RepeatingNumbers {
	
	/*
	 * 4. Napišite program koji generiše 100 nasumičnih cijelih brojeva između 0 i 9 te ispisuje koliko se puta koji broj ponovio.
	 * 
	 */

	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
				int[] array = new int[10];

				
				for (int i = 0; i < 100; i++) {
					
					array[Random()]++;
				}
				
				

				for (int i = 0; i < array.length; i++) {
					System.out.println(i + " broj se ponavlja " + array[i] + " puta.");
				}

	}
	
	
	public static int Random() {
		int number = (int) (Math.random() * 10);
		return number;
	}

}
