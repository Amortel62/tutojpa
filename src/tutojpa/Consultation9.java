package tutojpa;

import entites.Affectation;
import entites.Projet;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Consultation9 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
         
     Projet projet = em.find(Projet.class,"Almanac");   
     
        System.out.println(projet.getCodeproj());
        System.out.println(projet.getDatedep());
        System.out.println(projet.getDatefinp());
        System.out.println(projet.getLeClient().getNomcli());
        System.out.println(projet.getLeClient().getAdrcli());
        
      for(Affectation af : projet.getLesAffectations()){
      
          System.out.println(af.getLeSalarie().getNomsal());
          System.out.println(af.getDateaff());
          System.out.println(af.isPilote());
          System.out.println(af.getLeSalarie().getLePole().getNomPole());
          
                  
      
      }
  
        
        
       
    
    
}
}
