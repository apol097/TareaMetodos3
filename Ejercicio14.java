import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Ejercicio14{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[11];
		int numero;

		System.out.print("Ingrese la Tabla De Multiplicar: \n");
		numero = sc.nextInt();

		for(int i = 1;i<11; i++)
		{
			tabla[i] = i * numero;
		}
  
        for(int i = 1;i<11; i++)
		{
			System.out.println(numero+" * "+i+" = "+tabla[i]);
		}



        


	}
}
