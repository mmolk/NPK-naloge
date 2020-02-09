
public class Naloga20 {

	public static void main(String[] args) {
		
		int[] tabelca = new int[50];
		
		for(int i=0;i<tabelca.length;i++) {
			tabelca[i] = (int) (Math.random()*5000+1000);
		}
		
		System.out.println("Povprecna vrednost stevil v tabeli je: " + povprecjeTab(tabelca) );
		izpisiTab(tabelca);
		
	}
	/* Metode */
	public static double povprecjeTab(int[] tab) {
		double stevec = 0.0;
		for(int i=0;i<tab.length;i++) {
			stevec += tab[i];
		}
		return stevec/tab.length;
	}
	
	public static void izpisiTab(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.print(tab[i] + " ");
		}
		System.out.println();
	}

}
