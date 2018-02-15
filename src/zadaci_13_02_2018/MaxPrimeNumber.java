package zadaci_13_02_2018;

import java.util.Scanner;

public class MaxPrimeNumber {
	
	/*
	 * 1. Napisati metodu koja prima 2 argumenta: početni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
		BONUS: metoda može primati i treći argument, broj brojeva za isprintati po liniji.
	 * 
	 */
	static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Unesite pocetni i krajnji broj, te koliko brojeva zelite u redu");
		System.out.println("---------------------------------------------------------------");
		
		int firstNum = input.nextInt();
		int secondNum = input.nextInt();
		int thirdNum = input.nextInt();
		
		maxNumberRange(firstNum, secondNum, thirdNum);
		
		
		
		
		

	}
	
	public static void maxNumberRange (int firstNum, int secondNum, int thirdNum) {
		int counter = 1;
		for (int i=firstNum; i<=secondNum; i++) {
			if (isPrime(i)) {
				if (counter < thirdNum) {
					System.out.print(i + " ");
					counter++;
				}
				else {
					System.out.println(i);
					counter = 1;
				}
			}
		}
	}
	
	public static boolean isPrime (int number) {
		for (int i=2; i<=number/2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
