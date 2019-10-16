
package ventana;
public class Ventana {
    // declarando los atributos de la clase ventana   
    public String nombre_ventana;
    public double tamaño;
    public String color;
    
    // VARIBLLE PARA INSTANCIAR EL OBJETO
    String palabra;
        
    // CONSTRUCTOR CON TRES ARGUMENTOS

    public Ventana(String nombre_ventana, double tamaño, String color) {
        this.nombre_ventana = nombre_ventana;   // almacena nombre de ventana
        this.tamaño = tamaño;                   // almacenar tamaño
        this.color = color;                     // almacenar color
    }
    //CONSTRUCTOR PARA LA VARIABLE PALABRA

    public Ventana(String palabra) {
        this.palabra = palabra;
    }//FIN DEL CONSTRUCTOR
          
    // metodo para cerrar ventana
    public void cerrar_ventana(){
        
       
        System.out.println("\033[34m┌────────────────────────┬─┬─┬─┐");
        System.out.println("│\t\t\033[32mESCRITORIO \t\t\033[31m-  ■  X \033[34m│");
        System.out.println("\033[34m└────────────────────────┴─┴─┴─┘ ");
        System.out.println("\033[34m│                                               │ ");
        System.out.println("\033[34m│                                               │ ");
        System.out.println("\033[34m│                                               │ ");
        System.out.println("\033[34m│                                               │ ");
        System.out.println("\033[34m└──────────────────────────────┘");
        
        
        if("SI".equals(palabra)){
            System.out.println("************************************************************");
            System.out.println();
            System.out.println("LA VENTANA SE CERRADO");
            
        }
        else{
            System.out.println("**********************************************************");
            System.out.println();
            System.out.println("LA VENTANA ESTA ABIERTO");
            System.out.println("\033[34m┌────────────────────────┬─┬─┬─┐");
            System.out.println("│\t\tt\033[32mESCRITORIO \t\t\033[31m-  ■  X \033[34m│");
            System.out.println("\033[34m└────────────────────────┴─┴─┴─┘ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m└──────────────────────────────┘");
        }
                
    }
    //FIN DEL METODO
    
    //METODO PARA ABRIR VENTANA
    public void abrir_ventana(){
                        
        if("SI".equals(palabra)){
            System.out.println("VENTANA ESTA ABIERTO");
            System.out.println("********************************************************");
            System.out.println();
            System.out.println("\033[34m┌────────────────────────┬─┬─┬─┐");
            System.out.println("│\t\t\033[32mESCRITORIO \t\t\033[31m-  ■  X \033[34m│");
            System.out.println("\033[34m└────────────────────────┴─┴─┴─┘ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m│                                               │ ");
            System.out.println("\033[34m└──────────────────────────────┘");
        }
        //fin de if
        else{
            System.out.println("*******************************************************");
            System.out.println("LA VENTANA ESTA CERRADO PORQUE UD NO LA ABRIO");
        }
        //fin de else       
    }    
    //FIN DEL METODO ABRI VENTANA
    
    //METODO MINIMIZAR VENTANA
    public void minimizar_ventana(){
        System.out.println("MINIMIZAR LA VENTANA");
        
    }
    //FIN DEL METODO MINIMIZAR VENTANA
    
    //METODO PARA MAXIMIZAR VENTANA
    public void maximizar_ventana(){
        System.out.println("MAXIMIXAR LA VENTANA");        
    }
    //FIN DEL METODO MAXIMIZAR VENTANA       
}
