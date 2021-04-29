<%-- 
    Document   : login
    Created on : 29-abr-2021, 20:16:51
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:plugin type="applet" archive="OngWeb.jar" code="Login.class" width="500" height="400">
            <jsp:fallback>
                <p>No carga :(</p>
            </jsp:fallback>
        </jsp:plugin>
    </body>
</html>
