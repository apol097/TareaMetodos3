public class Ejercicio21a {
    public static void main(String[] args) {
        int contador = 1;
        int[][] numeros = new int[3][3];
        for(int fila = 0; fila <3; fila++){
            for(int columna = 0; columna < 3 ; columna++){
                numeros[fila][columna] = contador;
                contador++;
            }
        }
        
        for( int i = 0; i<3 ; i++){
            for( int j = 0; j<3;j++){
                System.out.print( numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
