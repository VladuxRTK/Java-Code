
public class Complex {

	private double real;
	private double imaginar;
	private static int numarAfisari=0;
	
	public Complex(double real,double imaginar)
	{
		this.real = real;
		this.imaginar = imaginar;
	}
	
	public double modul()
	{
		return Math.sqrt(this.real*this.real + this.imaginar*this.imaginar);
	}
	
	public void afisare()
	{
		System.out.println(this.real + "i*" + this.imaginar);
		numarAfisari++;
	}
	
	public Complex suma(Complex c)
	{
		Complex aux=new Complex(this.real+c.real,this.imaginar+c.imaginar);
		
		return aux;
	}
	
	public int getNrAfisari()
	{
		return numarAfisari;	
	}
}
