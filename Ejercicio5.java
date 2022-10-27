import java.util.Scanner;
// no esta listo aun hay que preguntar

public class Ejercicio5 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca la cantidad de Empleados : ");
        int cantidadEmpleados = scanner.nextInt();

        double[] sueldoBase = new double[cantidadEmpleados];
        int[] horasExtra = new int[cantidadEmpleados];
        double[] descuentos = new double[cantidadEmpleados];
        double[] sueldoNeto = new double[cantidadEmpleados];
        String nombres[] = new String[cantidadEmpleados];
        String codigo[] = new String[cantidadEmpleados];
        System.out.print("Introdusca el porcentaje de Descuentos : ");
        double descuento = scanner.nextDouble()/100.00d;
        System.out.print("Introdusca el valor de la hora extra :");
        double pagoHora = scanner.nextDouble();

        for( int i = 0 ; i < cantidadEmpleados ; i++){
            System.out.print("Introdusca el Nombre del Empleado "  + (i+1)+" :");
            nombres[i] = scanner.next();
            System.out.print("Introdusca el Codigo de Empleado "+ (i+1)+" :");
            codigo[i] = scanner.next();
            System.out.println("Introdusca el sueldo Base del Empleado: "+ (i+1)+" :");
            sueldoBase[i] = scanner.nextDouble();
            System.out.println("Introdusca la cantidad de Horas Extra");
            horasExtra[i] = scanner.nextInt();
        }
        System.out.println("Codigo\tNombre\tSueldo Neto");
        for( int i = 0 ; i < cantidadEmpleados ; i++){
            descuentos[i] = sueldoBase[i]*descuento;
            sueldoNeto[i] = sueldoBase[i] - descuentos[i] + pagoHora*horasExtra[i];
            System.out.println(codigo[i] + "\t" + nombres[i] + "\t" + sueldoNeto[i] );
        }
        scanner.close();
    }
}
