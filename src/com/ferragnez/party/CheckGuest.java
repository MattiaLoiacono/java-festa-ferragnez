package com.ferragnez.party;
import java.util.Scanner;

class CheckGuest {

	public static void main(String[] args) {
		
		String[] Guest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Come si chiama? ");
		String nome = scan.nextLine();
		boolean ok = false;
		int i = 0;
		
		 while (i < Guest.length) {
			 if ( nome.equals(Guest[i]) ) {
					ok = true;
					break;
				}	
			 i++;
		 }
		 
		/*
		for (i = 0; i < Guest.length; i++) {
			if ( nome.equals(Guest[i]) ) {
				ok = true;
				break;
			}	
		}
		*/
		
		if (ok) {
			System.out.print("La stavamo aspettando, prego...");
		} else {
			System.out.print("Il suo nome non è nella lista degli invitati devo chiederle di andarsene");
		}
		
		scan.close();
	}

}
