package empleado;

public class Empleado {
    
    // declarando los atributos
    String codigo;
    String nombre;
    String area;
    double sueldo1;
    int horas_extras1;
    double monto_horas_extras;    
    double descuento_afp;
    double descuento_salud;
    double descuento_snp;
    double monto_total_descuento;
    double sueldo_neto;
    double sueldo_total;
    
    public Empleado (double sueldo, int horas_extras){
        this.sueldo1 = sueldo;
        this.horas_extras1 = horas_extras;                                        
        
    }    
    
    public void calcular_monto_horas_extras(){
        monto_horas_extras = (sueldo1/240)*horas_extras1;
        
    }
    public void calcular_descuento_afp(){
        descuento_afp = sueldo1*0.11;
    }    
        
    public void  calcular_descuento_snp(){
        
        descuento_snp = sueldo1*0.13;                     
    }        
                          
    public void calcular_descuento_salud(){
        descuento_salud = sueldo1*0.03;                
      
    }
    public void calcular_total_descuento(){
        monto_total_descuento = descuento_salud + descuento_snp;
        
    }
    public void calcular_sueldo_neto(){
        sueldo_neto = sueldo1-monto_total_descuento;
    }
    public void calcular_sueldo_total(){
        sueldo_total = sueldo_neto + monto_horas_extras;
    }
    public void imprimir(){
        System.out.println("**********************************************************");
        System.out.println("***programa para calcular el sueldo total del trabajdor***");        
        System.out.println("su sueldo total es: "+sueldo_total);
    }
   
}
