/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entity.CoinTossing;

/**
 *
 * @author yolan
 */
@Stateless
public class CoinTossingFacade extends AbstractFacade<CoinTossing> implements CoinTossingFacadeLocal {

    @PersistenceContext(unitName = "CoinTossingEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoinTossingFacade() {
        super(CoinTossing.class);
    }
    
}
