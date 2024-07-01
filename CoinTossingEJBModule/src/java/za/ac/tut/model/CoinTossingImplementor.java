
package za.ac.tut.model;

import javax.ejb.Stateless;
/**
 *
 * @author yolan
 */
@Stateless
public class CoinTossingImplementor implements CoinTossingInterfaceFacadeLocal{

    @Override
    public String generateSide() {
        String[] sides = {"Head", "Tail"};
        int random = (int)Math.floor(Math.random()*3);
        return sides[random];
    }

    @Override
    public String determineOutcome(String user, String computer) {
        String outcome = "Lost";
            if(user.equals(computer)){
                outcome = "Won";
            }
        return outcome;
    }
    
}
