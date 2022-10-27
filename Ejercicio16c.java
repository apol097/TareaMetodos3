public class Ejercicio16c {
    public static void main(String[] args) {
        String tabla[][] = new String[10][10];
        for (int i=1;i<=9;i++){
            for (int j=1;j<=9;j++){
                if ( (i+j == 10) || (j == 5) || (i==5) || (i==j)){
                    tabla[i][j] = "* ";
                }else {
                    tabla[i][j] = "  ";
                }
                System.out.print(""+tabla[i][j]);
            }
            System.out.println("");
        }
    }
}
