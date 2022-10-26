import java.util.Scanner;

/**
 * Ejercicio1
 */
public class Ejercicio1 {
  
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Introdusca la cantidad de alumnos : ");
        int totalAlumnos = scanner.nextInt();
        String carnets[] = new String[totalAlumnos], nombres[] = new String[totalAlumnos];
        double notas[] = new double[totalAlumnos];
        
        for(int i = 0; i < totalAlumnos; i++){
            System.out.print("Introdusca la nota del alumno " + (i+1)+ " :") ;
            notas[i] = scanner.nextDouble(); 
            System.out.print("Intoduca el carnet del alumno " +(i+1)+ " :");
            carnets[i] = scanner.next();
            System.out.print("Introduce el nombre del alumno "+(i+1)+ " :");
            nombres[i] = scanner.next();
        }
        System.out.println("-------------------  Detalle de Alumnos ---------------------");
        System.out.println("carnet\t\t\tnombre\t\t\tnota");
        System.out.println("-------------------------------------------------------------");
        for(int i = 0; i < totalAlumnos ; i++){
            if(notas[i] <=10 && notas[i] >= 8.5)
                System.out.println(carnets[i] + "\t\t\t" + nombres[i] + "\t\t\t" + notas[i]);
            else
                continue;
        }
      scanner.close();  
    }
    
}