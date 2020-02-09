import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Naloga21{
	
	static DecimalFormat decFormat = new DecimalFormat("#.##");

	public static void main(String[] args) throws IOException{
			
		while(true) {
			try {
				izbirniMeni();
				break;
			}
			catch (Exception e) {
				System.out.println("Ni vnesena stevilka!");
			}
		}
		
	}

	private static void izbirniMeni() throws IOException{
		System.out.println("1 - Sestej");
		System.out.println("2 - Odstej");
		System.out.println("3 - Mnozi");
		System.out.println("4 - Deli");
		System.out.println("5 - Modul");
		System.out.println("6 - Potenca");
		System.out.println("7 - Hipotenuza");
		System.out.println("8 - Koren");
		System.out.println("9 - Faktor");
		System.out.println("10 - Izhod");
		
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Ukaz: ");
		int ukaz = Integer.parseInt(beri.readLine() );
		killSwitch(ukaz);
	}

	private static void killSwitch(int ukaz) throws IOException{
		switch(ukaz) {
		case 1: sestej(); break;
		case 2: odstej(); break;
		case 3: mnozi(); break;
		case 4: deli(); break;
		case 5: modul(); break;
		case 6: potenca(); break;
		case 7: hipotenuza(); break;		
		case 8: koren(); break;		
		case 9: faktor(); break;		
		case 10: System.exit(0); break;
		default: System.out.println("Neveljaven ukaz!");
			
		}
		
	}

	private static void sestej() throws IOException{
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi prvo stevilo: ");
		double num1 = Double.parseDouble(beri.readLine());
		System.out.print("Vnesi drugo stevilo: ");
		double num2 = Double.parseDouble(beri.readLine());
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2) );
		
	}
	
	private static void odstej() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi prvo stevilo: ");
		double num1 = Double.parseDouble(beri.readLine());
		System.out.print("Vnesi drugo stevilo: ");
		double num2 = Double.parseDouble(beri.readLine());
		
		System.out.println(num1 + " - " + num2 + " = " + (num1-num2) );
		
	}
	
	private static void mnozi() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi prvo stevilo: ");
		double num1 = Double.parseDouble(beri.readLine());
		System.out.print("Vnesi drugo stevilo: ");
		double num2 = Double.parseDouble(beri.readLine());
		
		System.out.println(num1 + " * " + num2 + " = " + (num1*num2) );
		
	}
	
	private static void deli() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi prvo stevilo: ");
		double num1 = Double.parseDouble(beri.readLine());
		System.out.print("Vnesi drugo stevilo: ");
		double num2 = Double.parseDouble(beri.readLine());
		
		System.out.println(num1 + " / " + num2 + " = " + decFormat.format(num1/num2) );
		
	}
	
	private static void modul() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi prvo stevilo: ");
		double num1 = Double.parseDouble(beri.readLine());
		System.out.print("Vnesi drugo stevilo: ");
		double num2 = Double.parseDouble(beri.readLine());
		
		System.out.println(num1 + " % " + num2 + " = " + (num1%num2) );
		
	}
	
	private static void potenca() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi prvo stevilo: ");
		double num1 = Double.parseDouble(beri.readLine());
		System.out.print("Vnesi drugo stevilo: ");
		double num2 = Double.parseDouble(beri.readLine());
		
		System.out.println(num1 + " ^ " + num2 + " = " + decFormat.format(Math.pow(num1,num2) ) );
		
	}
	
	private static void hipotenuza() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi prvo stevilo: ");
		double num1 = Double.parseDouble(beri.readLine());
		System.out.print("Vnesi drugo stevilo: ");
		double num2 = Double.parseDouble(beri.readLine());
		
		
		System.out.print("Hipotenuza trikotnika s stranicama "+num1+" in "+num2+" je: ");
		System.out.println(decFormat.format(Math.sqrt(Math.pow(num1, 2)+Math.pow(num2, 2) ) ) );
		
	}
	
	private static void koren() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi stevilo: ");
		double num = Double.parseDouble(beri.readLine());
		
		System.out.println("Koren stevila "+num+" je "+decFormat.format(Math.sqrt(num) ) );
		
	}
	
	private static void faktor() throws IOException {
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesi stevilo: ");
		int num = Integer.parseInt(beri.readLine());
		int rezultat = 1;
		for(int i = num; i >= 1; i--) {
			rezultat *= i;
		}
		
		System.out.println("Faktor stevila "+num+" je "+ rezultat);
		
	}
	

}
