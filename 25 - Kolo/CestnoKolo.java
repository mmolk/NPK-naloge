
public class CestnoKolo extends Kolo{
	
	//Atributi (narejeno na vajah):
	private int prestava = 1;
	private final int MAX_STEVILO_PRESTAV;
	
	//Konstruktor (narejeno na vajah):
	public CestnoKolo(String barva, int maxHitrost, int maxPrestav) {
		super(barva, maxHitrost);
		
		this.MAX_STEVILO_PRESTAV = maxPrestav;
		
	}
	
	//Metode (pospesi, lahkoPospesi - narejeno na vajah):
	public void pospesi() {
		if(this.lahkoPospesi() ) {
			super.hitrost += prestava;
		}
	}
	
	//visanje prestave:
	public void plusPrestava() {
		if(this.prestava < MAX_STEVILO_PRESTAV)
			this.prestava++;	
	}
	
	//Nizanje prestave:
	public void minusPrestava() {
		if(this.prestava > 1)
			this.prestava--;
	}
		
	private boolean lahkoPospesi() {
		int novaHitrost = super.hitrost + this.prestava;
		if(novaHitrost <= super.MAX_HITROST)
			return true;
		
		return false;
	}
	
	
	public void getVseLastnosti() {
		super.getVseLastnosti(); 
		System.out.println("Trenutna prestava: " + this.prestava);
		System.out.println("Število prestav: " + this.MAX_STEVILO_PRESTAV);
	}
}
