
public class CabinetAvocatura {

	public static void main(String[] args)
	{
		Cabinet c1=new Cabinet("Adi");
		Cabinet c2=new Cabinet("Silviu");
		
		c1.adaugaCaz("Fifo", "Baiatu");
		c1.adaugaCaz("Ter", "Cici");
		c2.adaugaCaz("Fifo1", "Baiatu1");
		c2.adaugaCaz("Ter1", "Cici1");
		c2.adaugaCaz("Fifo3", "Baiatu3");
		System.out.println(c1);
		System.out.println(c2);
		Cabinet c3=c1.formeazaAlianta(c2);
		
		System.out.println(c3);
	}
}
