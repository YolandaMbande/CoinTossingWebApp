<%-- 
    Document   : menu_options
    Created on : 01 Jul 2024, 10:08:39
    Author     : yolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Options Page</title>
    </head>
    <body>
        <%
            String name = (String)session.getAttribute("name");
            String comp = pageContext.getServletContext().getInitParameter("comp");
        %>
        <h1>User Menu</h1>
        <p>
            Hello<b><%= name%></b>, you're playing with <b><%= comp %></b>. Pick any options below:
        </p>
        
        <ul>
            <li><a href="ComputerTossServlet.do">Play Coin Tossing game.</a></li>
            <li>Get the game stats.</li>
        </ul>
    </body>
</html>
