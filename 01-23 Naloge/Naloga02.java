

public class Naloga02 {
	
	public static void main(String args[]) {
		/* MAIN */
		
		int st1 = Integer.parseInt(args[0]);
		int st2 = Integer.parseInt(args[1]);
		int st3 = Integer.parseInt(args[2]);
		int st4 = Integer.parseInt(args[3]);
		int st5 = Integer.parseInt(args[4]);
		int najmanjsi = Math.min(st1, Math.min(st2, Math.min(st3, Math.min(st4, st5))));
		int najvecji = Math.max(st1, Math.max(st2, Math.max(st3, Math.max(st4, st5))));
		int povprecje = (st1+st2+st3+st4+st5)/5;
		
		System.out.println("\nNajmanjse stevilo je: " + najmanjsi );
		System.out.println("Najvecje stevilo je: " + najvecji );
		System.out.println("Povprecje vpisanih stevil je: " + povprecje );		
		
		/* MAIN - konec */
		}
	
		/* METODE */
		
	
}