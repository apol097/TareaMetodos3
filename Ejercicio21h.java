public class Ejercicio21h {
    public static void main(String[] args) {
        int contador = 1;
        int[][] numeros = new int[3][3];
        for(int fila = 2; fila >=0; fila--){
            for(int columna = 2; columna >= 0 ; columna--){
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
