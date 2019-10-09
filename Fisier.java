class Fisier{
  private int id;
  private String nume_fisier;
  private String continut;
  private int nrConcatenari = 0;
  private static int nrFis = 1;
  private Fisier fisierVechi = null;
  
  
  public Fisier(String nume_fisier,String continut)
  {
   this.nume_fisier = nume_fisier;
   this.continut = continut;
   this.id=nrFis++;
  }
  /*public void seteazaID(int id)
  {
    this.id = id;
  }*/
  public void salveazaVersiune()
  {
    Fisier nou = new Fisier(this.nume_fisier + "bak",this.continut);
    nou.fisierVechi = this.fisierVechi;
    this.fisierVechi = nou;
    
  }
  public void concateneaza(Fisier fisierAux)
  {
     this.salveazaVersiune();
     this.continut += fisierAux.continut;
     nrConcatenari++;
     
  }
  public String toString()
  {
    
    if(this.fisierVechi!=null)
    {
      return this.id + " " + this.nume_fisier + " " + "[" + this.continut+ "]"+ " " + "<" +this.fisierVechi.toString() + ">";
    }
    else return this.id + " " + this.nume_fisier + " " + "[" + this.continut + "]";
  }
  public int nrConcatenari()
  {
    return nrConcatenari;
  }
  
  
  
}
