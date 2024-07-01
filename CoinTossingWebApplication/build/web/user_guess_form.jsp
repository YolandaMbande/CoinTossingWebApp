<%-- 
    Document   : user_guess_form
    Created on : 01 Jul 2024, 10:17:40
    Author     : yolan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Guess Form Page</title>
    </head>
    <body>
        <h1>Player Guess Form</h1>
        <%
            String comp = pageContext.getServletContext().getInitParameter("comp");
        %>
        <p>
            <b><%= comp %></b> has already generated a guess, pick yours:
        </p>
        <form action="UserTossServlet.do" method="POST">
            <table>
                <tr>
                    <td>Pick Your Toss :</td>
                    <td>
                        <select name="choice">
                            <option>Options..</option>
                            <option value="Head">Head</option>
                            <option value="Tail">Tail</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="TOSS"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
