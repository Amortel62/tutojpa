package tutojpa;


import entites.Pole;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation1 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    //Recherche du Pôle de code Slam et affichage
    
    Pole pole =em.find(Pole.class, "Slam");
    
        System.out.println("");
        
        pole.afficher();
        
        System.out.println("\n");
        
    }
    
    
}
