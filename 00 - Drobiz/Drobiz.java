import java.util.Scanner;

public class Drobiz {
	
	static Scanner skener = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println(">>> NALOGA - DROBIZ <<<\n");
		
		System.out.print("Vpisite znesek racuna: ");
		double racun = Double.parseDouble(skener.nextLine());
		
		System.out.print("Vrocen denar: ");
		double placilo = Double.parseDouble(skener.nextLine());
		
		double vracilo = placilo-racun;
		
		System.out.println("\nVracilo skupaj znasa: " + vracilo);
		System.out.println("Po apoenih pa: ");
		
		// stevci za posamezne apoene (od 500 EUR do 1 cent)
		int eur500 = 0, eur200 = 0, eur100 = 0, eur50 = 0, eur20 = 0, eur10 = 0, eur5 = 0;
		int eur2 = 0, eur1 = 0, cent50 = 0, cent20 = 0, cent10 = 0, cent5 = 0, cent2 = 0, cent1 = 0;

		while(vracilo >= 0) {
			
			/* if-else blok: odsteva od zneska po apoenih 
			 * in povecuje zgoraj definirane counterje za vsak apoen.
			 * To dela dokler 'vracilo' ne pride do 0.
			 * Metoda 'zaokrozi' zaokrozi decimalno vrednost stevila.
			 */
			if((vracilo-500)>=0) {
				eur500++; vracilo-=500; vracilo = zaokrozi(vracilo); 
			} else if ((vracilo-200)>=0) {
				eur200++; vracilo-=200; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-100)>=0) {
				eur100++; vracilo-=100; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-50)>=0) {
				eur50++; vracilo-=50; vracilo = zaokrozi(vracilo); 
			} else if ((vracilo-20)>=0) {
				eur20++; vracilo-=20; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-10)>=0) {
				eur10++; vracilo-=10; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-5)>=0) {
				eur5++; vracilo-=5; vracilo = zaokrozi(vracilo);    // do tu so bankovci
			} else if ((vracilo-2)>=0) {
				eur2++; vracilo-=2; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-1)>=0) {
				eur1++; vracilo-=1; vracilo = zaokrozi(vracilo);  // do tu so evri
			} else if ((vracilo-0.5)>=0) {
				cent50++; vracilo-=0.5; vracilo = zaokrozi(vracilo); 
			} else if ((vracilo-0.2)>=0) {
				cent20++; vracilo-=0.2; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-0.1)>=0) {
				cent10++; vracilo-=0.1; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-0.05)>=0) {
				cent5++; vracilo-=0.05; vracilo = zaokrozi(vracilo); 
			} else if ((vracilo-0.02)>=0) {
				cent2++; vracilo-=0.02; vracilo = zaokrozi(vracilo);  
			} else if ((vracilo-0.01)>=0) {
				cent1++; vracilo-=0.01; vracilo = zaokrozi(vracilo);   // do tu so centezimi
			} else
				break;
			
		}
		

			if(eur500>0)
				System.out.println(eur500 + "x 500 EUR"); 
			if(eur200>0)
				System.out.println(eur200 + "x 200 EUR"); 
			if(eur100>0)
				System.out.println(eur100 + "x 100 EUR");
			if(eur50>0)
				System.out.println(eur50 + "x 50 EUR");
			if(eur20>0)
				System.out.println(eur20 + "x 20 EUR");
			if(eur10>0)
				System.out.println(eur10 + "x 10 EUR");
			if(eur5>0)
				System.out.println(eur5 + "x 5 EUR");
			if(eur2>0)
				System.out.println(eur2 + "x 2 EUR");
			if(eur1>0)
				System.out.println(eur1 + "x 1 EUR");
			if(cent50>0)
				System.out.println(cent50 + "x 50 centov");
			if(cent20>0)
				System.out.println(cent20 + "x 20 centov");
			if(cent10>0)
				System.out.println(cent10 + "x 10 centov");
			if(cent5>0)
				System.out.println(cent5 + "x 5 centov");
			if(cent2>0)
				System.out.println(cent2 + "x 2 centov");
			if(cent1>0)
				System.out.println(cent1 + "x 1 centov"); 
			
		
//		System.out.printf("500=%d 200=%d 100=%d 50=%d 20=%d 10=%d 5=%d 2=%d 1=%d 0,5=%d 0,2=%d 0,1=%d 0,05=%d 0,02=%d 0,01=%d ", 
//				eur500, eur200, eur100, eur50, eur20, eur10, eur5, eur2, eur1, cent50, cent20, cent10, cent5, cent2, cent1);
			
			System.out.println("\n>> KONEC PROGRAMA <<");
	}
	
	public static double zaokrozi(double d) {
		
		return Math.round(d*1000)/1000.0;
		
	}

}
