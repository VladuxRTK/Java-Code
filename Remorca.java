class Remorca{
   private int cantCutiiMarfa = 0;
   private String nrInmatriculare;
   private static int prevNrCutii=10;
   
   public Remorca(int cantCutiiMarfa,String nrInmatriculare)
   {
      this.cantCutiiMarfa = cantCutiiMarfa;
      this.nrInmatriculare = nrInmatriculare;
      prevNrCutii = cantCutiiMarfa + 1;
   }
   public Remorca(String nrInmatriculare)
   {
      /*if(prevNrCutii!=10)
      {
        this.cantCutiiMarfa = prevNrCutii;
      }*/
      
      //else this.cantCutiiMarfa = 10;
      this.cantCutiiMarfa = prevNrCutii;
      this.nrInmatriculare = nrInmatriculare;
      prevNrCutii++;
   }
   public int getNrCutii()
   { 
     return cantCutiiMarfa;
   }
   public String getNrInmatriculare()
   {
      return nrInmatriculare;
    }
}
