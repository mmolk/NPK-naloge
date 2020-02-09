public class Jelka {
    public static void main(String[] args) {
        
    vidiJelko(9);   
	    
    }
    public static void vidiJelko(int visina) {
        //krosnja:
	int sirina = 0;
        for(int i = 1; i <= visina; i++, sirina = 0) {
            for(int zamik = 1; zamik <= visina - i; zamik++) {
                System.out.print(" ");
            }
            while(sirina != 2 * i - 1) {
                System.out.print("*");
                sirina++;
            }
            System.out.println();
        }
	//deblo (fiksna velikost - 2x3):
	int zamikDeblo = 0;
	for(int i=0;i<2;i++,zamikDeblo=0){
		while(zamikDeblo <= visina-3){
			System.out.print(" ");
			zamikDeblo++;
		}
		System.out.print("***\n");
	}
    	System.out.println("");
    }
}
