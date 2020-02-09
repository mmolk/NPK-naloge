import java.util.Scanner;

public class Kocka {
	
	static Scanner skender = new Scanner(System.in);

	//MAIN
	public static void main(String[] args) {
		
		System.out.println(">> PROGRAM ZA METANJE KOCKE <<\n");
		
		
		while(true) {
			
			System.out.println("~ Vrzi kocko: DA/NE");
			String vnos = skender.nextLine().toUpperCase();
			
			if(vnos.equalsIgnoreCase("da") ) {
				metKocke(); 
				System.out.println();
			}
			else if (vnos.equalsIgnoreCase("ne" ))
				break;
			else {
				System.out.println("\n>>NAPAKA - NAPAČEN VNOS!<<");
				System.out.println("Vpisi 'da' ali 'ne'\n");				
			}
			
		}
		
		System.out.println("\n>> KONEC PROGRAMA <<");		

	}// End main
	
	public static void metKocke() {
		
		int cifra = (int) (Math.random()*6+1);
		System.out.println();
		
		switch (cifra) {
		case 1:
			System.out.println("      ");			
			System.out.println("   *  ");			
			System.out.println("      ");			
			break;
		case 2:
			System.out.println("     *");			
			System.out.println("      ");			
			System.out.println(" *    ");			
			break;
		case 3:
			System.out.println("     *");			
			System.out.println("   *  ");			
			System.out.println(" *    ");			
			break;
		case 4:
			System.out.println(" *   *");			
			System.out.println("      ");			
			System.out.println(" *   *");			
			break;
		case 5:
			System.out.println(" *   *");			
			System.out.println("   *  ");			
			System.out.println(" *   *");			
			break;
		case 6:
			System.out.println(" * * *");			
			System.out.println("      ");			
			System.out.println(" * * *");			
			break;
		default:
			System.out.println("**//** ERROR **//*");
			break;
			
		}
	}

}
