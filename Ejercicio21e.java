public class Ejercicio21e {
    public static void main(String[] args) {
        int contador = 1;
        int[][] numeros = new int[3][3];
        for(int columna = 0; columna <3; columna++){
            for(int fila = 2; fila >= 0 ; fila--){
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
