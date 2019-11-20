package lab7;


class Member{
	 private int varsta;
	 private String nume;
	 
	 public Member(int varsta,String nume)
	 {
		 this.varsta = varsta;
		 this.nume = nume;
	 }
}

abstract class Proiect implements Risky {

	
	protected String obiectiv;
	protected String titlu;
	protected long fonduri;
	protected  Member[] membri = new Member[15];
	protected int indexCurent=0;
	
	public Proiect(String obiectiv,String titlu,long fonduri){
		this.obiectiv = obiectiv;
		this.titlu = titlu;
		this.fonduri = fonduri;
		
	}
	
	public void addMember(Member m)
	{
	    membri[indexCurent]=m;
	    indexCurent++;
	}
}
 
  class ProiecteComerciale extends Proiect implements Risky{
    private String deadLine;
    private long marketingFunds=fonduri/2;
    private int nrEchipe;
    
    
    public ProiecteComerciale(String obiectiv,String titlu,long fonduri,String deadLine,long marketingFunds,int nrEchipe)
    {
    	super(obiectiv, titlu, fonduri);
    	this.deadLine=deadLine;
    	this.marketingFunds = this.fonduri/2;
    	this.nrEchipe = nrEchipe;
    	
    }
    
	
	public double getRisk() {
	
		return (nrEchipe*3/indexCurent/(fonduri-marketingFunds));
	}

	
	public void addMember(Member m) {
		if(indexCurent!=this.membri.length)
		super.addMember(m);
		
		
		
	}
    	
}
  
  class ProiecteMilitare extends Proiect{


		private String deadLine;
		  private String password;
	  public ProiecteMilitare(String obiectiv, String titlu, long fonduri,String deadLine,String password) {
		super(obiectiv, titlu, fonduri);
		this.deadLine=deadLine;
		this.password = password;
		// TODO Auto-generated constructor stub
		
	}

	  
	@Override
	public double getRisk() {
		
		return (this.indexCurent-1) / this.password.length() / this.fonduri ;
	}
	
	public void addMember(Member m) {
	  if(indexCurent!=this.membri.length)
	   super.addMember(m);
	}
	  
  }
  
  class ProiecteOpenSource extends Proiect{
	  private String mailingList;
	  public ProiecteOpenSource(String obiectiv, String titlu, long fonduri,String mailingList) {
		super(obiectiv, titlu, fonduri);
		this.mailingList = mailingList;
		// TODO Auto-generated constructor stub
	}

	
	  
	  public void addMember(Member m) {
		  if(indexCurent!=this.membri.length)
		   super.addMember(m);
		  else {
			  Member[] aux = new Member[this.indexCurent];
			  for(int i=0;i<indexCurent;i++)
			  {
				  aux[i] = this.membri[i];
				  
			  }
			  this.membri = new Member[2*indexCurent];
			  for(int i=0;i<indexCurent;i++)
			  {
				  this.membri[i] = aux[i];
				  
			  }
			 
			  super.addMember(m);
			  
			  
		  }
		  
	  }

	@Override
	public double getRisk() {
		// TODO Auto-generated method stub
		return this.indexCurent/fonduri;
	}
	  
  }
  

class InvestmentCompany
{
    private Proiect[] proiecte = new Proiect[999];
    private int indexCurent;
    private double riscMinim=999999;
	public void addProject(Proiect p)
	{
		if(indexCurent!=this.proiecte.length)
		{
			proiecte[indexCurent]=p;
			indexCurent++;
		}
	}
	
	public Proiect getBestInvestment()
	{
		int poz=0;
		for(int i = 0;i<indexCurent;i++)
		{
			if(proiecte[i].getRisk()<riscMinim)
			{
				riscMinim = proiecte[i].getRisk();
				poz=i;
			}
		}
		return proiecte[poz];
	}
	
	public static void main(String[] args)
	{
		InvestmentCompany ic=new InvestmentCompany();
		Proiect p1 = new ProiecteComerciale("niciunul","abc",34,"12.02.2021",31,5);
		Proiect p2 = new ProiecteMilitare("petrol","cde",80,"14.07.2030","wererered");
		Member programator1 = new Member(28,"Virgil");
		Member programator2 = new Member(28,"Iantu");
		Member manager1 = new Member(20,"Iantu");
		Member manager2 = new Member(20,"Virgil^2");
	
		
		p1.addMember(programator1);
		p1.addMember(programator2);
		p1.addMember(manager1);
		p2.addMember(programator1);
		p2.addMember(programator2);
		p2.addMember(manager2);
		
		
		ic.addProject(p1);
		ic.addProject(p2);
		
		System.out.println(ic.getBestInvestment().titlu);
		
	}
}


interface Risky{
	public double getRisk();
}





