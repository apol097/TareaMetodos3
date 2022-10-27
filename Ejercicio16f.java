public class Ejercicio16f {
    public static void main(String[] args) {
        String tabla[][] = new String[10][10];
		for (int i=0;i<10;i++){
			for (int j=9;j>=0;j--){
				if (j <= i){
					tabla[i][j] = "  ";
		        }else {
		        	tabla[i][j] = "* ";
		        }
		        System.out.print(""+tabla[i][j]);
			}
        	System.out.println("");
		}
    }
}
