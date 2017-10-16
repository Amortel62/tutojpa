package tutojpa;

import entites.Pole;
import entites.Salarie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Modification4 {
    
    public static void main(String[] args){
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager         em = emf.createEntityManager();
    
    Pole pole1 = em.find(Pole.class, "Slam");
    Salarie sal1 =new Salarie(110L,"Legrain Daniel", "M", 1814f);
    
    sal1.setLePole(pole1);
    
    
    Pole pole2 = em.find(Pole.class, "Sisr");
    Salarie sal2 =new Salarie(120L,"Duchemin Léa", "F", 1814f);
    
    sal2.setLePole(pole2);
    
    em.getTransaction().begin();
    
    em.persist(sal1); em.persist(sal2);
    
    em.getTransaction().commit();
    }
    
    
}
