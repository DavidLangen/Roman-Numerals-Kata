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
