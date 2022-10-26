// import java.io.*;
import java.util.Scanner;
// import java.util.Arrays;
// import java.util.*;
class Ejercicio12{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num_alumnos;
		System.out.print("Ingrese La Cantidad de Alumnos: ");
		 num_alumnos = sc.nextInt();
		 sc.nextLine();
		String nom_alum[] = new String[num_alumnos];
		String carnet[] = new String[num_alumnos];
		double evaluacion1[] = new double[num_alumnos];
		double evaluacion2[] = new double[num_alumnos];
		double evaluacion3[] = new double[num_alumnos];
		double evaluacion4[] = new double[num_alumnos];
		double evaluacion5[] = new double[num_alumnos];
		double nota_final[] = new double[num_alumnos];
		int i;
		

		for (i=0;i<num_alumnos;i++)
		{
			 sc.nextLine();
			System.out.print("\nIngrese El Nombre Del Alumno: ");
			nom_alum[i] = sc.nextLine();
			System.out.print("Ingrese El Carnet Del Alumno: ");
			carnet[i] = sc.nextLine();
			System.out.print("Ingrese La evaluacion 1: ");
			evaluacion1[i] = sc.nextDouble();
			System.out.print("Ingrese La evaluacion 2: ");
			evaluacion2[i] = sc.nextDouble();
			System.out.print("Ingrese La evaluacion 3: ");
			evaluacion3[i] = sc.nextDouble();
			System.out.print("Ingrese La evaluacion 4: ");
			evaluacion4[i] = sc.nextDouble();
			System.out.print("Ingrese La evaluacion 5: ");
			evaluacion5[i] = sc.nextDouble();
			nota_final[i] = evaluacion1[i] * 0.2 + evaluacion2[i] * 0.2 + evaluacion3[i] * 0.2 + evaluacion4[i] * 0.2 + evaluacion5[i] * 0.2;


		}
         

        System.out.println("----------------Detalles De Alumnos------------------"); 
		for (i=0;i<num_alumnos;i++)
		{
			System.out.println("Nombre Del Alumno: "+nom_alum[i]);
			System.out.println("Carnet: "+carnet[i]);
			System.out.println("Evaliacion 1: "+evaluacion1[i]+"\t\t\tEvaluacion 4: "+evaluacion4[i]);
			System.out.println("Evaliacion 2: "+evaluacion2[i]+"\t\t\tEvaluacion 5: "+evaluacion5[i]);
			System.out.println("Evaliacion 3: "+evaluacion3[i]+"\t\t\tNota Final: "+nota_final[i]);



		}
        
        System.out.println("---------------Detalles De Alumnos Aprobados--------------"); 
		for (i=0;i<num_alumnos;i++)
		{
			if (nota_final[i]>6)
			{
			System.out.println("Nombre Del Alumno: "+nom_alum[i]);
			System.out.println("Carnet: "+carnet[i]);
			System.out.println("Evaliacion 1: "+evaluacion1[i]+"\t\t\tEvaluacion 4: "+evaluacion4[i]);
			System.out.println("Evaliacion 2: "+evaluacion2[i]+"\t\t\tEvaluacion 5: "+evaluacion5[i]);
			System.out.println("Evaliacion 3: "+evaluacion3[i]+"\t\t\tNota Final: "+nota_final[i]);
            }
			

		}
         
        System.out.println("---------------Detalles De Alumnos Reprobados--------------");  
		for (i=0;i<num_alumnos;i++)
		{
			if (nota_final[i]<6)
			{
			System.out.println("Nombre Del Alumno: "+nom_alum[i]);
			System.out.println("Carnet: "+carnet[i]);
			System.out.println("Evaliacion 1: "+evaluacion1[i]+"\t\t\tEvaluacion 4: "+evaluacion4[i]);
			System.out.println("Evaliacion 2: "+evaluacion2[i]+"\t\t\tEvaluacion 5: "+evaluacion5[i]);
			System.out.println("Evaliacion 3: "+evaluacion3[i]+"\t\t\tNota Final: "+nota_final[i]);
            }
			

		}
		sc.close();

	}
}