package br.rodrigo.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAController {
    
    private static final EntityManagerFactory EMF;
    
    static {
        EMF = Persistence.createEntityManagerFactory("TesteBlueGearsPU");
    }
    
    public static EntityManager getEntityManager(){
        return EMF.createEntityManager();
    }
    
    public static void close(){
        EMF.close();
    }
    
}
