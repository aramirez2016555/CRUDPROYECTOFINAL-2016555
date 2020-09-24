<%-- 
    Document   : agregar
    Created on : 23/09/2020, 11:44:01 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de Agregar</title>
    </head>
    <body>
        <div>
            <h1>Agregar un Registro</h1>
            <form action="Controlador">
                DPI:<br>
                <input type="text" name="txtDPI"><br>
                Nombres:<br>
                <input type="text" name="txtNombre"><br><br>
                <input type="submit" name="accion" value="Agregar"><br>
            </form>
        </div>
    </body>
</html>
