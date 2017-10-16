package entites;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {
    
    @Id
    private Long           numcli;
    private String        nomcli;
    private String        adrcli;

    @OneToMany(mappedBy = "leClient")
    private List<Projet> lesProjets = new LinkedList <Projet>();
    
     public Client() {
    }

  public Client(Long numcli, String adrcli, String nomcli) {
        
        this.nomcli = nomcli;
        this.numcli = numcli;
        this.adrcli = adrcli;

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

    public List<Projet> getLesProjets() {
        return lesProjets;
    }

    public void setLesProjets(List<Projet> lesProjets) {
        this.lesProjets = lesProjets;
    }
     
}