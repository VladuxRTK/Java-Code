
public class Microbuz {
   private String marca;
   private String proprietar;
   private String[] pasageri = new String[14];
   private int indexCurent=0;
   
   public Microbuz(String marca,String proprietar)
   {
	   this.marca = marca;
	   this.proprietar = proprietar;
   }
   
   public boolean urca(String nume)
   {
	  if(indexCurent==pasageri.length)
	  {
		  return false;
	  }
	  else {
		  pasageri[indexCurent]=nume;
		  indexCurent++;
		  return true;
	  }
   }
   
   public boolean transferaPasageri(Microbuz m)
   {
	   if(m.indexCurent!=m.pasageri.length && (this.indexCurent+m.indexCurent)<m.pasageri.length-1)
	   {
		  for(int i=0;i<this.indexCurent;i++)
		  {
			  m.pasageri[m.indexCurent]=this.pasageri[i];
			  m.indexCurent++;
			  
		  }
		  return true;
			   
	   }
	   else return false;
	   
   }
   
   public String toString()
   {
	   String res="";
	   for(int i=0;i<=indexCurent;i++)
	   {
		   res =res+ pasageri[i] + " ";
	   }
	   return res;
   }
   public static void main(String[] args)
   {}
}
