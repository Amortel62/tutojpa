package tutojpa;


import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation3 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    //Recherche du Salarie de numero 103, affichage de ses informations et du Pôle auquel il appartient
    
    
        System.out.println("");
        
        Salarie sal = em.find(Salarie.class, 103L);
        
        sal.afficher();
        
        System.out.println("\n");
        
        System.out.println(sal.getLePole().getCodePole()+"  ");
        
        System.out.println(sal.getLePole().getNomPole());
        
        System.out.println("");
    }
    
    
}
