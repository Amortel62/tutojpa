
package tutojpa;

import entites.Projet;
import entites.Client;
import entites.Pole;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import utilitaires.UtilDate;

public class ChargerBase {

    public static void main(String[] args) {
       
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
      EntityManager        em  = emf.createEntityManager();
                
      Pole pl1=new Pole("Slam","Solutions Logicielles et Applications Métier");
      Pole pl2=new Pole("Sisr","Solutions d'Infrastructures Systèmes et Réseaux");
      
      Client cl1 = new Client(100L,"20 rue de L'Eglise","Yoan Wache");
      Client cl2 = new Client(101L,"52 rue d'Arras","Bastien Ambar");
      Client cl3 = new Client(102L,"20 rue du Calvaire","Pierre Delayen");
      Client cl4 = new Client(103L,"18 rue du général Faidherbe","Franck Faidherbe");
      Client cl5 = new Client(104L,"2 rue de Péronne","Alexis Plomion");
      //A FINIR PLUS LE SET PROJET ;)
      
      Projet pr1 = new Projet("Almanac",5000f,UtilDate.parse("23/10/2017"),"Gros projet",UtilDate.parse("01/10/2017"));
      Projet pr2 = new Projet("Extinction",15000f,UtilDate.parse("27/11/2017"),"Enorme projet",UtilDate.parse("01/10/2017"));
      
      cl1.setLeProjet(pr1);
      cl2.setLeProjet(pr2);
      cl3.setLeProjet(pr2);
      cl4.setLeProjet(pr1);
      cl5.setLeProjet(pr2);
      
      
        
      Salarie  s1=new Salarie(101L,"Dupont Pierre","M", 1750F);       
      Salarie  s2=new Salarie(102L,"Martin Sophie","F", 1900F);
      Salarie  s3=new Salarie(103L,"Deruelle Marc","M", 1655F);
      Salarie  s4=new Salarie(104L,"Leleu Anne"   ,"F", 1900F);
          
      s1.setLePole(pl1);
      s2.setLePole(pl1);
      s3.setLePole(pl2);
      s4.setLePole(pl2);
        
      em.getTransaction().begin(); 
        
        em.persist(pl1);em.persist(pl2);
  
        em.persist(s1);em.persist(s2);
        em.persist(s3);em.persist(s4);
        
         em.persist(pr1);em.persist(pr2);
        
        em.persist(cl1);em.persist(cl2);
        em.persist(cl3);em.persist(cl4);
        em.persist(cl5);
        
       

        
      em.getTransaction().commit();    
        
        
    }    
}
