import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Naloga22 {

	public static void main(String[] args) {
		
		String imeDat = "mojiNizi.txt";
		File datotekaTxt = new File(imeDat);
		
		//try-catch za kreiranje datoteke:
		if(!datotekaTxt.exists() ) {
			try {
				datotekaTxt.createNewFile();
				System.out.println("Datoteka " + imeDat + " je ustvarjena!\n");
			} catch (IOException e) {
				System.out.println("Napaka pri kreiranju datoteke!");
			}
		}
		
		//try-catch za pisanje v datoteko:
		try {
			
			BufferedWriter pisanje = new BufferedWriter(new FileWriter(datotekaTxt, true) );
			BufferedReader beriConsole = new BufferedReader(new InputStreamReader(System.in) );
			
			System.out.print("Vnesite piljuben niz: ");
			pisanje.write(beriConsole.readLine() );
			pisanje.newLine();
			
			pisanje.close();			
		} catch (IOException e) {
			System.out.println("Napaka pri pisanju v datoteko!");
		}


	}//end main

}
