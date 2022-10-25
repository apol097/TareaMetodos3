import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Ejercicio6{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int edad[] = new int[20];
		String nombres[] = new String[20];

		for (int i=0;i<20;i++)
		{   
		System.out.print("Ingrese la edad de la persona "+(i+1)+" : ");
		edad[i] = sc.nextInt();
			if (edad[i]>=15 && edad[i]<45)
			{
			  System.out.print("Ingrese el Nombre de la Persona "+(i+1)+" : ");
			  nombres[i] = sc.nextLine();
			} else 
			{
				System.out.println("No esta en la de entre 15 y 45");
				i--;
			}
           
       System.out.println("----------------------Peronas Entre 15 y 45-----------------------------------");
       System.out.println("Nombre De La Persona\t\t\tEdad De La Persona");
        for ( i=0;i<20;i++)
        {
        	System.out.println(nombres[i]+"\t\t\t"+edad[i]);

        }

		}



		}
	}