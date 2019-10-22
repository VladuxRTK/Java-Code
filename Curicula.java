class Curicula{
    private int indexCurrent=0; 
    private Curs[] cursuri= new Curs[10];
       
    public void add(Curs c){
        if(indexCurent<cursuri.length)
           {
               Curs aux = c;
               cursuri[indexCurent] = aux;
               indexCurent++;
               
           }
        else //completam mai tarziu ca nu stiu sa realoc dinamic
        
    }
    
    public String toString()
    {
       String aux;
       for(int i=0;i<=indexCurent;i++)
       {
            aux+= cursuri[i].() + " ";
       }
       return aux;
    }
    
    public Curs cauta(int id)
    {
       Curs aux1;
       for(int i=0;i<=indexCurent;i++)
          {
             if(cursuri[i].id == id)
               aux1=cursuri[i];
          }
       return aux1;
    } 
   
    //public load(String fisier){ sa o faca ma-ta t CE proasta de om guma}

       
     
}
