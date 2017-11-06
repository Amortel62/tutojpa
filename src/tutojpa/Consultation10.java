package tutojpa;

import entites.Affectation;
import entites.Projet;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import utilitaires.UtilDate;



public class Consultation10 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
         
     Salarie sal = em.find(Salarie.class,103L);   
     
        System.out.println(sal.getNomsal());
        System.out.println(sal.getSexe());
        System.out.println(sal.getSalaire());
        
        System.out.println(sal.getLePole().getCodePole());
        System.out.println(sal.getLePole().getNomPole());
        
      for(Affectation af : sal.getLesAffectations()){
      
          System.out.println(af.getDateaff());
          if(af.isPilote() == true){
          
              System.out.println("Pilote");
              
          }else{
          
              System.out.println("Non Pilote");
              
          }
           
            System.out.println(af.getLeProjet().getDatedep());
             System.out.println(af.getLeProjet().getDatefinp());
              System.out.println(af.getLeProjet().getDescproj());
               System.out.println(af.getLeProjet().getLeClient().getAdrcli());
                System.out.println(af.getLeProjet().getLeClient().getNomcli());
                  
      
      }
  
        
        
       
    
    
}
}
