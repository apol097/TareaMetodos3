import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdusca el numero ganador del sorteo: ");
        double numeroGanador = scanner.nextDouble();
        int contador = 0;
        double cantidad1, cantidad2 , cantidad3 , suma;

        while( contador < 3 ){
            System.out.println("\n!!!Querido concursante!!!");
            System.out.print("Introdusca la cantidad del primer comprobante : ");
            cantidad1 = scanner.nextDouble();
            System.out.print("Introdusca la cantidad del segundo comprobante: ");
            cantidad2 = scanner.nextDouble();
            System.out.print("Introdusca la cantidad del tercer comprobante: ");
            cantidad3 = scanner.nextDouble();

            suma = cantidad1 + cantidad2 + cantidad3;

            if( suma == numeroGanador ){
                contador++;
                System.out.println("!!!Felicidades eres el Ganador " + contador + " del sorteo!!!");
            }
        }   

        scanner.close();
    }
}
