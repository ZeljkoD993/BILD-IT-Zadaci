package zadaci_13_02_2018;

import java.util.Scanner;

public class SmallestElementInArray {

	/*
	 * 2. Napisati metodu koja nalazi najmanji element u nizu decimalnih vrijednosti koristeći se sljedećim headerom:
		public static double min(double[ ] array)
		Napišite potom test program koji pita korisnika da unese deset brojeva te poziva ovu metodu da vrati najmanji element u nizu.
	 * 
	 */
	
	static  Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		double[] array = new double[10];
		System.out.println("Unesi 10 decimalnih brojeva, svaki broj u novu liniju.");
		System.out.println("----------------------------");
		for(int i=0; i<array.length; i++) {
			array[i] = input.nextDouble();
			System.out.println("Unesi slijedeci broj");
			System.out.println("----------------------------");
		}
		System.out.println("Najmanji decimalni broj u datom nizu je " + min(array));

	}
	
	public static double min(double[] array) {
		double najmanji = array[0];
		for (int i=0; i<array.length; i++) {
			if (najmanji > array[i]) {
				najmanji = array[i];
			}
		}
		return najmanji;
	}
	

}
