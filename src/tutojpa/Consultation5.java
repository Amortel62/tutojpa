package tutojpa;


import entites.Pole;
import entites.Salarie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation5 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
        System.out.println("");
        
        List<Pole> lesPoles = em.createQuery("Select pole from Pole pole").getResultList();
        
        for(Pole p : lesPoles){
        
            p.afficher(); System.out.println("\n");
            
            for(Salarie sal : p.getLesSalaries()){
            
                System.out.print(" ");
                sal.afficher();
                System.out.println(" ");
            
            
            }
        
            System.out.println(" ");
            
        }
        
        System.out.println("");
        
    }
    
    
}
