

public class Naloga15 {
	
	public static void main(String args[]) {
		/* MAIN */
		System.out.println("");
		
		int[][][][] tabela = new int[3][5][6][4];
		
		System.out.println("1. Tabela nakljucnih stevil:\n");
		for(int i = 0; i < tabela.length; i++){
			for(int j = 0; j < tabela[i].length; j++){
				for(int k = 0 ;k < tabela[i][j].length; k++){
					for(int l = 0; l < tabela[i][j][k].length; l++){
						tabela[i][j][k][l] = (int) (Math.random()*10+1);
						System.out.print(tabela[i][j][k][l] + " ");
					}
					System.out.print("\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
		
		System.out.println("");		
		/* MAIN - konec */
		}
	
		/* METODE */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}