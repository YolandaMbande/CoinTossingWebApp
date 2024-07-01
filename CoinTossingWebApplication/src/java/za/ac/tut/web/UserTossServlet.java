package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.entity.ComputerGuess;
import za.ac.tut.entity.UserGuess;
import za.ac.tut.model.CoinTossingInterfaceFacadeLocal;


public class UserTossServlet extends HttpServlet {
@EJB CoinTossingInterfaceFacadeLocal ccl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String choice = request.getParameter("choice");
        UserGuess userguess = createUserGuess(choice);
        ComputerGuess compguess = (ComputerGuess)session.getAttribute("compguess");
        
        String outcome = ccl.determineOutcome(userguess.getUserguess(), compguess.getComputerguess());
        
        useSession(session, outcome, userguess, compguess);
        
        session.setAttribute("userguess", userguess);
        
        RequestDispatcher disp = request.getRequestDispatcher("game_round_outcome.jsp");
        disp.forward(request, response);
    }

    private UserGuess createUserGuess(String choice) {
       UserGuess ug = new UserGuess();
       ug.setUserguess(choice);
       return ug;
    }

    private void useSession(HttpSession session, String outcome, UserGuess userguess, ComputerGuess compguess) {
       
       if(outcome.equals("Lost")){
           int computerguesses = (int)session.getAttribute("computerguesses");
           computerguesses++;
           session.setAttribute("computerguesses", computerguesses);
           outcome = "Player has lost.";
       }else{
           int userguesses = (int)session.getAttribute("userguesses");
           userguesses++;
           session.setAttribute("userguesses", userguesses);
           outcome = "Player has won.";
       }
       
       session.setAttribute("outcome", outcome);
       int gamesplayed = (int)session.getAttribute("gamesplayed");
       gamesplayed++;
       session.setAttribute("gamesplayed", gamesplayed);
       
       List<UserGuess> players = (List<UserGuess>)session.getAttribute("players");
       players.add(userguess);
       session.setAttribute("players", players);
       
       List<ComputerGuess> computer = (List<ComputerGuess>)session.getAttribute("computer");
       computer.add(compguess);
       session.setAttribute("computer", computer);
    }
}
