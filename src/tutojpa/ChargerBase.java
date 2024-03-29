
package tutojpa;

import entites.Projet;
import entites.Client;
import entites.Pole;
import entites.Salarie;
import entites.Affectation;
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
      
      Salarie  s1=new Salarie(101L,"Dupont Pierre","M", 1750F);       
      Salarie  s2=new Salarie(102L,"Martin Sophie","F", 1900F);
      Salarie  s3=new Salarie(103L,"Deruelle Marc","M", 1655F);
      Salarie  s4=new Salarie(104L,"Leleu Anne"   ,"F", 1900F);
          
      
      Client cl1 = new Client(100L,"20 rue de L'Eglise","Yoan Wache");
      Client cl2 = new Client(101L,"52 rue d'Arras","Bastien Ambar");
      Client cl3 = new Client(102L,"20 rue du Calvaire","Pierre Delayen");
      Client cl4 = new Client(103L,"18 rue du général Faidherbe","Franck Faidherbe");
      Client cl5 = new Client(104L,"2 rue de Péronne","Alexis Plomion");
     
      
      Projet pr1 = new Projet("Almanac",5000f,UtilDate.parse("23/10/2017"),"Gros projet",UtilDate.parse("01/10/2017"));
      Projet pr2 = new Projet("Extinction",15000f,UtilDate.parse("27/11/2017"),"Enorme projet",UtilDate.parse("05/10/2017"));
      Projet pr3 = new Projet("Destruction",20000f,UtilDate.parse("28/11/2017"),"Enorme projet",UtilDate.parse("10/12/2017"));
      Projet pr4 = new Projet("Creation",30000f,UtilDate.parse("29/11/2017"),"Enorme projet",UtilDate.parse("10/10/2017"));
      Projet pr5 = new Projet("Savoir",10000f,UtilDate.parse("27/09/2017"),"Enorme projet",UtilDate.parse("03/10/2017"));
      Projet pr6 = new Projet("Fulmination",100000f,UtilDate.parse("27/08/2017"),"Enorme projet",UtilDate.parse("01/11/2017"));
      
      Affectation a1 = new Affectation(UtilDate.parse("23/10/2017"),true,pr1,s4);
      Affectation a2 = new Affectation(UtilDate.parse("27/11/2017"),true,pr2,s1);
      Affectation a3 = new Affectation(UtilDate.parse("28/11/2017"),true,pr3,s2);
      Affectation a4 = new Affectation(UtilDate.parse("29/11/2017"),true,pr4,s3);
      Affectation a5 = new Affectation(UtilDate.parse("27/09/2017"),true,pr5,s2);
      Affectation a6 = new Affectation(UtilDate.parse("27/08/2017"),true,pr6,s4);
      
      
      pr1.setLeClient(cl1);
      pr2.setLeClient(cl1);
      pr3.setLeClient(cl2);
      pr4.setLeClient(cl3);
      pr5.setLeClient(cl4);
      pr6.setLeClient(cl5);

      s1.setLePole(pl1);
      s2.setLePole(pl1);
      s3.setLePole(pl2);
      s4.setLePole(pl2);
      
        
      em.getTransaction().begin(); 
        
        em.persist(pl1);em.persist(pl2);
  
        em.persist(s1);em.persist(s2);
        em.persist(s3);em.persist(s4);
        
         em.persist(cl1);em.persist(cl2);
         em.persist(cl3);em.persist(cl4);
         em.persist(cl5);
        
     em.persist(pr1);em.persist(pr2);
     em.persist(pr3);em.persist(pr4);
     em.persist(pr5);em.persist(pr6);
     
     em.persist(a1);em.persist(a2);
     em.persist(a3);em.persist(a4);
     em.persist(a5);em.persist(a6);
       

        
      em.getTransaction().commit();    
        
        
    }    
}
