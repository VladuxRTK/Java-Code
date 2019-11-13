abstract class Vagon{
    
  abstract public int getColete();
  abstract public String getTip();
}

abstract class VagonCalatori extends Vagon{
  
   
   abstract public int getPasageri();
   
   
   public void deschideUsi()
   {
      System.out.println("Deschidere usi");
   }
   
   public void inchideUsi()
   {
      System.out.println("Inchidere usi");
   }
}

class CalatoriA extends VagonCalatori{

   public int getPasageri()
   {
    return 40;
    
   }
   public int getColete()
   {
     return 300;
   }
   public String getTip()
   {
     return "CalatoriA";
   }
  
}

class CalatoriB extends VagonCalatori{
  public int getPasageri()
   {
    return 50;
    
   }
   public int getColete()
   {
     return 400;
   }
    public String getTip()
   {
     return "CalatoriC";
   }
  
  
  
  public void blocareGeamuri()
  {
    System.out.println("Blocheaza geamuri");
  }
}

class Marfa extends Vagon{
   public int getColete()
   {
     return 400;
   }
    public String getTip()
   {
     return "Marfa";
   }
  
  
}

class Tren{
  private Vagon[] vagoane = new Vagon[15];
  private int indexCurent;
  
  public Tren(Vagon[] t)
  {
    for(int i =0 ;i<vagoane.length && vagoane[i]!=null && i<t.length;i++)
    {
      this.vagoane[i] = t[i];
      indexCurent++;
    }
  }
  
  public boolean equals(Object o)
  {
     int nrMarfa1=0;
     int nrMarfa2=0;
     if((Tren)o instanceof Tren)
     {
       for(int i=0;i<this.indexCurent;i++)
       {
          nrMarfa1+=this.vagoane[i].getColete();
          
       }
       for(int i=0;i<((Tren)o).indexCurent;i++)
       {
          nrMarfa2+=((Tren)o).vagoane[i].getColete();
       }
     }
     if(nrMarfa1==nrMarfa2)
     return true;
     return false;
  }
  
  public String toString()
  
  {
    String res="";
    for(int i=0;i<this.indexCurent;i++)
    {
       res+=this.vagoane[i].getTip() + " ";
    }
    return res;
  }
  
  
     
}

class ClientTren{
   public static void main(String[] args){
   }
}
