import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Naloga17 {
	
	public static void main(String args[]) throws IOException{
    
		/* MAIN */
		
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		int x = (int) (Math.random()*5+1);
		int y = (int) (Math.random()*5+1);
		
		String[][] tabela = new String[x][y];
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print("Vpisi niz: ");
				tabela[i][j] = beri.readLine();
			}
		}
		
		//Izpis tabele:
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print(tabela[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
	
		/* END MAIN */
		}
	
		/* METODE */
		

}