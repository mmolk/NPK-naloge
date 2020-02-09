import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Naloga18{

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
		System.out.println("7 - Izhod");
		
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
		case 7: System.exit(0); break;
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
		
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2) );
		
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
		
		System.out.println(num1 + " / " + num2 + " = " + Math.pow(num1,num2) );
		
	}
	

}
