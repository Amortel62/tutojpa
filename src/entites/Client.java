package entites;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {
    
    @Id
    private Long           numcli;
    private String        nomcli;
    private String        adrcli;

    
    
    @JoinColumn(name="CODEPROJ")
    @ManyToOne
    private Projet leProjet;
    
     public Client() {
    }

  public Client(Long numcli, String adrcli, String nomcli) {
        
        this.nomcli = nomcli;
        this.numcli = numcli;
        this.adrcli = adrcli;

    }
  
   public void afficher(){

        System.out.print(numcli+ " ");
        System.out.print(nomcli);
        System.out.print(adrcli);
    }
    
    public String getAdrcli() {
        return adrcli;
    }
    public void setAdrcli(String adrcli) {
        this.adrcli = adrcli;
    }
    public String getNomcli() {
        return nomcli;
    }
    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }
    public Long getNumcli() {
        return numcli;
    }
    public void setNumcli(Long numcli) {
        this.numcli = numcli;
    }

    public Projet getLeProjet() {
        return leProjet;
    }

    public void setLeProjet(Projet leProjet) {
        this.leProjet = leProjet;
    }

   
     
}