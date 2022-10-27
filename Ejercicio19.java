
import java.util.Scanner;

class Ejercicio19{
	
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       
        int f,c,numero;
        System.out.print("Ingrese Numero De Filas: ");
        f = scanner.nextInt();
        int sumaF[] = new int[f];
        System.out.print("Ingrese Numero De Columnas: ");
        c = scanner.nextInt();
        int sumaC[] = new int[c];
        int i,j;
        int matriz[][] = new int[f][c];
        
        for (i=0;i<f;i++){
            for (j=0;j<c;j++){
                numero = (int)(Math.random()*100+1);
                matriz[i][j] = numero;
            }
        }
        System.out.println("Matriz Generada : ");
        int auxSuma = 0 ;
        for ( i=0; i<f; i++ ){
            for ( j = 0; j < c ;j++ ){ 
                System.out.print(matriz[j][i]+"\t");
                auxSuma += matriz[i][j];
            }
            sumaF[i] = auxSuma;
            auxSuma = 0;
            System.out.println();
        }
        for ( j=0; j<c; j++ ){
            for ( i = 0; i<f ;i++ ){ 
                auxSuma += matriz[i][j];
            }
            sumaC[j] = auxSuma;
            auxSuma = 0;
        }
        System.out.print("Suma de Filas : ");
        for ( i = 0; i<sumaF.length ;i++ ){ 
            System.out.print(sumaF[i] + "\t");
        }

        System.out.print("\nSuma de Columnas : ");

        for ( j=0; j<sumaC.length; j++ ){
            System.out.print(sumaC[j] + "\t");  
        }
        System.out.println();
    } 
}