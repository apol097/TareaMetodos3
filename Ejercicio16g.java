public class Ejercicio16 {
    public static void main(String[] args) {
        String tabla[][] = new String[10][10];

        int i, j, k;
        for (i = 0 ; i < 5; i++ ) {
            for (j = 0 ; j < i; j++ ) {
                tabla[i][j] = " ";
            }
            for(k = i; k < 5 ; k++) {
                tabla[i][k] = "* ";
            }
        }
        for (i = 4; i >= 0; i-- ) {
            for (j = 0 ; j < i; j++ ) {
                tabla[9-i][j] = " ";
            }
            for(k = i; k <= 4; k++) {
                tabla[9-i][k] = "* ";
            }
        }

        for( i = 0; i <10 ; i++){
            for( j = 0; j<10; j++){
                if(!(tabla[i][j] == null))
                    System.out.print(tabla[i][j]);
            }
            System.out.println();
        }
    }
}
