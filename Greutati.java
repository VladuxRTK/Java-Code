
abstract class Greutate {
	abstract public int capacitate();
}

class Greutate_simpla extends Greutate{
	
	private int capacitate;
	
	public Greutate_simpla(int x) {
		capacitate = x;
	}
	
	public int capacitate() {
		return capacitate;
	}
}

class Greutate_dubla extends Greutate{
	
	private Greutate g1, g2;
	
	public Greutate_dubla(Greutate x1, Greutate x2) {
		g1 = x1;
		g2 = x2;
	}
	
	public void setGreutate1(Greutate g) {
		g1 = g;
	}
	
	public void setGreutate(Greutate g) {
		g2 = g;
	}
	
	public int capacitate(){
		return g1.capacitate() + g2.capacitate();
	}
	
}

class Greutate_multipla extends Greutate{
	
	private Greutate[] gr = new Greutate [10];
	
	public Greutate_multipla(Greutate[] x) {
		int i;
		gr = new Greutate [x.length];
		for(i=0;i<x.length;i++) {
			gr[i]=x[i];
		}
	}
	
	public int capacitate() {
		int i, s=0;
		for(i=0;i<gr.length;i++) {
			s = s+ gr[i].capacitate();
		}
		
		return s;
	}
}

class ColectieGreutati {
	
	private Greutate[] gr = new Greutate [100];
	private int count = 0, max;
	
	public ColectieGreutati (int x) {
		max = x;
	}
	
	public void adauga (Greutate g) {
		if(count<max) {
			gr[count] = g;
			count ++;
		}
		else {
			System.out.println("nu mai e loc");
		}
	}
	
	public double medie() {
		int i, s = 0;
		for(i=0;i<count;i++) {
			s = s + gr[i].capacitate();
		}
		
		return (double)((double)s/(double)count);
	}
}

class client{
	public static void main(String args[]) {
		Greutate gs1 = new Greutate_simpla(7);
		Greutate gs2 = new Greutate_simpla(5);
		
		Greutate gd1 = new Greutate_dubla(gs1,gs2);   
		System.out.println(gd1.capacitate());  
		
		Greutate gd2 = new Greutate_dubla(gd1,gs1);   
		System.out.println(gd2.capacitate());   
		
		Greutate gd3 = new Greutate_dubla(gd1,gd2); 
		System.out.println(gd3.capacitate());   
		
		Greutate tg1[] = new Greutate [4];
		tg1[0] = gs1;
		tg1[1] = gd1;
		tg1[2] = gd2;
		tg1[3] = gd3;
		
		Greutate gm1 = new Greutate_multipla(tg1);  
		System.out.println(gm1.capacitate());  
		
		ColectieGreutati cg1 = new ColectieGreutati(6);   
		cg1.adauga(gm1);
		cg1.adauga(gs1);
		cg1.adauga(gd1);   
		
		System.out.println(cg1.medie());   
	}
}