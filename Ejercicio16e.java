public class Ejercicio16e {
    public static void main(String[] args) {
        String tabla[][] = new String[10][10];

        for(int i = 0 ; i < 10 ; i++){
            for( int j = 0 ; j < 10 ; j++){
                if(i%2 == 0){
                    tabla[i][j] = "* ";
                }else {
                    tabla[i][j] = " *";
                }
                System.out.print(tabla[i][j]);
            }
             System.out.println("");
        }
    }
}
