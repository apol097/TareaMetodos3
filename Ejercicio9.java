import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca la cantidad de personas : ");
        int cantidadPersonas = scanner.nextInt();
        int edades[] = new int[cantidadPersonas], totalEdades = 0;
        int arribaMedia = 0, abajoMedia = 0;
        for(int i = 0; i<cantidadPersonas ; i++){
            System.out.print("Introdusca la edad de la persona " + (i+1)+ " :");
            edades[i] = scanner.nextInt();
            totalEdades += edades[i];
        }
        double media =  ((double)totalEdades/(double)cantidadPersonas);
        media = Math.round(media * 100) / 100d;
        System.out.println("La media de edades es : " + media);
        scanner.close();
        
        for(int i = 0; i <cantidadPersonas ; i++){
            if (edades[i] >= media ) arribaMedia++;
            else abajoMedia++;
        }
        int[] edadesArribaMedia = new int[arribaMedia];
        int[] edadesAbajoMedia = new int[abajoMedia];
        for(int i = 0 , j = 0, k = 0; i <cantidadPersonas ; i++){
           if(edades[i] >= media ){
                edadesArribaMedia[j] = edades[i];
                j++;
           }else{
                edadesAbajoMedia[k] = edades[i];
                k++;
           }
        }
        System.out.println("------Edades Arriba de la Media--------");
        for(int i = 0; i<arribaMedia;i++){
            System.out.println("Edad " + (i+1) + " :" + edadesArribaMedia[i]);
        }
        System.out.println("-------Edades Abajo de la Media--------");
        for(int i = 0; i<abajoMedia;i++){
            System.out.println("Edad " + (i+1) + " :" + edadesAbajoMedia[i]);
        }
    }
}
