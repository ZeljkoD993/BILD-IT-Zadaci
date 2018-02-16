package zadaci_14_02_2018;

import java.util.Scanner;

public class ObrnutiRedoslijedBrojeva {
	
	/*
	 * 4. Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
	 */

	
	static Scanner input= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] brojevi = new int[10];
		System.out.println("Unesite 10 brojeva: ");
		System.out.println("----------------------------- ");
		for (int i = 0; i < 10; i++) {
			brojevi[i] = input.nextInt();
			}
		obrniBrojeve(brojevi);

	}
	
	public static void obrniBrojeve(int[] brojevi) {
		System.out.print("Brojevi u obrnutom redosljedu: ");
		for (int i = brojevi.length-1; i >=0 ; i--) {
			System.out.print(brojevi[i] + " ");
			}
	}

}
