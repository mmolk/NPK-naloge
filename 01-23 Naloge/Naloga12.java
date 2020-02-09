

public class Naloga12 {
	
	public static void main(String args[]) {
		/* MAIN */
		System.out.println("");
		
		String vnos = args[0];
		
		if(vnos.length() != 6){
			System.out.println("Stevilo ne ustreza pogojem.");
		}
		else{
			
			try{				
				int prvo = Integer.parseInt(vnos.substring(0,3) );
				int drugo = Integer.parseInt(vnos.substring(3) );
			
				System.out.println(prvo+ " + " +drugo+ " = " +(prvo+drugo) );
			}
			catch (Exception e){
				System.out.println("Vnos ni pravilen!");
			}
		}

		System.out.println("");
		/* MAIN - konec */
		}
	
		/* METODE */
		
}