class Tir{
    private int indexCurent=0;
    
    private Remorca[] remorca = new Remorca[5]; 
    
    public boolean adaugaRemorca(int nrCutii,String nrInmatriculare)
    {
       if(indexCurent!=5)
       {
          remorca[indexCurent] = new Remorca(nrCutii,nrInmatriculare);
          indexCurent++;
          return true;
       }
       return false;
    }
    public boolean adaugaRemorca(Remorca remorca)
    {
        if(this.indexCurent!=5)
       {
          this.remorca[indexCurent] = remorca;
          indexCurent++;
          return true;
       }
       return false;
    }
    public Remorca stergeRemorca(String nume)
    {
       Remorca aux1 = null;
       for(int i = 0;i<indexCurent;i++)
       {
          if(this.remorca[i].getNrInmatriculare().equals(nume))
          {
              aux1 = remorca[i];
              for(int j = i + 1;j<indexCurent;j++)
              {
                 remorca[j-1]=remorca[j];
              }
              indexCurent--;
              break;
          }
       }
       return aux1;
    }
    public boolean equals(Object x)
    { if(x instanceof Tir) {
        Tir o = (Tir)x;
        int cantitateT1=0,cantitateT2=0;
        for(int i =0;i<this.indexCurent;i++)
        {
         cantitateT1+=this.remorca[i].getNrCutii();
        }
        for(int i =0;i<o.indexCurent;i++)
        {
            cantitateT2+=o.remorca[i].getNrCutii();
        }
        return (cantitateT1 == cantitateT2);
       }
       else
       return false;
      
    }
    
    public String toString(){
        String aux = "T -> ";
        
        for(int i=0;i<indexCurent;i++)
        {

             aux += "R" + i + "(" + this.remorca[i].getNrInmatriculare() + "," + this.remorca[i].getNrCutii() + ")" + " -> " ;
        }
        return aux;
    }
    
}
