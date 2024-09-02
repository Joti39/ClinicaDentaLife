
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladoraLogica;


@WebServlet(name = "SVLogin", urlPatterns = {"/SVLogin"})
public class SVLogin extends HttpServlet {

   ControladoraLogica control = new ControladoraLogica();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario=request.getParameter("usuario");
        String contrasenia=request.getParameter("contrasenia");
        
        boolean esValido = false;
        esValido = control.comprobarLogin(usuario, contrasenia);
        
        if(esValido==true){
            HttpSession miSesion=request.getSession(true);
            
            miSesion.setAttribute("usuario", usuario);
            response.sendRedirect("index.jsp");
        }
        else {
            response.sendRedirect("loginError.jsp");
            
        }
     
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
