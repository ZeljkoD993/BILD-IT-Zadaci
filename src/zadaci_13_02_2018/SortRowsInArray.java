package zadaci_13_02_2018;

import java.util.Scanner;

public class SortRowsInArray {
	/*
	 * 5. Implementirati sljedeću metodu da sortira redove u 2D nizu.
		public static double[ ][ ] sortRows(double[ ][ ] array)
		Napisati testni program koji pita korisnika da unese 3x3 matricu (ili da pita korisnika koliku matricu želi unijeti) 
		te mu ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg broja do najvećeg.
	 * 
	 */
	
	static  Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Unesi 5x5 matricu");
		System.out.println("-----------------");
		double[][] array2D = new double[3][3];
		for (int i=0; i<array2D.length; i++) {
			for (int j=0; j<array2D[0].length; j++) {
				array2D[i][j] = input.nextDouble();
			}
		}
		array2D = sortRows(array2D);
		for (int i=0; i<array2D.length; i++) {
			for (int j=0; j<array2D.length; j++) {
				System.out.print(array2D[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	
	public static double[][] sortRows(double[][] array){
		double numholder = 0;
		for (int i=0; i<array.length; i++) {
			for (int j=1; j<array[0].length; j++) {
				if (array[i][j-1]>array[i][j]) {
					numholder = array[i][j-1];
					array[i][j-1] = array[i][j];
					array[i][j] = numholder;
					numholder = 0;
				}
			}
		}
		return array;
	}


}
