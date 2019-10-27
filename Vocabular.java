
public class Vocabular {
   private String[] cuvinte = new String[1000];
   private int indexCurent=0;
   
   public Vocabular(String cuvant)
   {
	   this.cuvinte[indexCurent]=cuvant;
	   indexCurent++;
   }
   
   public int determinaDiferente(Vocabular voc)
   {
	   int cuvinteInPlus=0;
	   for(int i=0;i<this.indexCurent;i++)
	   {
		   for(int j=0;j<voc.indexCurent;j++)
		   {
			   if((this.cuvinte[i].contains(voc.cuvinte[j]))==false)
			   {
				  cuvinteInPlus++;
				  
			   }
			  
			  
			   
			 
		   }
		  
	   }
	   return cuvinteInPlus;
   }
   
   public void adaugaCuvinte(String[] cuvintele)
   {
	    int i=0;
	    while(indexCurent!=cuvinte.length && i!=cuvintele.length)
	    {
	    	this.cuvinte[indexCurent]=cuvintele[i];
	    	indexCurent++;
	    	i++;
	    }
	    
   }
   
   public String toString()
   {
	   String res="";
	   for(int i=0;i<indexCurent;i++)
	   {
		   res=res+this.cuvinte[i]+" ";
	   }
	   return res;
   }
   
   public int getIndexCurent()
   {
	   return indexCurent;
   }

}
