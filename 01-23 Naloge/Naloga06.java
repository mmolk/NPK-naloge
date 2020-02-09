

public class Naloga06 {
	
	public static void main(String args[]) {
		/* MAIN */
		
		String str = args[0];
		
		char nakljucenZnak = str.charAt( (int) (Math.random()*str.length() ) );
		
		System.out.println("");
		System.out.println("Vneseni niz je: " +str);
		System.out.println("Nakljucna crka niza je: " + nakljucenZnak);
		System.out.println("Druga crka niza je: " + str.charAt(1) );
		System.out.println("Predzadnja crka niza je: " + str.charAt(str.length()-2)+"\n");
		
		/* MAIN - konec */
		}
	
		/* METODE */
		
	
}