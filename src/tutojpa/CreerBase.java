
package tutojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CreerBase {

    public static void main(String[] args) {
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager        em  = emf.createEntityManager();
        
    }
}


