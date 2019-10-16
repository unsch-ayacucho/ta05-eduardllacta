
package prueba_empleado;

import empleado.Empleado;
import java.util.Scanner;
public class Prueba_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("ESCRIBE EL CODIGO DEL EMPLEADO: ");
        String codigo = teclado.nextLine();
        
        System.out.printf("ESCRIBE EL NOMBRE DEL EMPLEADO: ");
        String nombre = teclado.nextLine();
        
        System.out.printf("ESCRIBA EL LUGAR O AREA DONDE TRABAJA: ");
        String area_laboral = teclado.nextLine();
        
        System.out.printf("ESCRIBA EL MONTO DE SU SUELDO:");
        double sueldo = teclado.nextDouble();
        
        System.out.printf("ESCRIBA LAS HORAS EXTRAS  ");
        int horas_extras = teclado.nextInt();
                          
        Empleado datos = new Empleado(sueldo,horas_extras);
        datos.imprimir(); 
        
    }    
}
