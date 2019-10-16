class Remorca{
   private int cantCutiiMarfa = 0;
   private String nrInmatriculare;
   private static int prevNrCutii;
   
   public Remorca(int cantCutiiMarfa,String nrInmatriculare)
   {
      this(cantCutiiMarfa,nrInmatriculare);
      prevNrCutii = cantCutiiMarfa;
   
   public Remorca(String nrInmatriculare)
   {
      if(prevNrCutii!=10)
      {
        this.cantCutiiMarfa = prevNrCutii+1;
      }
      else this.cantCutiiMarfa = 10;
      this.nrInmatriculare = nrInmatriculare;
      prevNrCutii++;
   }
   
}
