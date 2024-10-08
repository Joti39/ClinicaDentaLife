
package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;
import logica.Usuario;


@WebServlet(name = "SVUsuarios", urlPatterns = {"/SVUsuarios"})
public class SVUsuarios extends HttpServlet {
    
    ControladoraLogica control = new ControladoraLogica();

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();
        
        
        listaUsuarios = control.getUsuarios();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios", listaUsuarios);
        
        //System.out.println("Usuario: " + listaUsuarios.get(0));
        
        response.sendRedirect("verUsuarios.jsp");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombreUsuario = request.getParameter("nombreUsu");
        String contra = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        //System.out.println("El nombre de usuario es: "+nombreUsuario);
        control.crearUsuario(nombreUsuario, contra, rol);
        
        
        response.sendRedirect("index.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
