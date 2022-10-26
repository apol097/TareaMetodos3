
import java.util.Scanner;
class Ejercicio20{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int tabla[][] = new int[6][6];
        int num_mayor = 0;
        int resultado[] = new int[2];


		for (int f=0;f<5;f++)
		{
			
			
			for (int c=0;c<5;c++)
			{
				int numero = (int)(Math.random()*100+1);
				tabla[f][c]=numero;
			    tabla[f][5] += tabla[f][c];
			}
		}

		 for (int f=0;f<tabla.length -1 ;f++)
        {
        	//Lazo columnas
        	for (int c=0;c<tabla.length;c++)
        	{
        		System.out.print(tabla[f][c]+" ");
        		if (tabla[f][5] > num_mayor)
        		{
        			num_mayor = tabla[f][5];
        			resultado[0] = num_mayor;
        			resultado[1] = c + 1;
        		
        		}
        	}
        	System.out.println("");

        } 

       System.out.println("La suma mayor es: "+resultado[0]+" Y esta en la columna: "+resultado[1]);
	}
}