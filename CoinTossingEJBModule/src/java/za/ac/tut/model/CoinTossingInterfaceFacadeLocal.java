/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model;

import javax.ejb.Local;

/**
 *
 * @author yolan
 */
@Local
public interface CoinTossingInterfaceFacadeLocal {
    
    public String generateSide();
    
    public String determineOutcome(String user, String computer);
}
