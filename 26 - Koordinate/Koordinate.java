
public class Koordinate {
	
	private double sirina;
	private double dolzina;
	
	
	public Koordinate(double sirina, double dolzina) {
		this.sirina = sirina;
		this.dolzina = dolzina;
	}
	
	public String toString() {
		int stopinjeSirina = (int) this.sirina;
		int stopinjeDolzina = (int) this.dolzina;
		
		int minuteSirina = (int) ((this.sirina - stopinjeSirina) * 60); 
		int minuteDolzina = Math.abs((int) ((this.dolzina - stopinjeDolzina) * 60));
		
		String niz =  stopinjeSirina + "° " + minuteSirina  +"'; " 
						+ stopinjeDolzina + "° " + minuteDolzina +"'";
		return niz;
	}
	
	public double getSirina() {
		return this.sirina;
	}
	
	public double getDolzina() {
		return this.dolzina;
	}
	
	public boolean equals(Koordinate drugeKoordinate) {
		if(this.sirina == drugeKoordinate.getSirina() 
				&& this.dolzina == drugeKoordinate.getDolzina()) {
			return true;
		}
		
		return false;
	}
	
	public String hemisfera() {
		String sirinaSmer = "";
		String dolzinaSmer = "";
		
		if(this.sirina >= 0)
			sirinaSmer = "S";
		else
			sirinaSmer = "J";
		
		if(this.dolzina >= 0)
			dolzinaSmer = "V";
		else
			dolzinaSmer = "Z";
		
		return sirinaSmer+dolzinaSmer;
		
	}

	public Koordinate sestej(Koordinate test2) {
		double zacetnaSirina = this.sirina, zacetnaDolzina = this.dolzina;
		double pristetaSirina = test2.sirina, pristetaDolzina = test2.dolzina;
		double koncnaSirina = 0, koncnaDolzina = 0;
		
		/* Formule:
		 * Ce sirina preseze 90: 90 - (pristetaSirina - (90 - zacetnaSirina))
		 * Ce dolzina preseze 180: ((zacetnaDolzina - 180) + pristetaDolzina) -180
		 * */
		
		// Ko pristejemo koordinate: 
		// ...sirina ne presega 90° in dolzina ne preseze 180°:
		if(manjseOd90(zacetnaSirina, pristetaSirina) && manjseOd180(zacetnaDolzina, pristetaDolzina))
			return new Koordinate(zacetnaSirina+pristetaSirina, zacetnaDolzina+pristetaDolzina);
		
		// ...sirina PRESEZE 90°, dolzina ne preseze 180°:
		if(!manjseOd90(zacetnaSirina, pristetaSirina) && manjseOd180(zacetnaDolzina, pristetaDolzina))
			return new Koordinate(90-(pristetaSirina-(90-zacetnaSirina)), -zacetnaDolzina+pristetaDolzina);
		
		// ...sirina ne preseze 90°, dolzina PRESEZE 180°:
		if(manjseOd90(zacetnaSirina, pristetaSirina) && !manjseOd180(zacetnaDolzina, pristetaDolzina))
			return new Koordinate(zacetnaSirina+pristetaSirina, ((zacetnaDolzina-180)+pristetaDolzina)-180);
		
		// oboje presega meje:
		if(!manjseOd90(zacetnaSirina, pristetaSirina) && !manjseOd180(zacetnaDolzina, pristetaDolzina))
			return new Koordinate(90-(pristetaSirina-(90-zacetnaSirina)), ((zacetnaDolzina-180)+pristetaDolzina)-180);
		
		return new Koordinate(koncnaSirina, koncnaDolzina);
	}


	private boolean manjseOd90(double zacetnaSirina, double pristetaSirina) {
		if(zacetnaSirina+pristetaSirina <= 90)
			return true;
		return false;
	}
	
	private boolean manjseOd180(double zacetnaDolzina, double pristetaDolzina) {
		if(zacetnaDolzina + pristetaDolzina <= 180)
			return true;
		return false;
	}
	
}

