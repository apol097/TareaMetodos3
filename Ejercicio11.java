import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Introdusca la Cantidad de Empleados: "); 
        int cantidadempleados = scanner.nextInt(); 
        double cantidadVentas; 
        double[] sueldoTotal, descuentos, sueldoNeto; 
        double isss = 0.03 , afp = 0.05, renta = 0.10;
        double totalDescuento = isss + afp + renta; 
        sueldoTotal = new double[cantidadempleados];
        descuentos  = new double[cantidadempleados];
        sueldoNeto  = new double[cantidadempleados]; 
        System.out.print("Introdusca el sueldo base: "); 
        double sueldoBase = scanner.nextDouble(); 
        System.out.print("Intodusca el valor de las ventas: "); 
        double valorVentas = scanner.nextDouble(); 
        for(int i = 0; i< cantidadempleados;i++){ 
            System.out.print("Introdusca la cantidad de ventas para el empleado " + (i+1) + " : ");
            cantidadVentas = scanner.nextInt(); 
            sueldoTotal[i] = sueldoBase + valorVentas*cantidadVentas*(0.20); 
        } 

        System.out.println("Empleado\tSueldo Total\tDescuento\tSueldo Neto" );
        for(int i = 0; i< cantidadempleados;i++){ 
            System.out.print("  "+(i+1)+"\t\t  " + sueldoTotal[i]); 
            descuentos[i] = (double)Math.round((sueldoTotal[i]*totalDescuento)*100)/100d;
            //La variable esta cambiando valor
            System.out.print("\t\t  " + descuentos[i]); 
            sueldoNeto[i] = sueldoTotal[i] - descuentos[i];
            System.out.println("\t\t  " + sueldoNeto[i]); 
            
        } 
        scanner.close();
    }
}
