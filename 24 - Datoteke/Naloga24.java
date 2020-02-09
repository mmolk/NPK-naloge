import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Naloga24 {
	
	/* NAVODILA:
	 * 1. vsa števila, ki so deljiva s 3, 5 in 11 zapiše v datoteko deljva.txt,
	 * 2. sešteje vsa števila v posamezni vrstici in rezultate zapiše v datoteko 
	 *    sesteteVrstice.txt, kjer naj bodo vsi rezultati v isti vrsti, ločeni s 
	 *    podpičjem (pred prvim številom in za zadnjim, ne sme biti podpičja)
	 * 3. vsa števila, ki so praštevila, zapiše v datoteko prastevila.txt
	 * 4. izračuna povprečno vrednost vseh števil v datoteki in rezultat izpiše v 
	 *    konzoli (terminal)
	 */

	public static void main(String[] args) {

		System.out.println(">>> NALOGA 24 <<<\n");

		String datStevila = "stevila.txt";
		File datoteka = new File(datStevila);

		/*
		 * BRISANJE DATOTEK: Program briše datoteke, da ne dodaja istih številk v iste
		 * datoteke, če večkrat zaženemo program:
		 */
		File sumVrstic = new File("sestevekVrstic.txt");
		File deljiva = new File("deljiva.txt");
		File prastevila = new File("prastevila.txt");

		if (deljiva.exists())
			brisiDatoteko(deljiva);

		if (sumVrstic.exists())
			brisiDatoteko(sumVrstic);

		if (prastevila.exists())
			brisiDatoteko(prastevila);

		// Branje iz datoteke:
		try {

			BufferedReader branje = new BufferedReader(new FileReader(datoteka));
			String vrstica;
			int vsotaStevil = 0;
			int steviloStevil = 0;

			// Bere file po vrsticah:
			while ((vrstica = branje.readLine()) != null) {

				String[] strStevilaVVrstici = vrstica.split(";");
				int[] intStevilaVVrstici = new int[strStevilaVVrstici.length];

				// Parse-ing iz tabele String v tabelo int
				for (int i = 0; i < strStevilaVVrstici.length; i++) {
					intStevilaVVrstici[i] = Integer.parseInt(strStevilaVVrstici[i]);
					vsotaStevil += intStevilaVVrstici[i];
				}

				steviloStevil += intStevilaVVrstici.length;

				// 1. del naloge: deljiva števila:
				deljivaStevila(intStevilaVVrstici);

				// 2. del naloge: seštevanje števil po vrsticah:
				sestejVrstico(intStevilaVVrstici);

				// 3. del naloge: praštevila:
				prastevilo(intStevilaVVrstici);

			}

			// 4. del naloge: povprečje vseh števil
			int povprecje = vsotaStevil / steviloStevil;
			zakasnjenIzpis("\nPovprecje vseh stevil v datoteki " + datStevila + " je: ", 25);
			System.out.println(povprecje);
			zakasnjenIzpis("\nKONEC PROGRAMA", 30);

		} catch (IOException e) {
			System.out.println("NAPAKA: branje datoteke: " + datStevila);
		}

	}// >> END MAIN <<

	// 1. del naloge
	private static void deljivaStevila(int[] intStevilaVVrstici) {
		for (int i = 0; i < intStevilaVVrstici.length; i++) {
			if (jeDeljivo(intStevilaVVrstici[i]))
				zapisiDeljiva(intStevilaVVrstici[i]); // metoda kreira in piše v deljiva.txt
		}

	}

	private static boolean jeDeljivo(int i) {
		if (i % 3 == 0 && i % 5 == 0 && i % 11 == 0)
			return true;
		return false;
	}

	private static void zapisiDeljiva(int i) {
		String datDeljiva = "deljiva.txt";
		File deljiva = new File(datDeljiva);

		// Kreiranje datoteke: deljiva.txt
		if (!deljiva.exists()) {

			try {
				zakasnjenIzpis(">> Ustvarjanje datoteke deljiva.txt\n", 25);
				deljiva.createNewFile();
			} catch (IOException e) {
				System.out.println("NAPAKA: kreiranje datoteke: " + datDeljiva);
			}
		}

		// pisanje v datoteko:
		try {
			BufferedWriter pisanje = new BufferedWriter(new FileWriter(deljiva, true));
			pisanje.write(i + " ");
			pisanje.close();

		} catch (IOException e) {
			System.out.println("NAPAKA: pisanje v datoteko: " + datDeljiva);
		}
	}

	// 2. del naloge - metoda, ki sešteje števila in zapiše v datoteko:
	private static void sestejVrstico(int[] intStevilaVVrstici) {

		int sum = 0;

		for (int i = 0; i < intStevilaVVrstici.length; i++)
			sum += intStevilaVVrstici[i];

		// pisanje v datoteko: sestevekVrstic.txt:
		boolean narediPodpicje = true;

		String datSestVrst = "sestevekVrstic.txt";
		File sestevekVrstic = new File(datSestVrst);

		if (!sestevekVrstic.exists()) {
			narediPodpicje = false;

			// ustvarjanje datoteke:
			try {
				zakasnjenIzpis(">> Ustvarjanje datoteke sestevekVrstic.txt\n", 25);
				sestevekVrstic.createNewFile();
			} catch (IOException e) {
				System.out.println("NAPAKA: kreiranje datoteke: " + datSestVrst);
			}

		}

		// pisanje v datoteko sestevekVrstic.txt:
		try {
			BufferedWriter pisanje = new BufferedWriter(new FileWriter(sestevekVrstic, true));

			if (narediPodpicje)
				pisanje.write(";");

			pisanje.write(sum + "");
			pisanje.close();
		} catch (IOException e) {
			System.out.println("NAPAKA: pisanje v datoteko: " + datSestVrst);
		}
	}

	// 3. del naloge - praštevila:
	private static void prastevilo(int[] intStevilaVVrstici) {
		for (int i = 0; i < intStevilaVVrstici.length; i++) {
			if (jePrastevilo(intStevilaVVrstici[i]))
				zapisiPrastevilo(intStevilaVVrstici[i]);
		}

	}

	private static boolean jePrastevilo(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	private static void zapisiPrastevilo(int i) {
		String datPrastevila = "prastevila.txt";
		File prastev = new File(datPrastevila);

		if (!prastev.exists()) {
			try {
				zakasnjenIzpis(">> Ustvarjanje datoteke prastevila.txt\n", 25);
				prastev.createNewFile();
			} catch (IOException e) {
				System.out.println("NAPAKA: kreiranje datoteke: " + datPrastevila);
			}
		}

		try {
			BufferedWriter pisanje = new BufferedWriter(new FileWriter(prastev, true));
			pisanje.write(i + " ");
			pisanje.close();
		} catch (IOException e) {
			System.out.println("NAPAKA: pisanje v datoteko: " + datPrastevila);
		}
	}

	// brisanje datoteke
	private static void brisiDatoteko(File f) {
		f.delete();
		zakasnjenIzpis("Brisanje datoteke: " + f.getName() + "\n", 25);
		// System.out.println(f.getName() );
	}

	// System.out.print z zakasnitvijo:
	private static void zakasnjenIzpis(String s, int t) {
		try {
			for (int i = 0; i < s.length(); i++) {
				System.out.print(s.charAt(i));
				Thread.sleep(t);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getStackTrace());
		}
	}

}
