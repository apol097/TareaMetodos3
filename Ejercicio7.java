import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca la cantidad de personas : ");
        int cantidadPersonas = scanner.nextInt();
        int edades[] = new int[cantidadPersonas], totalEdades = 0;

        for(int i = 0; i<cantidadPersonas ; i++){
            System.out.print("Introdusca la edad de la persona " + (i+1)+ " :");
            edades[i] = scanner.nextInt();
            totalEdades += edades[i];
        }

        for(int i = 0; i <cantidadPersonas ; i++){
            System.out.println("Edad "+ (i+1) + " :" + edades[i]);
        }
        
        System.out.println("La media de edades es : " + (totalEdades/cantidadPersonas));
        scanner.close();
    }
}
