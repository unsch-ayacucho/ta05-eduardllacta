
package prueba_estudiante;

import estudiante.Estudiante;// importando el paquete estudiante de la clase Estudiante
import java.util.Scanner;  // importando la clase scanner
public class Prueba_estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaranod la clase scanner
        Scanner teclado = new Scanner(System.in);
        
        // pidiendo al usuario que ingrese sus datos
        System.out.printf("\033[36mINGRESE SU CODIGO            :");
        String codigo = teclado.nextLine();
        
        System.out.printf("\033[36mINGRESE SU APELLIDO          :");
        String apellido = teclado.nextLine();
        
        System.out.printf("\033[36mINGRESE SU ESPECIALIDAD      :");
        String especialidad = teclado.nextLine();
        
        System.out.printf("\033[36mINGRSE SU PRIMERA NOTA 1     :");
        int nota1 = teclado.nextInt();
        
        System.out.printf("\033[36mINGRESE SU SEGUNDA NOTA 2    :");
        int nota2 = teclado.nextInt();
        
        System.out.printf("\033[36mINGRESE SU TEERCERA NOTA     :");
        int nota3 = teclado.nextInt();
        
        System.out.printf("\033[36mINGRESE SU CUARTA NOTA       :");
        int nota4 = teclado.nextInt();
               
        // declarando y creando el objeto de la clase
       
        Estudiante obj = new Estudiante(codigo,apellido,especialidad);
        Estudiante obj1 = new Estudiante(nota1,nota2,nota3,nota4);
        System.out.println();
        obj.datos();
        obj1.imprimir();
                                                  
    }   
}
