package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modeloDAO.PersonaDAO;
import Modelo.Persona;


public class Controlador extends HttpServlet {

    String listar = "view/listar.jsp";
    String add = "view/agregar.jsp";
    String edit ="view/editar.jsp";
    int IdPersona;
    Persona nuevaPersona = new Persona();
    PersonaDAO nuevaPersonaDAO = new PersonaDAO();
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acceso = "";
        String action = request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso = listar;
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;   
        }else if(action.equalsIgnoreCase("Agregar")){
            String DPI = request.getParameter("txtDPI");
            String Nombre = request.getParameter("txtNombre");
            nuevaPersona.setDpiPersona(DPI);
            nuevaPersona.setNombresPersona(Nombre);
            nuevaPersonaDAO.add(nuevaPersona);
            acceso = listar;
        }else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idPer", request.getParameter("idPersona"));
            acceso = edit;
        }else if(action.equalsIgnoreCase("Actualizar")){
            IdPersona = Integer.parseInt(request.getParameter("txtIdPersona"));
            String DPI = request.getParameter("txtDPI");
            String nombres = request.getParameter("txtNombre");
            nuevaPersona.setIdPersona(IdPersona);
            nuevaPersona.setDpiPersona(DPI);
            nuevaPersona.setNombresPersona(nombres);
            nuevaPersonaDAO.edit(nuevaPersona);
            acceso = listar;
        }else if (action.equalsIgnoreCase("eliminar")){
            IdPersona = Integer.parseInt(request.getParameter("txtIdPersona"));
            nuevaPersona.setIdPersona(IdPersona);
            nuevaPersonaDAO.eliminar(IdPersona);
            acceso = listar;
        }
        
        
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

        @Override
    public String getServletInfo() {
        return "Short description";

    }
}