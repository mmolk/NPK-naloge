

public class Naloga10 {
	
	public static void main(String args[]) {
		/* MAIN */
		System.out.println("");
		
		String str = args[0];
		int aStevec = 0;		
		int tStevec = 0;

		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'a'){
				aStevec++;
			}
			else if(str.charAt(i) == 't'){
				tStevec++;
			}
			else{
				continue;
			}
		}
		
		System.out.println("'a' se ponovi "+aStevec+"-krat");
		System.out.println("'t' se ponovi "+tStevec+"-krat\n");
		
		double aProc = (aStevec*100)/str.length();
		double tProc = (tStevec*100)/str.length();
		
		System.out.println("a = " + aProc + " %");
		System.out.println("t = " + tProc + " %");
		
		System.out.println("");
		/* MAIN - konec */
		}
	
		/* METODE */
		
}