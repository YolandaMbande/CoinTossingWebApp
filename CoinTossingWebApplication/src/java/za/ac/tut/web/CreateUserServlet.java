/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entity.ComputerGuess;
import za.ac.tut.entity.UserGuess;

/**
 *
 * @author yolan
 */
public class CreateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        
        initilaseSession(session, name, id);
        
        RequestDispatcher disp = request.getRequestDispatcher("menu_options.jsp");
        disp.forward(request, response);
    }

    private void initilaseSession(HttpSession session, String name, String id) {
       int gamesplayed = 0, userguesses = 0, computerguesses = 0;
       List<UserGuess> players = new ArrayList<>();
       List<ComputerGuess> computer = new ArrayList<>();
       
       session.setAttribute("name", name);
       session.setAttribute("id", id);
       session.setAttribute("gamesplayed", gamesplayed);
       session.setAttribute("userguesses", userguesses);
       session.setAttribute("computerguesses", computerguesses);
       session.setAttribute("players", players);
       session.setAttribute("computer", computer);
    }
}
