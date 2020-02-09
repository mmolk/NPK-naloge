

public class Naloga07 {
	
	public static void main(String args[]) {
		/* MAIN */
		
		String str = args[0];
		
		int zacetniIndex = 0;
		int koncniIndex = str.length()-1;
		boolean jePalindrom = true;
		
		while(zacetniIndex < koncniIndex){
			
			if(str.charAt(zacetniIndex) != str.charAt(koncniIndex) ){
				jePalindrom = false;
				break;
			}else{
				jePalindrom = true;
			}
		
			zacetniIndex++;
			koncniIndex--;
		}
		
		if(jePalindrom){
			System.out.println("\nBeseda JE palindrom\n");
		}else{
			System.out.println("\nBeseda NI palindrom\n");
		}
		
		/* MAIN - konec */
		}
	
		/* METODE */
		
	
}