package mainProgram;

public class RomanNumeralsKataProgram {

	public static void main(String[] args) {
		

	}
	
	public static String romanNumeralsEncoder(int n){
		if(n<=0){
			return "";
		}
		String ergebnis= "";
		for (int i = 0; i < n; i++) {
			ergebnis += "I";
		}
		
		return ergebnis;
	}
	
	public static int romanNumeralsDecoder(String s){
		return 0;
	}
}
