

public class Naloga14 {
	
	public static void main(String args[]) {
		/* MAIN */
		System.out.println("");
		
		int[][] tabela = new int[14][9];
		
		System.out.println("1. Tabela nakljucnih stevil:\n");
		for(int i = 0; i<tabela.length; i++){
			for(int j = 0;j<tabela[i].length;j++){
				
				tabela[i][j] = (int) (Math.random()*70+1);
				System.out.printf("%4d",tabela[i][j]); //printf ni v oddaji
				
			}
			System.out.println("\n");
		}
		
		System.out.println("");
		
		System.out.println("2. Stevila deljiva s 7: ");
		for(int i = 0; i<tabela.length; i++){
			for(int j = 0;j<tabela[i].length;j++){
				
				if(tabela[i][j] % 7 == 0)
					System.out.print(tabela[i][j] + " ");
				
			}
		}
		
		System.out.println("\n");

		System.out.print("3. vsota vseh stevil v tabeli je: ");
		int sum = 0;
		for(int i = 0; i<tabela.length; i++){
			for(int j = 0;j<tabela[i].length;j++){
				
				sum += tabela[i][j];	
				
			}
		}
		System.out.println(sum + "\n");
		
		/* MAIN - konec */
		}
	
		/* METODE */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}