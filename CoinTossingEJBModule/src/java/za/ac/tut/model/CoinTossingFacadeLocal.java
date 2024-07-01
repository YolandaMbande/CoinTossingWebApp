/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.model;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.CoinTossing;

/**
 *
 * @author yolan
 */
@Local
public interface CoinTossingFacadeLocal {

    void create(CoinTossing coinTossing);

    void edit(CoinTossing coinTossing);

    void remove(CoinTossing coinTossing);

    CoinTossing find(Object id);

    List<CoinTossing> findAll();

    List<CoinTossing> findRange(int[] range);

    int count();
    
}
