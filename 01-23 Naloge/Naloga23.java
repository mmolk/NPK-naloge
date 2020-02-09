import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Naloga23 {

	public static void main(String[] args) {
		
		String imeDat = "stevila.txt";
		double sum = 0.0;
		
		//try-catch za branje iz datoteke:
		try {
			System.out.println("Vsebina datoteke: " + imeDat + "\n");
			BufferedReader beriFajl = new BufferedReader(new FileReader(imeDat) );
			String vrstica;
			while( (vrstica = beriFajl.readLine() ) != null) {
				sum += Double.parseDouble(vrstica);
			}
			beriFajl.close();
		} catch (IOException e) {
			System.out.println("Napaka pri branju iz datoteke " + imeDat);
		}
		
		//try-catch za pisanje v datoteko:
		try {
			BufferedWriter pisanje = new BufferedWriter(new FileWriter(imeDat, true ));
			pisanje.newLine();
			pisanje.write(Double.toString(sum));
			pisanje.close();
		} catch (IOException e) {
			System.out.println("Napaka pri pisanju v datoteko " + imeDat);
		}
		
		System.out.println("vsota: " + sum);
		

	}//end main

}
