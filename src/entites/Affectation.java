package entites;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Affectation implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long        id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date        dateaff;
    private boolean     pilote;
    
    @JoinColumn ( name = "NUMSAL")
    @ManyToOne
    private Salarie leSalarie;
    
    @JoinColumn ( name = "CODEPROJ")
    @ManyToOne
    private Projet leProjet;

    public Affectation(){

}
    public Affectation(Date dateaff, boolean pilote,Projet proj, Salarie sal){
        
        this.dateaff = dateaff;
        this.pilote = pilote;
        this.leProjet = proj;
        this.leSalarie = sal;
    }
    
    
    public Date getDateaff() {
        return dateaff;
    }
    public void setDateaff(Date dateaff) {
        this.dateaff = dateaff;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Salarie getLeSalarie() {
        return leSalarie;
    }

    public void setLeSalarie(Salarie leSalarie) {
        this.leSalarie = leSalarie;
    }

    public Projet getLeProjet() {
        return leProjet;
    }

    public void setLeProjet(Projet leProjet) {
        this.leProjet = leProjet;
    }
    public boolean isPilote() {
        return pilote;
    }
    public void setPilote(boolean pilote) {
        this.pilote = pilote;
    }
  
}
