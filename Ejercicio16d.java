public class Ejercicio16d {
    public static void main(String[] args) {
        String tabla[][] = new String[10][10];
		for (int i=9;i>=0;i--){
			for (int j=0;j<10;j++){
				if (!(j <= i)){
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
