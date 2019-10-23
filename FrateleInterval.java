import java.io.*;
class FrateleInterval{
   
   public static void main(String[] args)
   {
   Interval[] interval=new Interval[20];
   int indexCurent=0;
   String[] numeFisiere = new String[20];
   
   try{
            BufferedReader in_stream_char1 =
            new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in_stream_char2 =
            new BufferedReader(new InputStreamReader(new FileInputStream("interval.dat")));
   /*PrintStream out_stream = new PrintStream(
new FileOutputStream("interval.dat"));*/
   int a,b;
   int nrFloat;
   while(true)
   {
      a = Integer.parseInt(in_stream_char2.readLine());
      b=Integer.parseInt(in_stream_char2.readLine());
      if(a!=0 &&b!=0)
      {
         interval[indexCurent]=new Interval(a,b);
         
         indexCurent++;
      }
      else if(a!=0 && b==0)
       {nrFloat = a;break;}
    
       
   }
   int nrFisier=0;
   while(nrFisier<nrFloat)
   {
      String nume = in_stream_char1.readLine();
      if(indexCurent!=0)
      {
         for(int i=0;i<numeFisiere.length;i++)
            {
         if(nume.equals(numeFisiere[i])) 
                {
                    System.out.println("eroare");
                    break;
                }
                    else numeFisiere[i]=nume;
         
            }
      
     }
     else numeFisiere[0]=nume;
      try{  
            BufferedReader in_stream_char3 =
            new BufferedReader(new InputStreamReader(new FileInputStream(nume)));
            Double x=Double.parseDouble(in_stream_char3.readLine());
            for(int i=0;i<indexCurent;i++)
            {
              interval[i].testObject(x);
              
                
            }
            if(args.length != 0)
                {
                   PrintStream out_stream = new PrintStream(new FileOutputStream((String)args[0]));
                  interval[0].afisareFisier(out_stream);
                }
                else System.out.println(x);
              
              
            }
         catch(IOException e) {
            System.out.println("Eroare la operatiile de intrare-iesire!");
            System.exit(1);
            }
            
   
       
      }
      } catch(IOException e) {
                System.out.println("Eroare la operatiile de intrare-iesire!");
                System.exit(1);
}
   }
   }
   
