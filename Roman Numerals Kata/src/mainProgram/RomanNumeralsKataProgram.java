package mainProgram;

public class RomanNumeralsKataProgram {

	public static void main(String[] args) {
		

	}
	
	public static String romanNumeralsEncoder(int n){
		if(n<=0){
			return "";
		}
		
		String ergebnis= "";
		int rest_n = n;
		
		String[] r_zeichen = {"V","IV","I"};
		int[] r_werte = {5,4,1}; 
		
		if(n<=3){
			for (int i = 0; i < n; i++) {
				ergebnis += "I";
			}
		}else{
			
			for (int j = 0; j < r_werte.length; j++) {
				if(rest_n-r_werte[j] >= 0){
					ergebnis+= r_zeichen[j];
					rest_n-= r_werte[j];
				}
			}
		}
		
		
		return ergebnis;
	}
	
	public static int romanNumeralsDecoder(String s){
		return 0;
	}
}
