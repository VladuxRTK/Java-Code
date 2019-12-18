package colectii;

import java.util.*;

public  abstract class Tip {

	public abstract String getTip();
	public abstract String toString();
	
}

class Intreg extends Tip{
	private int atribut;
	
	public Intreg(int atribut)
	{
		this.atribut = atribut;
	}
	
	public String getTip()
	{
		return "Tip: Intreg ";  
	}
	public String toString() {
		return "atribut : " + atribut;
	}
	
	
	public boolean equals(Object o)
	{
		if(o instanceof Intreg)
		{
			if(((Intreg)o).atribut == this.atribut)return true;
		}
		return false;
	}
	
}

class Sir extends Tip{

    private String atribut;
    
    public Sir(String atribut)
    {
    	this.atribut = atribut;
    }
	@Override
	public String getTip() {
		return "Tip : Sir"; 
	}

	@Override
	public String toString() {
		return "atribut : " + atribut;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Sir)
		{
			if(((Sir)o).atribut.equals(this.atribut))return true;
		}
		return false;
	}
}


class Colectie extends Tip{
	private ArrayList<Tip> tipuri = new ArrayList<Tip>();

	
	public void adauga(Tip t)
	{
		tipuri.add(t);
	}
	
	public String getTip() {
		return "Tip : Colectie";
	}

	public String toString() {
		String res="(";
		
		Iterator<Tip> it = tipuri.iterator();
		
		
		while(it.hasNext()) {
			
			Tip t = it.next();
			res = res  + t.toString();
			if(it.hasNext() == true)
			{
				res+= ",";
			}
		}
		res= res+")";
			
		
	return res;
	}
	
	public boolean equals(Object o)
	{
		if(o instanceof Colectie)
		{
			
			if(this.tipuri.equals(((Colectie)o).tipuri))
			{
				return true;
			}
			
		}
		return false;
	}
	
	
}

class Client{
	public static void main(String[] args)
	{
		Tip intreg1 = new Intreg(4);
		Tip intreg2 = new Intreg(5);
		Tip intreg3 = new Intreg(4);
		Tip intreg4 = new Intreg(5);
		Tip sir1 = new Sir("abc");
		Tip sir2 = new Sir("abc");
		
		Tip colectie1 = new Colectie();
		Tip colectie2 = new Colectie();
		((Colectie)colectie2).adauga(intreg3);
		((Colectie)colectie2).adauga(intreg4);
		((Colectie)colectie2).adauga(sir2);
		
		((Colectie)colectie1).adauga(intreg1);
		((Colectie)colectie1).adauga(intreg2);
		((Colectie)colectie1).adauga(sir1);
		System.out.println(((Colectie)colectie1));
		System.out.println(((Colectie)colectie1).equals((Colectie)colectie2));
	}
}
