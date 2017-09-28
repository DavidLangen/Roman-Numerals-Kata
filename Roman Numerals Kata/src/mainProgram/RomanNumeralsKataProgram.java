package mainProgram;

import java.util.Scanner;

public class RomanNumeralsKataProgram {

	//Einstellungen fürs Interface
	private static String ueberschrift = " Menü ";
	private static int breite = 100;
		
	private static final char encodeZeichen = 'e';
	private static final char decodeZeichen = 'd';
	private static final char beendenZeichen = 'x';
	private static boolean wiederholen = false;
			
			
	private static char[] zeichen = {encodeZeichen,decodeZeichen,beendenZeichen};
	private static String[] text = {"um von einer Ganzzahl nach einer römischen Zahl...",
							 		"um von einer römischen Zahl nach einer Ganzzahl...",
							 		"das Programm zu beenden."};
			
	private static int hoehe = zeichen.length*2;
			
			
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		
		do{
			
		int zeichenIndex = 0;
		char eingabe = printMenu(zeichenIndex);
		
		switch (eingabe) {
			case encodeZeichen :
				String ueberschriftEncode = " Von Ganzahl nach römische Zahl ";
				printHeader(ueberschriftEncode);
				
				System.out.println();
				System.out.print("Deine Zahl:");
				int eingabeEncoder = scan.nextInt();
				
				String roemischeZahl = romanNumeralsEncoder(eingabeEncoder);
				System.out.println("\nAls römische Zahl:"+roemischeZahl+"\n");
				
				printFooter(ueberschriftEncode);
				
				wiederholen = true;
				break;
			case decodeZeichen :
				String ueberschriftDecoder = " Von_Ganzzahl_nach_römische_Zahl ";
				printHeader(ueberschriftDecoder);
				
				System.out.println();
				System.out.print("Deine römische Zahl:");
				String eingabeDecoder = scan.next();
				
				int ganzzahl = romanNumeralsDecoder(eingabeDecoder);
				System.out.println("\nAls Ganzzahl:"+ganzzahl+"\n");
				
				printFooter(ueberschriftDecoder);
				
				wiederholen = true;
				break;
			case beendenZeichen :
				wiederholen = false;
				break;
	
			default:
				wiederholen = true;
				break;
		}
		System.out.println("");
		}while(wiederholen);
		
		scan.close();
		System.out.println("\n...Das Programm wurde beendet.");

	}

	private static char printMenu(int zeichenIndex) {
		printHeader(ueberschrift);
		
		System.out.println();
		System.out.println("Drücken Sie ...");
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
		System.out.println("... zu übersetzen");
		System.out.println();
		printFooter(ueberschrift);
		System.out.print("\nEingabe:");
		char eingabe = scan.next().charAt(0);
		return eingabe;
	}

	private static void printFooter(String ueberschrift) {
		for (int i = 0; i <= breite+ueberschrift.length()-1; i++) {
			System.out.print("*");
		}
	}

	private static void printHeader(String ueberschrift) {
		for (int i = 0; i <= breite; i++) {
			if(i == breite/2){
				System.out.print(ueberschrift);
			}else{
				System.out.print("*");
			}
			
		}
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
