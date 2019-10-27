
public class ClientTelefoane {

	public static void main(String[] args)
	{
		Telefoane tel1 = new Telefoane("Adi",2,3,4);
		Telefoane tel2 = new Telefoane("Cristi",3,4,2);
		System.out.println(tel1.incapeBaterie(21));
		System.out.println(tel2.incapeBaterie(27));
		tel1.seConecteazaLaTelefon(tel2);
		tel2.seConecteazaLaTelefon(tel1);
		System.out.println(tel1);
		System.out.println(tel2);
		System.out.println(tel1.getNrConectari());
	}
}
