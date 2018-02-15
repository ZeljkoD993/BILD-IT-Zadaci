package zadaci_13_02_2018;

import java.util.Scanner;

public class LargestElementInArray {
	
	/*
	 * 4. Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu. Metoda treba da koristi sljedeći header:
		public static int[ ] locateLargest(double[ ][ ] a)
		Napisati test program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju najvećeg elementa u nizu.

	 */
	static  Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		
		
		System.out.println("Unesi 5x5 niz");
		System.out.println("-------------");
		double array2D[][] = new double[5][5];
		for (int i=0; i<array2D.length; i++) {
			for (int j=0; j<array2D[0].length; j++) {
				array2D[i][j] = input.nextDouble();
			}
		}
		int niz[] = locateLargest(array2D);
		System.out.println("Koordinate najveceg elementa u 5x5 nizu su " + niz[0] + " " + niz[1]);

	}
	
	
	public static int[] locateLargest(double[][] a) {
		double max = 0;
		int[] location = new int[2];
		for (int i=0; i< a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}

}
