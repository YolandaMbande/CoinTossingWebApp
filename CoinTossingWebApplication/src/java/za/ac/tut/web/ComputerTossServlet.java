/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entity.ComputerGuess;
import za.ac.tut.model.CoinTossingInterfaceFacadeLocal;


public class ComputerTossServlet extends HttpServlet {
@EJB 
        private CoinTossingInterfaceFacadeLocal ccl;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String computerguess = ccl.generateSide();
        ComputerGuess compguess = CreateCumputerGuess(computerguess);
        
        session.setAttribute("compguess", compguess);
        
        RequestDispatcher disp = request.getRequestDispatcher("user_guess_form.jsp");
        disp.forward(request, response);
    }

    private ComputerGuess CreateCumputerGuess(String computerguess) {
       ComputerGuess cc= new ComputerGuess();
       cc.setComputerguess(computerguess);
       return cc;
    }
}
