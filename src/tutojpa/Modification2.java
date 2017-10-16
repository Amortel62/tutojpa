package tutojpa;

import entites.Pole;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Modification2 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    Pole pole = em.find(Pole.class, "Slam");
    
    em.getTransaction().begin();
    
    for(Salarie sal : pole.getLesSalaries()){
    
        sal.augmenter(5.0f);
    
    
    }
       em.getTransaction().commit();
    }
    
    
}
