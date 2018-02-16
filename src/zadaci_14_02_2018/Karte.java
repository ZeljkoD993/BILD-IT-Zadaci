package zadaci_14_02_2018;

public class Karte {
	
	/*
	 * 
	 * 
		2.  Napisati program koji simulira nasumično izvlačenje karte iz špila od 52 karte. 
		Program treba ispisati koja karta je izvučena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). 
		Primjer: Karta koju ste izvukli je 10 u znaku kocke.

	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int broj = (int)(Math.random() * 13) + 1;
		int simbol = (int)(Math.random() * 4) + 1;
		String karta=" ";
		pronadjiKartu(broj, simbol, karta);

	}
	
public static void pronadjiKartu (int broj, int simbol, String karta) {
		
		switch (simbol) {
		case 1:
			karta = "srce";
			break;
		case 2:
			karta = "pik";
			break;
		case 3:
			karta = "djetelina";
			break;
		case 4:
			karta = "kocka";
			break;
		}
		switch (broj) {
		case 1:
			System.out.println("Karta koju ste izvukli je A, u znaku " + karta +".");
			break;
		case 2:
			System.out.println("Karta koju ste izvukli je 2, u znaku " + karta +".");
			break;
		case 3:
			System.out.println("Karta koju ste izvukli je 3, u znaku " + karta +".");
			break;
		case 4:
			System.out.println("Karta koju ste izvukli je 4, u znaku " + karta +".");
			break;
		case 5:
			System.out.println("Karta koju ste izvukli je 5, u znaku " + karta +".");
			break;
		case 6:
			System.out.println("Karta koju ste izvukli je 6, u znaku " + karta +".");
			break;
		case 7:
			System.out.println("Karta koju ste izvukli je 7, u znaku " + karta +".");
			break;
		case 8:
			System.out.println("Karta koju ste izvukli je 8, u znaku " + karta +".");
			break;
		case 9:
			System.out.println("Karta koju ste izvukli je 9, u znaku " + karta +".");
			break;
		case 10:
			System.out.println("Karta koju ste izvukli je 10, u znaku " + karta +".");
			break;
		case 12:
			System.out.println("Karta koju ste izvukli je J, u znaku " + karta +".");
			break;
		case 13:
			System.out.println("Karta koju ste izvukli je Q, u znaku " + karta +".");
			break;
		case 14:
			System.out.println("Karta koju ste izvukli je K, u znaku " + karta +".");
			break;
		}


}

}
