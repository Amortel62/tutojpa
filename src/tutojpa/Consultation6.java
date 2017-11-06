package tutojpa;


import entites.Client;
import entites.Projet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation6 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
         Client client =em.find(Client.class,100L);
    
        System.out.println(" ");
        
        client.afficher();
        
        System.out.println("\n");
        
        
        for(Projet pr : client.getLesProjets()){
        
            pr.afficher();
            System.out.println();
        
        }
  
      
      
    
    
}
}
