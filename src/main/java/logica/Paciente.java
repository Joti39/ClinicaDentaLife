
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente extends Persona implements Serializable {
    //private int id_paciente;
    private boolean tiene_seguro;
    private String tipo_sangre;
    @OneToOne
    private Tutor tutor;
    @OneToMany (mappedBy="pacien")
    private List<Cita> citas;
    
    public Paciente() {
    }

    public Paciente(boolean tiene_seguro, String tipo_sangre, Tutor tutor, List<Cita> citas, int id, String nombre, String apellidos, String telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellidos, telefono, direccion, fecha_nac);
        this.tiene_seguro = tiene_seguro;
        this.tipo_sangre = tipo_sangre;
        this.tutor = tutor;
        this.citas = citas;
    } 

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }


    /*public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }*/

    public boolean isTiene_seguro() {
        return tiene_seguro;
    }

    public void setTiene_seguro(boolean tiene_seguro) {
        this.tiene_seguro = tiene_seguro;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    
}
