package tutojpa;


import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Modification3 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    Salarie sal = em.find(Salarie.class, 104L);
    
    em.getTransaction().begin();
    
    em.remove(sal);
    
    em.getTransaction().commit();
        
    }
    
    
}
