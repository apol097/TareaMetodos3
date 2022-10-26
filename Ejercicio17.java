import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Ejercicio17 {
	
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
       
     
      int f,c,suma,numero;
       System.out.print("Ingrese Numero De Filas: ");
      f = sc.nextInt();
      System.out.print("Ingrese Numero De Columnas: ");
      c = sc.nextInt();
      int i,j;
      int matriz[][] = new int[f][c];
     
      
      for (i=0;i<f;i++)
      {
      	for (j=0;j<c;j++)
      	{
      		numero = (int)(Math.random()*100+1);
      		matriz[i][j] = numero;
      	}
      }
      
      for (i=0;i<f;i++)
      {
      	for (j=0;j<c;j++)
      	{ 
      	
      	System.out.print(matriz[j][i]+" ");
      	}

            System.out.println("");
      }
       
       


	}
}