package tutojpa;

import entites.Pole;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Modification5 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    Salarie sal = em.find(Salarie.class, 110L);
    
    Pole pole =em.find(Pole.class, "Sisr");
    
    em.getTransaction().begin();
    
    sal.setLePole(pole);
    
    em.getTransaction().commit();
    
    }
    
    
}
