
package programas;
import java.util.Scanner;
public class Programa02 {
//Método principal
    public static void main(String args[]) {
        //Declaración de variables
        String empleado;
        double ht,th,sb,d,sn;
        //Creando el objeto lectura
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre de empleado: ");
        empleado=lectura.next();
        System.out.print("Horas trabajadas: ");
        ht=lectura.nextDouble();
        System.out.print("Tarifa por hora: ");
        th=lectura.nextDouble();
        //Proceso de datos
        sb=ht*th;
        d=sb*0.10;
        sn=sb-d;
        //Salida de datos
        System.out.println("Sueldo bruto: "+sb);
        System.out.println("Descuento: "+d);
        System.out.println("Sueldo Neto; "+sn);
    }//Fin del método
}//Fin del programa
