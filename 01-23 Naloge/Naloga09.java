

public class Naloga09 {
	
	public static void main(String args[]) {
		/* MAIN */
		System.out.println("");
		
		int stranica = (int) (Math.random()*15+3);
		int hipotenuza = stranica;
				
		for(int i = 0; i<stranica;i++){
			for(int j = 0; j<hipotenuza;j++){
				System.out.print("*");
			}
			System.out.println("");
			hipotenuza--;
		}		
		
		System.out.println("");
		/* MAIN - konec */
		}
	
		/* METODE */
		
}