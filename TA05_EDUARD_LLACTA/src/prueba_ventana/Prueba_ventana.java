
package prueba_ventana;

import ventana.Ventana;// importando el paquete ventana de la clase Ventana
import java.util.Scanner;
public class Prueba_ventana {

    
    public static void main(String[] args) {
        
        // declarando la clase Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println("QUE DESEA HACER");
        System.out.println("SI= ABRIR VENTANA\tNO= NO SE ABRIO LA VENTANA");
        System.out.println("SI= CERRAR VENTANA VENTANA\tNO= DEJAR VENTANA ABIERTO");
        System.out.println("\033[33m\t[SI]\t[NO]");
        String palabra=teclado.nextLine();
        
        // declarando e inicializando el objeto
        Ventana ob1 = new Ventana(palabra);
        ob1.abrir_ventana();
        System.out.println();
        ob1.cerrar_ventana();                
    }    
}
