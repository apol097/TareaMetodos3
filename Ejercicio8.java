import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class Ejercicio8{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
        double salario[] = new double[100];
        double nuevo_sal[] = new double[100];
        double suma_salario_ant = 0, suma_salario_nue = 0, incremento = 0;
        int i;

        for ( i = 0;i<100;i++)
        {
        	System.out.print("Ingrese el salario del empleado: "+(i+1)+" : ");
        	salario[i] = sc.nextDouble();
        	suma_salario_ant = suma_salario_ant + salario[i];
        }

        for ( i=0;i<100;i++)
        {
        	nuevo_sal[i] = (salario [i] * 0.20) + salario[i];
        }

        System.out.println("Salarios\t\t\tNuevo Salario");
        for (i=0;i<100;i++)
         {
         	System.out.println(salario[i]+"\t\t\t"+nuevo_sal[i]);
         	suma_salario_nue = suma_salario_nue + nuevo_sal[i];
        	
        }

        incremento = suma_salario_nue - suma_salario_ant;
        System.out.println("El Incremento en la masa salarial es: "+incremento);

	}
}