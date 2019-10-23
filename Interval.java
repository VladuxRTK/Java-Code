import java.io.*;
class Interval{
   private int limInf;
   private int limSup;
   private int nrTest;
   private int nrTestCon;
   
   
   public Interval(int limInf,int limSup)
   {
     this.limInf=limInf;
     this.limSup=limSup;
   }
   
   public boolean testObject(Double x)
   {
     
      
      if(x>=limInf && x<=limSup)
      {
        nrTest++;
        nrTestCon++;
        return true;
      }
      else {nrTest++;
        return false;
      }
   }
   public void afisareFisier(PrintStream out_stream)
   {
      out_stream.println(limInf + "-" +limSup);
      out_stream.println(nrTestCon/nrTest*100 + "%");
   }
}
