class Test{
   public static void main(String[] args)
   {
     Fisier f = new Fisier("abc","ader");
     Fisier aux = new Fisier("cdf","rer");
     f.salveazaVersiune();
     
     
     System.out.println(f);
     f.concateneaza(aux);
     System.out.println(f);
     System.out.println("Numar concaternari " + f.nrConcatenari());
   }
}
