import java.util.Scanner;
	
	public class tarea3_201212764	
	{	    
		public static void main(String[] args)
{
  Scanner scan = new Scanner(System.in);
   int n, x, cp = 0, ci = 0;
       System.out.print("Ingrese la cantidad de numeros a revisar: ");
       n = scan.nextInt();
   for (int i = 1; i <= n; i++)
	       {
	            System.out.print(i + ") Ingrese un numero: ");
   x = scan.nextInt();
          if (x % 2 == 0)            
	                cp++;            
          else            
          ci++;            
	        }
        System.out.println("La cantidad de pares son: " + cp);
	        System.out.println("La cantidad de impares son: " + ci);
	    }
	}



