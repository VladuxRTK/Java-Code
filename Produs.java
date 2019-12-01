
public abstract class Produs {

	protected String nume;
	protected int cantitate;
	protected double pret;
	
	public Produs(String nume,int cantitate,double pret)
	{
		this.nume = nume;
		this.cantitate=cantitate;
		this.pret = pret;
	}
	
	
	public void afiseaza()
	{
		System.out.println("Nume: " + nume + "\n" + "Cantitate: " + cantitate + "\n" + "Pret: " + pret);
	}
	
	public double vindeProdus(int cantitateCumparata) {
		this.cantitate -= cantitateCumparata;
		return (double)cantitateCumparata*pret;
		
	}
	public abstract int getCantitate();
	
	
	
}

class ProdusBucata extends Produs{
	public ProdusBucata(String nume, int cantitate, double pret) {
		super(nume, cantitate, pret);
		
	}

	public double vindeProdus(int cantitateCumparata)
	{
		//this.cantitate -=cantitateCumparata;
		return super.vindeProdus(cantitateCumparata)*1.16;
	}
	
	public void afiseaza()
	{
		System.out.println("ProdusBucata\n");
		super.afiseaza();
	}

	
	public int getCantitate() {
		
		return this.cantitate;
	}
}

class ProdusBax extends Produs{
	
	public ProdusBax(String nume, int cantitate, double pret) {
		super(nume, cantitate, pret);
	
	}

	public double vindeProdus(int cantitateCumparata)
	{
		return 6*super.vindeProdus(cantitateCumparata)*0.9;
	}
	
	public void afiseaza()
	{
		System.out.println("ProdusBax\n");
		super.afiseaza();
	}

	@Override
	public int getCantitate() {
		
		return this.cantitate*6;
	}
}

class Magazin{
	private String nume;
	private Produs[] produse = new Produs[100];
	private int indexCurent;
	
	
	public Magazin(String nume)
	{
		this.nume = nume;
	}
	
	public void adaugaProduse(Produs p)
	{
		if(indexCurent!=produse.length)
		{
			produse[indexCurent] = p;
			indexCurent++;
		}
		else {
			Produs[] aux = new Produs[indexCurent];
			for(int i=0;i<indexCurent;i++)
			{
				aux[i]=produse[i];
			}
			produse = new Produs[indexCurent*2];
			for(int i=0;i<indexCurent;i++)
			{
				produse[i]=aux[i];
			}
			produse[indexCurent] = p;
			indexCurent++;
		}
	}
	
	
	
	public int totalCantitati()
	{
		int sum=0;
		for(int i=0;i<indexCurent;i++)
		{
			
			sum+=produse[i].getCantitate();
			
		}
		return sum;
		
	}
	
	public double vindeStoc() {
		double sum=0;
		
		for(int i=0;i<indexCurent;i++)
		{
			sum+=produse[i].vindeProdus((int)(10*Math.random()));
		}
		return sum;
		
	}
	
}

class ClientMagazin{
	public static void main(String[] args)
	{
		Magazin m1 = new Magazin("Kaufland");
		Magazin m2 = new Magazin("Calut");
		
		Produs p1 = new ProdusBucata("Papuci",15,10);
		Produs p2 = new ProdusBax("Cai",20,5);
		
		
		m1.adaugaProduse(p1);
		m2.adaugaProduse(p2);
		
		Produs p3 = new ProdusBucata("Papuci",20,10);
		Produs p4 = new ProdusBax("Cai",20,5);
		
		m2.adaugaProduse(p3);
		m2.adaugaProduse(p4);
		
		double vanzariM1=m1.vindeStoc();
		double vanzariM2=m2.vindeStoc();
		
		if(vanzariM1>vanzariM2)
		{
			System.out.println("M1 are mai multe vanzari ca M2");
		}
		else
		{
			System.out.println("M2 are mai multe vanzari ca M1");
		}
		
		
		
		
		
	}
}
