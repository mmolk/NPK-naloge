import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StetjeBesed {

	static final int DELAY = 50;

	public static void main(String[] args) {

		System.out.println(">>> NALOGA - Stetje besed <<<\n");
		delayedPrint("Sestevanje besed v datoteki.\n\n", DELAY);
		delayedPrint("Vpisite ime datoteke: ", DELAY);

		try {
			String datBesedilo = branjeConsole();
			File fileBesedilo = new File(datBesedilo);

			BufferedReader bralnik = new BufferedReader(new FileReader(fileBesedilo));
			String vrstica;
			int stevecBesed = 0;

			while ((vrstica = bralnik.readLine()) != null) {
				String[] poljeBesed = vrstica.split(" ");

				for (int i = 0; i < poljeBesed.length; i++)
					stevecBesed++;
			}

			delayedPrint("Stejem besede: ", DELAY);
			delayedPrint("|||||||||||||||||||||||||\n\n", 75);
			delayedPrint("V datoteki " + datBesedilo + " je: ", DELAY);
			delayedPrint(stevecBesed + " besed.\n", DELAY);

		} catch (IOException e) {
			System.out.println("NAPAKA: Datoteka ne obstaja!");
		}

		delayedPrint("\n>> KONEC PROGRAMA <<", DELAY);

	} // >>> END MAIN

	public static void delayedPrint(String s, int millisec) {

		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i));
				Thread.sleep(millisec);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread error!");
		}
	}

	public static String branjeConsole() throws IOException {

		BufferedReader bralnikConsole = new BufferedReader(new InputStreamReader(System.in));
		return bralnikConsole.readLine();

	}

}
