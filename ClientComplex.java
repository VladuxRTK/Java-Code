
public class ClientComplex {

	public static void main(String[] args)
	{
		Complex c1=new Complex(3,4);
		Complex c2=new Complex(4,5);
		System.out.println(c1.modul());
		System.out.println(c2.modul());
		c1.afisare();
		c2.afisare();
        Complex c3=c1.suma(c2);
        c3.afisare();
		
	}
	
}
