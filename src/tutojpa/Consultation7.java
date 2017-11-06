package tutojpa;


import entites.Client;
import entites.Projet;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation7 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
        Projet projet =em.find(Projet.class,"Almanac");
    
        System.out.println(" ");
        
        projet.afficher();
        
        System.out.println("\n");
        
         System.out.println(projet.getLeClient().getAdrcli());
         System.out.println(projet.getLeClient().getNomcli());
         System.out.println(projet.getLeClient().getNumcli());
           
}
}
