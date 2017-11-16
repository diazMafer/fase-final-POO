package Frame;


import java.net.URI;
import org.mongodb.morphia.annotations.Entity;

/**
    * Modela las caracteristicas principales para poder un lugar turistico 
    * 
    * @author María Fernanda López, Francisco Molina
    * @version 13/09/2017
    
*/
@Entity 

public class LugarT extends Lugar{
	//Atributos 
	private String horario;
        private URI web;

	
        /**
         * Constructor for objects of class LugarT
         * @param nombre
         * @param descripcion
         * @param horario
         * @param departamento 
         */
	public LugarT(String nombre, String direccion, String departamento, String descripcion, double calificacion, int c1, int c2, int c3, int c4, int c5, String horario, URI web){
            super(nombre, direccion, departamento, descripcion, calificacion, c1, c2, c3, c4, c5);
            this.horario=horario;
            this.web=web;
	}
        
        public LugarT(){}

        /**
         * Metodo para obtener el horario del lugar turistico
         * @return horario del lugar
         */
        public String getHorario(){
		return horario;
	}
        public String getDepartamento(){
            return departamento;
        }
        
        public URI getWeb(){
            return web;
        }
        
}