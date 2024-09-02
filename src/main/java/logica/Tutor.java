
package logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Tutor extends Persona {
    
    //private int id_tutor;
    private String parentesco;

    public Tutor() {
    }

    public Tutor(String parentesco, int id, String nombre, String apellidos, String telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellidos, telefono, direccion, fecha_nac);
        this.parentesco = parentesco;
    }
    

    

    

    /*public int getId_tutor() {
        return id_tutor;
    }

    public void setId_tutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }*/

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    
    
    
}
