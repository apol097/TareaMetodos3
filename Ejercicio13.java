import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca la cantidad de notas a ingresar por vector : ");
        int cantidadNotas = scanner.nextInt();
        int[] vector1 = new int[cantidadNotas];
        int[] vector2 = new int[cantidadNotas];
        System.out.println("Para el Primer Vector");
        for(int i = 0; i<cantidadNotas;i++){
            System.out.print("Introdusca la nota "+(i+1)+ " :");
            vector1[i] = scanner.nextInt();
        }
        System.out.println("Para el Segundo Vector");
        for(int i = 0; i<cantidadNotas;i++){
            System.out.print("Introdusca la nota "+(i+1)+ " :");
            vector2[i] = scanner.nextInt();
        }
        String mensajes[] = new String[cantidadNotas];
        for(int i = 0; i<cantidadNotas;i++){
            mensajes[i] =   (vector1[i]>vector2[i]) ? "\"Es Mayor\"" : 
                            (vector1[i]<vector2[i]) ? "\"Es Menor\"" : "\"Son Iguales\"";
        }
        System.out.println("Vector1\t\tVector2\t\tResultado");
        for(int i = 0 ; i<cantidadNotas ; i++){
            System.out.println(vector1[i] + "\t\t" + vector2[i] + "\t\t" + mensajes[i]);
        }
        scanner.close();
    }
}
