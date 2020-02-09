

public class Naloga11 {
	
	public static void main(String args[]) {
		/* MAIN */
		System.out.println("");
		
		int vnos = Integer.parseInt(args[0]);
		String mesec = "";
		
		switch(vnos){
			case 1: mesec = "Januar"; break;
			case 2: mesec = "Februar"; break;
			case 3: mesec = "Marec"; break;
			case 4: mesec = "April"; break;
			case 5: mesec = "Maj"; break;
			case 6: mesec = "Junij"; break;
			case 7: mesec = "Julij"; break;
			case 8: mesec = "Avgust"; break;
			case 9: mesec = "September"; break;
			case 10: mesec = "Oktober"; break;
			case 11: mesec = "November"; break;
			case 12: mesec = "December"; break;
			default: mesec = "Great Scott!";
		}
		
		System.out.println(mesec);
		
		System.out.println("");
		/* MAIN - konec */
		}
	
		/* METODE */
		
}