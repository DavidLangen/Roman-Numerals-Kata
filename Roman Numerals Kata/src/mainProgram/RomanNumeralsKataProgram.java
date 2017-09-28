package mainProgram;

import java.util.Scanner;

public class RomanNumeralsKataProgram {

	public static void main(String[] args) {
		
		//Einstellungen f�rs Interface
		String ueberschrift = " Men� ";
		int breite = 50;
		
		final char encodeZeichen = 'e';
		final char decodeZeichen = 'd';
		final char beendenZeichen = 'x';
		boolean wiederholen = true;
		
		
		char[] zeichen = {encodeZeichen,decodeZeichen,beendenZeichen};
		String[] text = {"um von Ganzzahl nach r�mische Zahl...",
						 "um von r�mischer Zahl nach Ganzzahl...",
						 "das Programm zu beenden."};
		
		int hoehe = zeichen.length*2;
		
		
		Scanner scan = new Scanner(System.in);
		
		do{
		int zeichenIndex = 0;
		
		for (int i = 0; i <= breite; i++) {
			if(i == breite/2){
				System.out.print(ueberschrift);
			}else{
				System.out.print("*");
			}
			
		}
		System.out.println();
		System.out.println("Dr�cken Sie ...");
		System.out.println();
		for (int i = 0; i <= hoehe && zeichenIndex < zeichen.length; i++) {
			if(i%2 == 0){
				System.out.println("- ("+zeichen[zeichenIndex]+") ..."+text[zeichenIndex]);
				zeichenIndex++;
			}else{
				System.out.println("");
			}
			
		}
		System.out.println();
		System.out.println("... zu �bersetzen");
		System.out.println();
		for (int i = 0; i <= breite+ueberschrift.length()-1; i++) {
			System.out.print("*");
		}
		System.out.print("\nEingabe:");
		char eingabe = scan.next().charAt(0);
		switch (eingabe) {
			case encodeZeichen :
				
				break;
			case decodeZeichen :
						
				break;
			case beendenZeichen :
				wiederholen = false;
				break;
	
			default:
				wiederholen = true;
				break;
		}
		System.out.println();
		}while(wiederholen);
		
		scan.close();
		System.out.println("\n...Das Programm wurde beendet.");

	}
	
	public static String romanNumeralsEncoder(int n){
		if(n<=0){
			return "";
		}
		
		String ergebnis= "";
		int rest_n = n;
		
		String[] r_zeichen = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] r_werte = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
		
		for (int j = 0; j < r_werte.length && rest_n > 0; j++) {
			if(rest_n - r_werte[j] >= 0){
				ergebnis+= r_zeichen[j];
				rest_n-= r_werte[j];
				j = -1;
			}else{
				continue;
			}
		}
		return ergebnis;
	}
	
	public static int romanNumeralsDecoder(String s){
		s = s.toUpperCase();
		
		if(s.matches(".*I{2,}[VX]{1}.*") || s.matches(".*[VX]{1}I{4,}.*")){
			return -1;
		}
		
		if(s.matches("[MCDXLVI]+")){
			int ergebnis = 0;
			String restString = s;
			
			String[] r_zeichen = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
			int[] r_werte = {1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
			
			for (int i = r_zeichen.length-1; i >= 0  && !restString.isEmpty(); i--) {
				
				if(restString.matches(".*"+r_zeichen[i]+"$")){
					ergebnis+=r_werte[i];
					if(ergebnis > 3999){
						return -1;
					}
					int index = restString.lastIndexOf(r_zeichen[i]);
					restString = restString.substring(0,index);
					i=r_zeichen.length;
				}else{
					continue;
				}
			}
			return ergebnis;
		}
		return -1;
	}
}
