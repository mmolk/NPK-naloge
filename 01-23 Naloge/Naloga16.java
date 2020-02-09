import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Naloga16 {
	
	public static void main(String args[]) throws IOException{
    
		/* MAIN */
		BufferedReader beri = new BufferedReader(new InputStreamReader(System.in) );
		
		System.out.print("Vnesite stevilo vrstic: ");
		int x = Integer.parseInt(beri.readLine() );
		System.out.println();		
		
		System.out.print("Vnesite stevilo stolpcev: ");
		int y = Integer.parseInt(beri.readLine() );
		System.out.println();
		
		int[][] tabela = new int[x][y];
		int sumStolpcev = 0, sumVrstic = 0;
		
		//Polnjenje in izpis tabele:
		for(int i=0;i<tabela.length;i++){
			for(int j=0;j<tabela[i].length;j++){
				tabela[i][j] = (int)(Math.random()*170+1 );
				//tabela[i][j] = 1;
			}
		}
		
		izpisTabele(tabela);
		System.out.println();
		
		//Vsota vseh stevil v tabeli:
		int sum = 0;
		for(int i=0;i<tabela.length;i++){
			for(int j=0;j<tabela[i].length;j++){
				sum += tabela[i][j];
			}
		}
		System.out.println("Vsota vseh stevil v tabeli je: " + sum + "\n");
		
		//Vsota stevil v vrstici:		
		System.out.print("Vsota stevil po vrsticah: ");
		vsotaVrstic(tabela, true);
		
		System.out.println();
		
		//Transponiranje tabele (iz X*Y v Y*X):
		int[][] tmp = new int[y][x];
		int xTmp = 0, yTmp = 0;
		for(int i = 0; i<x; i++){
			for(int j = 0; j<y; j++){
				tmp[xTmp][yTmp] = tabela[i][j];
				xTmp++;
			}
			xTmp = 0;
			yTmp++;
		}
	
		//Vsota stevil po stolpcih (racuna vsoto vrstic od transponirane tabele):
		System.out.print("Vsota stevil po stolpcih: ");
		vsotaVrstic(tmp, false);
		System.out.println();
	
		/* END MAIN */
		}
	
		/* METODE */
		public static void izpisTabele(int[][] tabela){
			for(int i=0;i<tabela.length;i++){
				for(int j=0;j<tabela[i].length;j++){
					System.out.printf("%4d",tabela[i][j]);
				}
				System.out.println();
			}
		}
		
		//"line" - ali izpise rezultate v vrsti ali v stolpcu:
		public static void vsotaVrstic(int[][] tabela, boolean line){
			int sumVrstic = 0;
			System.out.println();
				for(int i=0;i<tabela.length;i++){
					for(int j=0;j<tabela[i].length;j++){
						sumVrstic += tabela[i][j];
					}
					if(line){System.out.println(sumVrstic); sumVrstic = 0;}
					else{System.out.printf("%5d",sumVrstic); sumVrstic = 0;}
				}
			
		}

}
