
package persistencia;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    HorarioJpaController horaJPA; 
    OdontologoJpaController odontoJPA; 
    PacienteJpaController pacJPA;
    PersonaJpaController persJPA;
    TutorJpaController tutJPA;
    UsuarioJpaController usuJPA;
    CitaJpaController citaJPA;
    SecretarioJpaController secreJPA;

    public ControladoraPersistencia() {
        
    horaJPA = new HorarioJpaController();
    odontoJPA = new OdontologoJpaController();
    pacJPA = new PacienteJpaController();
    persJPA = new PersonaJpaController();
    tutJPA = new TutorJpaController();
    usuJPA = new UsuarioJpaController();
    citaJPA = new CitaJpaController();
    secreJPA = new SecretarioJpaController();
    }

    
    public void crearUsuario(Usuario usu) {
        usuJPA.create(usu);
    }

    public List<Usuario> getUsuarios() {
       
        return usuJPA.findUsuarioEntities();
        
    }

    public void borrarUsuario(int id) {

        try {
            usuJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    public Usuario traerUsuario(int id) {
        
        return usuJPA.findUsuario(id);
        
    }

    public void editarUsuario(Usuario usu) {
        
        try {
            usuJPA.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
}   
