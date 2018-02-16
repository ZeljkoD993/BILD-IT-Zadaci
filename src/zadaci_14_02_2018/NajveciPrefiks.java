package zadaci_14_02_2018;

import java.util.Scanner;

public class NajveciPrefiks {

	/*
	 * 3. Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveći zajednički prefix za ta dva stringa, ukoliko isti postoji. 
	 * Na primjer, ukoliko korisnik unese sljedeća dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da ispiše: 
	 * Najveći zajednički prefix za dva stringa je "Dobrodošli u". 
	 */
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Unesite prvi string: ");
		System.out.println("---------------------");
		String string1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		System.out.println("----------------------");
		String string2 = input.nextLine();
		pronadjiPrefiks(string1, string2);

	}
	
	
	public static void pronadjiPrefiks (String string1, String string2) {
		  String mali,veliki;
		  int index = 0; 
	         if(string1.length() > string2.length()) {
	        	 mali = string2;
	        	 veliki = string1;
	        	 }
	          else
	            {
	        	  mali = string1;
	        	  veliki = string2;
	        	  }	           
	        for(char slovo: veliki.toCharArray())
	        {
	            if(index == mali.length()) break;
	            if(slovo != mali.charAt(index)) break;
	            index++;
	        }
	        if(index==0)
	          System.out.println("" + string1 + " i "+ string2 + " nemaju zajednicki prefiks.");
	        else
	          System.out.println("Zajednicki prefiks je " + veliki.substring(0,index) + ".");
	    }

}
