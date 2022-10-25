import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class Ejercicio4{

	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de clientes : ");
		int num_clientes = sc.nextInt();
		String nombre_clien[]= new String[num_clientes];
		String telefono[]=new String[num_clientes];
		String direccion[] = new String[num_clientes];
		double inversion[] = new double[num_clientes];
		String porcentaje[] = new String[num_clientes];
		double monto_cancelar[] = new double[num_clientes];
        int i;

        for (i=0;i<num_clientes;i++)
        {
        	System.out.print("Ingrese El Nombre Del Cliente "+i+1+" : " );
        	nombre_clien[i] = sc.nextLine();
        	System.out.print("Ingrese El Telefono Del Cliente "+i+1+" : ");
        	telefono[i] = sc.nextLine();
        	System.out.print("Ingrese La Direccion Del Cliente "+i+1+" : ");
        	direccion[i] = sc.nextLine();
        	System.out.print("Ingrese La Inversion Del Cliente "+i+1+" : ");
        	inversion[i] = sc.nextDouble();
        	if (inversion[i]>=10.00 && inversion[i]<=20.00)
        	{
        		porcentaje[i] = "10%";
        		monto_cancelar[i] = inversion[i] - (inversion[i] * 0.10); 
        	} else if (inversion[i]>= 21.00 && inversion[i]<=50.00)
        	{
        		porcentaje[i] = "15%";
        		monto_cancelar[i] = inversion[i] - (inversion[i] * 0.15); 
        	}else {
        		porcentaje[i] = "20%";
        		monto_cancelar[i] = inversion[i] - (inversion[i] * 0.12); 
        	}
          
        }
     
        System.out.println("------------------------Detalles De Clientes General--------------------------------");
        System.out.println("Nombre Del Cliente\t\t\tTelefono\t\t\tDireccion Del Cliente\t\t\tInversion\t\t\tPorcentaje De Descuento\t\t\tMonto A Cancelar");
        for (i=0;i<num_clientes;i++)
        {
        	System.out.println(nombre_clien[i]+"\t\t\t"+telefono[i]+"\t\t\t"+direccion[i]+"\t\t\t"+inversion[i]+"\t\t\t"+porcentaje[i]+"\t\t\t"+monto_cancelar);
        }
        
        System.out.println("------------------------Detalles De Clientes Con 10% Descuento--------------------------------");
        for (i=0;i<num_clientes;i++)
        {
        	if (porcentaje[i] == "10%")
        	System.out.println(nombre_clien[i]+"\t\t\t"+telefono[i]+"\t\t\t"+direccion[i]+"\t\t\t"+inversion[i]+"\t\t\t"+porcentaje[i]+"\t\t\t"+monto_cancelar);
        }

         System.out.println("------------------------Detalles De Clientes Con 15% Descuento--------------------------------");
        for (i=0;i<num_clientes;i++)
        {
        	if (porcentaje[i] == "15%")
        	System.out.println(nombre_clien[i]+"\t\t\t"+telefono[i]+"\t\t\t"+direccion[i]+"\t\t\t"+inversion[i]+"\t\t\t"+porcentaje[i]+"\t\t\t"+monto_cancelar);
        }
        
         System.out.println("------------------------Detalles De Clientes Con 20% Descuento--------------------------------");
        for (i=0;i<num_clientes;i++)
        {
        	if (porcentaje[i] == "20%")
        	System.out.println(nombre_clien[i]+"\t\t\t"+telefono[i]+"\t\t\t"+direccion[i]+"\t\t\t"+inversion[i]+"\t\t\t"+porcentaje[i]+"\t\t\t"+monto_cancelar);
        }


	}

}