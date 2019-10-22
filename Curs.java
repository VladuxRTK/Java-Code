class Curs{
    private String denumire;
    private int id;
    private int cod;
    private int nr_cred;
    
    public Curs(String denumire,int id, int cod,int nr_cred){
        this.denumire=denumire;
        this.id=id;
        this.cod=cod;
        this.nr_cred=nr_cred;
    }

    public int getId(){
        return id;
    }

    public int getNrcred(){
        return nr_cred;
    }
    
    public String toString(){
        return id+" "+ denumire + " " + nr_cred;    
    }

    public boolean equalls(Object o){
        if(o instaceof Curs)
            {
                return (Curs)o.cod==this.cod;
            }
        else return false;
    }


}
