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
     
         if("M".equals(sal.getSexe())){
          
              System.out.print("Monsieur ");
              
          }else{
          
              System.out.print("Madame ");
              
          }
     
        System.out.println(sal.getNomsal());        
        System.out.println("Salaire : "+sal.getSalaire()+ "€");
        System.out.println("Pole : "+sal.getLePole().getCodePole());
        System.out.println(sal.getLePole().getNomPole());
        
      for(Affectation af : sal.getLesAffectations()){
      
          System.out.println(UtilDate.format(af.getDateaff()));
          if(af.isPilote() == true){
          
              System.out.println("Pilote du projet");
              
          }else{
          
              System.out.println("Non Pilote du projet");
              
          }
           
            System.out.println("Date début : "+UtilDate.format(af.getLeProjet().getDatedep()));
            System.out.println("Date fin : "+UtilDate.format(af.getLeProjet().getDatefinp()));
            System.out.println("Description du projet : "+af.getLeProjet().getDescproj());
            System.out.println("Adresse du client : "+af.getLeProjet().getLeClient().getAdrcli());
            System.out.println("Nom du client : "+af.getLeProjet().getLeClient().getNomcli());
                  
      
      }
  
        
        
       
    
    
}
}
