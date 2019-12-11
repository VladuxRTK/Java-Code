package lab12v1;

public class Minge {
   private int X;
   private int Y;
   private CoordinateGenerator rand=new CoordinateGenerator();
   
   public Minge(int X,int Y)
   {
	   this.X = X;
	   this.Y = Y;
		   
   }
   
   public void suteaza() throws Out,Gol,Corner
   {
	   X=rand.generateX();
	   Y=rand.generateY();
	   if(Y==0|| Y==50)
		   throw new Out();
	   
	   if((X==0||X==100) && Y>=20 & Y<=30)
		   throw new Gol();
	   if((X==0 || X==100) && ((Y>0 && Y<20)||(Y>30 && Y<50)))
		   throw new Corner();
   }
   
   public int getX()
   {
	   return this.X;
   }
   
   public int getY()
   {
	   return this.Y;
   }
}

class Out extends Exception
{
	public Out()
	{
		super("Out");
	}
}
class Gol extends Exception
{
	public Gol()
	{
		super("Gol");
	}
}

class Corner extends Exception
{
	public Corner()
	{
		super("Corner");
	}
}

class Joc{
	private String echipa1;
	private int nrGol1;
    private int nrOut;
    private int nrCorner;
    private String echipa2;
	private int nrGol2;
   
    
    public Joc(String nume1,String nume2)
    {
    	this.echipa1 = nume1;
    	this.echipa2 = nume2;
    }
    
    public String toString()
    {
    	return this.echipa1 + " goluri: " + this.nrGol1 + "\n" + this.echipa2 + " goluri:" + this.nrGol2 + "\n" + this.nrCorner + "\n" + this.nrOut+"\n";
    	
    }
    public void afiseazaCoord(Minge m)
    {
 	   System.out.println(this.echipa1 + "-" + this.echipa2 + ": Mingea se afla la coordonatele (" + m.getX() + "," + m.getY() +")" );
    }
    
    public void simuleaza()
    {
        Minge m = new Minge(50,25);
        afiseazaCoord(m);
        int i=0;
        for(i=0;i<1000;i++)
        try {
        	m.suteaza();
        	
        }catch(Gol e) {
        	if(m.getX()==0) nrGol1++;
        	else if(m.getX()==100) nrGol2++;
        	m=new Minge(50,25);
        }catch(Out e) {
        	nrOut++;
        	m=new Minge(m.getX(),m.getY());
        	
        	
        }catch(Corner e){
        	nrCorner++;
            if(m.getY()<20)
            	m=new Minge(m.getX(),0);
            else m=new Minge(m.getX(),50);
        }
        finally{
        	afiseazaCoord(m);
        	
        }
    }
}

class Client{
	public static void main(String[] args)
	{
		Joc j1=new Joc("abc","def");
		Joc j2=new Joc("ghi","jkl");
		j1.simuleaza();
		System.out.println(j1);
		j2.simuleaza();
		
		System.out.println(j2);
	}
}
