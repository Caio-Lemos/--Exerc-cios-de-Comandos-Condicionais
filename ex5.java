import java.util.Scanner;
public class ex5 {

	public  static  void  main ( String [] args ) {       
        Scanner leitor =  new Scanner ( System.in ); 
        
       double w;
       double x;
       double y;
       double z;
       
       System.out.println("Notas de 0 a 10,0");
       System.out.println("Ex: 5,3");
       System.out.println();
       
       
       
       System.out.println("Primeiro valor");
       w = leitor.nextDouble();
       
       System.out.println("Primeiro valor");
       x = leitor.nextDouble();
       
       System.out.println("Primeiro valor");
       y = leitor.nextDouble();
       
       System.out.println("Primeiro valor");
       z = leitor.nextDouble();
      
      double t= (w+x+y+z)/4;
      
      if (t>=7.0) {
    	  System.out.println("Aprovado");
    	  
    	        }
       if(t>3.5 && t<7.0) {
    	   System.out.println("Recupeção");
       }
       if(t<=3.5) {
    	   System.out.println("Reprovado");
    	   
       }
}
}