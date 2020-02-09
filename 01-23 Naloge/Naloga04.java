

public class Naloga04 {
	
	public static void main(String args[]) {
		/* MAIN */
		
		String str = args[0];
		int letnica = 0;
		
		//Preveri ce je argument dolg 4 znake:
		if(str.length() != 4){
			System.out.println("\nNapaka - argument mora imeti 4 stevilke!\n");
		}else{
			letnica = Integer.parseInt(str);
		}
		
		int starost = 2019 - letnica;
				
		if(starost >= 18){
			System.out.println("\nStari ste "+starost+" let. Lahko se udelezite volitev.\n");
		}
		else{
			System.out.println("\nZal ste premladi. Volitev se lahko udelezite cez " + (18 - starost) + " let\n");
		}
		
		/* MAIN - konec */
		}
	
		/* METODE */
		
	
}