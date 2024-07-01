<%-- 
    Document   : game_round_outcome
    Created on : 01 Jul 2024, 10:37:41
    Author     : yolan
--%>

<%@page import="za.ac.tut.entity.UserGuess"%>
<%@page import="za.ac.tut.entity.ComputerGuess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game Outcome Page</title>
    </head>
    <body>
        <%
            String comp = pageContext.getServletContext().getInitParameter("comp");
            String name  = (String)session.getAttribute("name");
            ComputerGuess c_guess = (ComputerGuess)session.getAttribute("compguess");
            UserGuess u_guess = (UserGuess)session.getAttribute("userguess");
            String uu = u_guess.getUserguess();
            String cc = c_guess.getComputerguess();
            String outcome = (String)session.getAttribute("outcome");
        %>
        <h1>Outcome!</h1>
        <p>
            Here are this rounds outcomes:
        </p>
        <table>
            <tr>
                <td><%=comp%> :</td>
                <td><%= uu%></td>
            </tr>
            <tr>
                <td><%=name%> :</td>
                <td><%=cc%></td>
            </tr>
            <tr>
                <td>Outcome :</td>
                <td><%= outcome %></td>
            </tr>
        </table>
            <p>
                Please one of the following:
            </p>
            <ol>
                <li><a href="user_guess_form.jsp">Play again.</a></li>
                <li><a href="index.html">Go to main menu.</a></li>
                <li><a href="StoreInDatabaseServlet.do">Send data to database.</a></li>
            </ol>
    </body>
</html>
