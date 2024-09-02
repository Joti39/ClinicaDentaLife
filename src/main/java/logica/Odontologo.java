
package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable {
    
    //JPA no pide id en las clases hijas porque ya lo llevan de la clase madre PERSONA, al elegir la estrategia TABLE_PER_CLASS
    //private int id_odontologo;
    private String especialidad;
    @OneToMany(mappedBy="odonto")
    private List<Cita> citas;
    @OneToOne
    private Horario horario;
    @OneToOne
    private Usuario usuario;
    
    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Cita> citas, Horario horario, Usuario usuario, int id, String nombre, String apellidos, String telefono, String direccion, Date fecha_nac) {
        super(id, nombre, apellidos, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.citas = citas;
        this.horario = horario;
        this.usuario = usuario;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    

    /*public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }*/

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
