/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entity.CoinTossing;
import za.ac.tut.entity.ComputerGuess;
import za.ac.tut.entity.UserGuess;
import za.ac.tut.model.CoinTossingFacadeLocal;

/**
 *
 * @author yolan
 */
public class StoreInDatabaseServlet extends HttpServlet {
@EJB CoinTossingFacadeLocal ccl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<ComputerGuess> computer = (List<ComputerGuess>)session.getAttribute("computer");
        List<UserGuess> players = (List<UserGuess>)session.getAttribute("players");
        
        int gamesplayed = (int)session.getAttribute("gamesplayed");
        int userguesses = (int)session.getAttribute("userguesses");
        int computerguesses = (int)session.getAttribute("computerguesses");
        
        String name = (String)session.getAttribute("name");
        String id = (String)session.getAttribute("id");
        
        CoinTossing ct = createGame(computer, players, gamesplayed, userguesses, computerguesses, name, id);
        ccl.create(ct);
        
        RequestDispatcher disp = request.getRequestDispatcher("data_stored_outcome.jsp");
        disp.forward(request, response);
    }

    private CoinTossing createGame(List<ComputerGuess> computer, List<UserGuess> players, int gamesplayed, int userguesses, int computerguesses, String name, String id) {
       CoinTossing ct = new CoinTossing();
       ct.setComputerScore(computerguesses);
       ct.setGamesplayed(gamesplayed);
       ct.setUserguess(players);
       ct.setUserScore(userguesses);
       ct.setUsername(name);
       ct.setUserid(id);
       ct.setComputerguess(computer);
       return ct;
    }
}
