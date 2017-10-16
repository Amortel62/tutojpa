package tutojpa;


import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Modification1 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
   Salarie sal = em.find(Salarie.class, 101L);
   
        System.out.println("");
        
        sal.afficher();
        
        System.out.println("\n");
        
        em.getTransaction().begin();
        
        sal.setSalaire(1830f);
        
        em.getTransaction().commit();
        
    }
    
    
}
