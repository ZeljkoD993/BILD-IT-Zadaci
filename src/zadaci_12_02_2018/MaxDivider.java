package zadaci_12_02_2018;

import java.util.Scanner;

public class MaxDivider {
	
	/*
	 * 
	 * 3. Napisati metodu koja prima dva cijela broja kao argumente te vraća najveći zajednički djelilac za ta dva broja.

			PRIMJER:
			
			Unesite prvi broj: 125
			Unesite drugi broj: 2525
			Najveći zajednički djelilac za brojeve 125 i 2525 je 25.
	 */
	

	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		System.out.println("Unesite prvi broj:");
		System.out.println("------------------");
		
		int firstNum = input.nextInt();
		
		System.out.println("Unesite drugi broj:");
		System.out.println("------------------");
		int secondNum = input.nextInt();
		
		
		maxDivider(firstNum, secondNum);
		
		

	}
	
	
	
	
	
	public static void maxDivider(int firstNum, int secondNum) {
		int divider = 1;
		
		for(int i = 1; i <= firstNum && i <= secondNum; i++) {
			if (firstNum % i == 0 && secondNum % i == 0) {
				divider = i;
			}
		}
		
		System.out.println("Najveci zajednicki djelilac za brojeve: " + firstNum + " i " + secondNum + " je " + divider);
	}

}
