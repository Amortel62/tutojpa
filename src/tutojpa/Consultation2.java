package tutojpa;


import entites.Pole;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation2 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    //Recherche du Pôle de code Slam et affichage du nom du Pôle et de la liste des salariés du Pôle
    
    Pole pole =em.find(Pole.class, "Slam");
    
        System.out.println("");
        
        pole.afficher();
        
        System.out.println("\n");
        
        for(Salarie sal : pole.getLesSalaries()){
        
            sal.afficher();
            System.out.println("");
        
        }
        
        System.out.println("");
        
    }
    
    
}
