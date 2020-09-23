<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Página de listar</title>
    </head>
    <body>
        <div class="container">  
        
            <h1 class="text-center">Personas</h1>
            <a class="btn btn-success" href ="Controlador?accion=add">Agregar</a><br><br>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <td class="text-center text-primary"><strong>ID PERSONA</strong></td>
                    <td class="text-center text-primary"><strong>DPI</strong></td>
                    <td class="text-center text-primary"><strong>NOMBRES</strong></td>
                    <td class="text-center text-primary"><strong>ACCIONES</strong></td>
                </tr>
            </thead>
            <% 
                PersonaDAO dao = new PersonaDAO() ;
                List<Persona> listaPersona = dao.listar();
                Iterator<Persona> iterator = listaPersona.iterator();
                Persona per = null;
                while (iterator.hasNext()){
                    per = iterator.next();
                
                %>
            <tbody>
                <tr>
                    <td class="text-center active"><%=per.getIdPersona()%></td>
                    <td class="text-center "><%=per.getDpiPersona()%></td>
                    <td class="text-center active"><%=per.getNombresPersona()%></td>
                    <td class="text-center">
                        <a class="btn btn-warning" href="Controlador?accion=editar&idPersona=<%= per.getIdPersona()%>">Edit</a>
                        <a class="btn btn-danger"href="Controlador?accion=eliminar&idPersona=<%= per.getIdPersona()%>">Remove</a>
                        
                    </td>
                   
                </tr>
                <%}%>
            </tbody>
        </table>
        </div>
    </body>
</html>
