package tutojpa;


import entites.Client;
import entites.Projet;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation8 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
         List<Client> lesClients = em.createQuery("Select cl From Client cl").getResultList();
        
         for(Client cl : lesClients){
        
            cl.afficher();
            for(Projet pr : cl.getLesProjets()){
        
            pr.afficher();
            System.out.println();
        
        }
            
           
  
        
        
        }
        
        System.out.println("");
    
    
}
}
