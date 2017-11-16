package Frame;


import java.net.URI;
import org.mongodb.morphia.annotations.Entity;



/**
 * Modela las caracteristicas especificas de un restaurante
 * @author Maria Fernanda Lopez 17160
 * @author Francisco Molian 17050
 * @version 19/10/2017
 */
@Entity
public class Restaurante extends Lugar {
    private String telefono;
    private String horario;
    private URI web;
    
    /**
     * Constructor for objects of class Restaurante
     * @param nombre
     * @param direccion
     * @param departamento
     * @param descripcion
     * @param calificacion
     * @param c1
     * @param c2
     * @param c3
     * @param c4
     * @param c5
     * @param horario
     * @param telefono 
     */
    public Restaurante(String nombre, String direccion, String departamento, String descripcion, double calificacion, int c1, int c2, int c3, int c4, int c5, String horario, String telefono, URI web) {
        super(nombre, direccion, departamento, descripcion, calificacion, c1, c2, c3, c4, c5);
        this.telefono = telefono;
        this.horario= horario;
        this.web=web;
    }
    public Restaurante(){}
    /**
    * Metodo para obtener el horario del restaurante
    * @return: retorna nombre de restaurante.
    */
    public String getHorario() {
	return horario;
    }
    
    /**
    * Metodo para obtener el telefono del restaurante 
    * @return: retorna telefono.
    */
    public String getTel() {
	return telefono;
    }
    
    public URI getWeb(){
        return web;
    }
    
    @Override
     public String toString(){
        String msj2 ="Telefono " + getTel() + "\nHorario: " + getHorario();
        return msj2 + super.toString();
        
               
    }
   
}
        
   

    
    

