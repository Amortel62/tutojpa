package tutojpa;


import entites.Salarie;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation4 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    //Affichage de tous les salariés et du Pôle auquel ils appartiennent
    
    
        System.out.println("");
        
        List<Salarie> lesSalaries = em.createQuery("Select sal From Salarie sal").getResultList();
        
        for(Salarie sal : lesSalaries){
        
            sal.afficher();
            
            System.out.print(" "+sal.getLePole().getCodePole()+"  ");
            System.out.println(sal.getLePole().getNomPole());
        
        
        }
        
        System.out.println("");
        
    }
    
    
}
