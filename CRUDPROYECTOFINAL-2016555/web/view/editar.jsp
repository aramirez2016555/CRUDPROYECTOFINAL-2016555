<%-- 
    Document   : editar
    Created on : 23/09/2020, 11:25:34 PM
    Author     : Fernando
--%>

<%@page import="Modelo.Persona"%>
<%@page import="modeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <div>
<div class="container">
            <div class="col-lg-5">
            </div>
        </div>
        <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Vista de Editar</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-5">
                <% 
                    PersonaDAO nuevaPersonaDao = new PersonaDAO();
                    int idPersona = Integer.parseInt((String)request.getAttribute("idPer"));
                    Persona nuevaPersona = (Persona)nuevaPersonaDao.list(idPersona);
                %>
                <h1>Modificar Persona</h1>
                <form action="Controlador">
                    <strong> DPI: </strong><br>
                    <input class="form-control" type="text" name="txtDPI" value="<%= nuevaPersona.getDpiPersona() %>"><br>
                    <strong> Nombres: </strong><br>
                    <input class="form-control" type="text" name="txtNombre" value="<%= nuevaPersona.getNombresPersona() %>"><br><br>
                    <input type="hidden" name="txtIdPersona" value="<%= nuevaPersona.getIdPersona() %>">
                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>
                </form>
            </div>
        </div>
    </body>
</html>
    </body>
</html>
