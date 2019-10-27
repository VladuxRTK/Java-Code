
public class Telefoane {

	private String nume;
	private int hBaterie;
	private int lBaterie;
	private int LBaterie;
	
	private String[] numeProp = new String[100];
	private int indexCurent=0;
	private static int nrConectari;
	
	public Telefoane(String nume,int hBaterie,int lBaterie,int LBaterie)
	{
		this.nume = nume;
		this.hBaterie=hBaterie;
		this.lBaterie=lBaterie;
		this.LBaterie=LBaterie;
	}
	
	public boolean incapeBaterie(int volum)
	{
			if((this.hBaterie*this.lBaterie*this.LBaterie)>=volum)
				return true;
			else return false;
	}
	
	public void seConecteazaLaTelefon(Telefoane tel)
	{
	    if(indexCurent<tel.numeProp.length)
	    {
	    	tel.numeProp[tel.indexCurent] = this.nume;
	    	System.out.println("Telefonul prop " + this.nume + " se conecteaza la telefonul prop " + tel.nume);
	    	tel.indexCurent++;
	    	nrConectari++;
	    }
	    else System.out.println("Nu se poate");
	}
	public String toString()
	{
		int volum=this.hBaterie*this.lBaterie*this.LBaterie;
		String res=this.nume + " " +  volum + " ";
		for(int i=0;i<indexCurent;i++)
		{
			res+= this.numeProp[i] + " ";
		}
		return res;
	}
	public int getNrConectari()
	{
		return nrConectari;
	}
}
