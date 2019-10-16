
package estudiante;
public class Estudiante {
    
    // declarando los atributos de la clase estudiante
    private String codigo; // variable de la instancia
    private String apellido;
    private String especialidad;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    
    //declrando avriable global
    private int promedio;
   
    
    // metodo constructor
    // para establecer  el nombre  en el objeto
    
    public Estudiante(int nota1, int nota2, int nota3, int nota4) {
      
        this.nota1 = nota1;// almacenamos nota 1
        this.nota2 = nota2;// almacenamos nota 2
        this.nota3 = nota3;// almacenamos nota 3
        this.nota4 = nota4;// almacenamos nota 4
    }

    public Estudiante(String codigo, String apellido, String especialidad) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }   
    
    // metodo para calcular el promedio del estudoante
    // agreganod una variable local al metodo
    public void Calculo_promedio(){
        // usando la escructutura de control anidado if-else
        if(nota1<nota2 && nota1<nota3 && nota1<nota4){
            promedio = (nota2+nota3+nota4)/3;                
        }
        else{
            if(nota2<nota1 && nota2<nota3 && nota2<nota4){
                promedio=(nota1+nota3+nota4)/3;
            }
            else{
                if(nota3<nota1 && nota3<nota2 && nota3<nota4){
                    promedio = (nota1+nota2+nota4)/3;
                }
                else{
                    promedio = (nota1+nota2+nota3)/3;
                }
            }
        }        
    }
    //fin del metodos promedio
    
    // medoto para mostrar sus datos
    public void datos(){
        
        System.out.println("\033[32mCODIGO: "+codigo+"\n\033[32mAPELLIDO: "+apellido+"\n\033[32mESPECIALIDAD: "+especialidad);        
    }
    // fin de l metodo dato
    
    // metodo para mostrar el promedio
    public void imprimir(){
        Calculo_promedio();
        System.out.println("\033[32m*********************************************");              
        System.out.println("\033[32mSUS NOTAS: "+nota1+";"+nota2+";"+nota3+";"+nota4);
        System.out.println();
        System.out.println("\033[32m*********PROMEDIO FINAL*********************");        
        System.out.println("\033[32mRESULTADO DEL PROMEDIO FINAL: "+promedio);
    }
    // fin del metodo imprimir
     
}
