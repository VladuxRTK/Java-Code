
public abstract class Cursant {
 
	 protected String nume,prenume;
	 protected int varsta;
	 protected double punctaj=0;
	 
	 
	 public Cursant(String nume,String prenume,int varsta)
	 {
		 this.nume = nume;
		 this.prenume = prenume;
		 this.varsta = varsta;
		 
	 }
	 
	public abstract void primestePunctaj(double evaluare);
	 
	 public void afisare() {
		 System.out.println(nume + " " + prenume + " " + varsta);
		 
	 }
	 
	 public void afisareInformatii()
	 {
		 afisare();
		 System.out.println(punctaj);
	 }
	 
	 public double getNota()
	 {
		 return punctaj;
	 }
	 
}

class Student extends Cursant{
	
	public Student(String nume, String prenume, int varsta) {
		super(nume, prenume, varsta);
		// TODO Auto-generated constructor stub
	}

	public void primestePunctaj(double evaluare)
	{
		this.punctaj = Math.floor(evaluare +  0.5);
		//return punctaj;
	}
	
	public void afisareInformatii()
	{
		System.out.println("Student");
		super.afisareInformatii();
	}
}

class Elev extends Cursant{

	public Elev(String nume, String prenume, int varsta) {
		super(nume, prenume, varsta);
		// TODO Auto-generated constructor stub
	}
    public void primestePunctaj(double evaluare)
    {
    	punctaj = Math.ceil(evaluare+1.5);
    	if(punctaj > 10)
    	{
    		punctaj = 10;
    		//return punctaj;
    	}
    	//else return punctaj;
    }
    public void afisareInformatii()
    {
    	System.out.println("Elev");
		super.afisareInformatii();
    }
    
    
}

class Profesor{
    private String materie;
    private Cursant[] cursanti = new Cursant[100];
    private int indexCurent;
    public Profesor(String materie)
    {
    	this.materie  = materie;
    }
    
    public void addCursanti(Cursant c)
    {
    	if(indexCurent!=cursanti.length)
    	{
    		cursanti[indexCurent] = c;
    		indexCurent++;
    	}
    	
    	//Bossule nu mai stau sa implementez eu asta acum la realocare
    }
    
    public void evalueaza() {
    	
    	for(int i = 0;i<indexCurent;i++)
    	{
    	  double evaluare = Math.random()*10;
    	  cursanti[i].primestePunctaj(evaluare);
    	}
    }
    
    public double media() {
    	
    	double suma=0;
    	for(int i =0;i<indexCurent;i++)
    	{
    		suma+=cursanti[i].getNota();
    	}
    	return suma/indexCurent;
    }
    
    public void afisare()
    {
    	System.out.print("Rezultate: ");
    	for(int i =0;i<indexCurent;i++)
    	{
    		cursanti[i].afisareInformatii();
    	}
    }
}

class ClientProfesor{
	public static void main(String[] args)
	{
		 Cursant c1 = new Student("Florea","Andi",20);
		 Cursant c2 = new Student("Ionete","Vlad",20);
		 Cursant c3 = new Elev("Jurca","Daniel",20);
		 
		 Profesor p1 = new Profesor("Matematica");
		 
		 p1.addCursanti(c1);
		 p1.addCursanti(c2);
		 p1.addCursanti(c3);
		 
		 p1.evalueaza();
		 System.out.println(p1.media());
		 p1.afisare();
		 
	}
}


