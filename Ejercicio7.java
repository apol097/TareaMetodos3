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
        int aux;
        for (int i = 0; i < edades.length - 1; i++){
            for(int j = 0; j < edades.length - i -1 ; j++ ){
                if ( edades[j + 1] > edades[j]){
                    aux = edades[j + 1];
                    edades[j+1] = edades[j];
                    edades[j] = aux;
                }
            }
        }
        System.out.print("Edades en forma Decreciente : ");
        for( int i = 0; i < edades.length ; i++){
            System.out.print(edades[i] + " ");
        }
        System.out.print("\nEdades en forma Creciente :");
        for( int  i = edades.length -1; i>=0 ; i--){
            System.out.print(edades[i]+ " ");
        }
        System.out.println();
        scanner.close();
    }
}
