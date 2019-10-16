class Test{
   public static void main (String[] args)
   {
      Tir t1 = new Tir();
      Tir t2 = new Tir();
      t1.adaugaRemorca(15,"remorca1");
      t1.adaugaRemorca(17,"remorca2");
      Remorca remorcaDeAdaugat = new Remorca("remorca3");
      t1.stergeRemorca("remorca2");
      Tir t3 = new Tir();
      Tir t4 = new Tir();
      t3.adaugaRemorca(10,"remorca");
      t3.adaugaRemorca(remorcaDeAdaugat);
      t4.adaugaRemorca(20,"remorca14");
      t4.adaugaRemorca(8,"remorca15");
      System.out.println(t3.equals(t4));
      System.out.println(t1);
      
      
      
   }
}
