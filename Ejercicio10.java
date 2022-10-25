import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

class Ejercicio10{

	public static void main(String args[]) 
	{
		int j = 0;
		Scanner sc = new Scanner(System.in);
        String letras[] = new String[1500];
        String vocales[] = new String[j];
        
        int i;

        for ( i=0;i<1500;i++)
        {
        System.out.println("Ingrese la letra: "+(i+1)+" : ");	
        letras[i] = sc.nextLine().toLowerCase();

        }

        for (i = 0;i<1500;i++)
        {
        	if(letras[i] == "a" || letras[i] == "e" || letras[i] == "i" || letras[i] == "o" || letras[i] == "u")
        	j++;
            vocales[j] = letras[i];
        }

        System.out.println("Las vocales son: ");
        for (i = 0;i<j;i++)
        {
        	System.out.println(vocales[j]);
        }
	}
}