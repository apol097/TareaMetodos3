import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class Ejercicio2{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introdusca la cantidad de alumnos : ");
        int num_empleados = sc.nextInt();
        String cod_emple[] = new String[num_empleados];
        String nombre_emple[] = new String [num_empleados];

        double evalucion[] = new double[num_empleados];
        int i;

        for(i=0;i<num_empleados;i++)
        {
        	System.out.print("Introduzca el nombre del empleado "+i+1+": ");
            nombre_emple[i] = sc.nextLine();
            System.out.print("Introduzca el codigo del empleado "+i+1+" : ");
            cod_emple[i] = sc.nextLine();   
            System.out.print("Introduzca el nombre del empleado "+i+1+" : ");
            evalucion[i] = sc.nextInt();    
        }
            System.out.println("-------------------  Detalle De Empleados Con Baja Evaluacion ---------------------"); 	
            System.out.println("Codigo Del Empleado\t\t\tNombre Del Empleado\t\t\tNota De Evaluación");
            
            for (i=0;i<num_empleados;i++)
            {
            	if(evalucion[i]<7)
            	{
            		System.out.println(cod_emple[i]+"\t\t\t"+nombre_emple[i]+"\t\t\t"+evalucion[i]);
            	}
            }
         
	}
}