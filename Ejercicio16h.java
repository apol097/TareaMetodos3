public class Ejercicio16h {
    public static void main(String[] args) {
        String tabla[][] = new String[10][10];
        String auxTabla[][] = new String[10][10];
        int i, j, k;
        for (i = 0 ; i < 5; i++ ) {
            for (j = 0 ; j < i; j++ ) {
                tabla[i][j] = " ";
            }
            for(k = i; k < 5 ; k++) {
                tabla[i][k] = "*";
            }
        }
        for (i = 4; i >= 0; i-- ) {
            for (j = 0 ; j < i; j++ ) {
                tabla[9-i][j] = " ";
            }
            for(k = i; k <= 4; k++) {
                tabla[9-i][k] = "*";
            }
        }

        for(i = 0; i<10 ; i++){
            for(j = 0 ; j < 10; j++ ){
                if(tabla[j][i] == null){
                    tabla[j][i] = " ";
                }
                auxTabla[i][j] = tabla[j][i];
            }
        }
        for(i = 4; i>=0 ; i--){
            for(j = 0 ; j < 10; j++ ){
               auxTabla[8-i][j] = auxTabla[i][j];
            }
        }

        for( i = 0; i <10 ; i++){
            for( j = 0; j<10; j++){
                if(!(tabla[i][j] == null))
                    System.out.print(auxTabla[i][j]);
            }
            System.out.println();
        }
    }
}
