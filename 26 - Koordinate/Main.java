
public class Main {
	
	/* HEMISFERA: ok
	 * SESTEVANJE: ok
	 * ODSTEVANJE: wip 
	 * */

	public static void main(String[] args) {
//		Vaje:
//		Koordinate k1 = new Koordinate(45.547680, 13.738070);
//		Koordinate k2 = new Koordinate(46.236, 15.268);
		
//		Koordinate koor = new Koordinate(-12.3456, 23.9874);
//		
//		System.out.println("Koordinate v stopinjah in minutah: " 
//						  + koor.toString());
//		
//		// Hemisfera:
//		System.out.println("Hemisfera koordinat: " + koor.toString() 
//						 + " je " + koor.hemisfera() + ".");
		
		// TEST - sestevanje:
		Koordinate koor = new Koordinate(85.1, 175.1);
		Koordinate k1 = new Koordinate(3.1, 3.1);
		Koordinate k2 = new Koordinate(7.1, 3.1);
		Koordinate k3 = new Koordinate(3.1, 7.1);
		Koordinate k4 = new Koordinate(7.1, 7.1);
		
		Koordinate[] tab = {k1, k2, k3, k4};
		
		int counter = 1;
		for(int i = 0; i<tab.length; i++) {
			Koordinate rez = koor.sestej(tab[i]);
			System.out.println(counter + ") " + rez.getSirina() 
								+ " " + rez.getDolzina());
			counter++;
		}
 
	}

}
