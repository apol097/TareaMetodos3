import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Ejercicio18{

	public static void main(String args[]) 
	{
		int tabla[][] = new int [3][3];
		int num_mayor = 0;
		int filama=0;
		int colum_ma=0;
		Scanner sc = new Scanner(System.in);
       
        for (int f=0;f<3;f++)
		{
			for (int c=0;c<3;c++)
			{
			
				int numero = (int)(Math.random()*100+1);
				tabla[f][c]=numero;
			}

		
		}
        
        for (int f=0;f<3;f++)
        {
        	//Lazo columnas
        	for (int c=0;c<3;c++)

        	{
        			
        		System.out.print(tabla[c][f]+" ");
        		if (tabla[c][f] > num_mayor)
        		{
        			num_mayor = tabla[c][f];
        			filama  = f + 1;
        			colum_ma = c + 1;
        		
        		}

        	}
        	System.out.println("");

        } 
         
         System.out.println("\nEl numero mayor es: "+num_mayor+" Se encuentra en fila : "+filama+" y columna: "+colum_ma);

	}
}