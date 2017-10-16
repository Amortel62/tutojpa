
package tutojpa;

import entites.Pole;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
          
      s1.setLePole(pl1);
      s2.setLePole(pl1);
      s3.setLePole(pl2);
      s4.setLePole(pl2);
        
      em.getTransaction().begin(); 
        
        em.persist(pl1);em.persist(pl2);
  
        em.persist(s1);em.persist(s2);
        em.persist(s3);em.persist(s4);
        
      em.getTransaction().commit();    
        
        
    }    
}
