
package entites;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
@Entity

public class Projet implements Serializable  {
    
    @Id
    private String      codeproj;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date        datedep;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date        datefinp;
    private String      descproj;
    private Float       montantdevis;

    
    @JoinColumn(name="NUMCLI")
    @ManyToOne
    private Client leClient;
    
    @OneToMany(mappedBy = "leProjet")
    private List<Affectation> lesAffectations = new LinkedList <Affectation>();
       
     public Projet() {
    }
     
      public Projet(String codeproj, Float montantdevis, Date datefinp, String descproj, Date datedep) {
        
        this.codeproj = codeproj;
        this.montantdevis = montantdevis;
        this.datefinp =datefinp;
        this.datedep =datedep;
        this.descproj = descproj;
           

    }
       public void afficher(){

        System.out.print(codeproj+ " ");
        System.out.println(montantdevis+ " ");
        System.out.println(datedep+ " ");
        System.out.println(datefinp+ " ");
        System.out.print(descproj);
        
    }
       
     //<editor-fold defaultstate="collapsed" desc="Getters et setters">
    public String getCodeproj() {
        return codeproj;
    }
    public void setCodeproj(String codeproj) {
        this.codeproj = codeproj;
    }
    public Date getDatedep() {
        return datedep;
    }
    public void setDatedep(Date datedep) {
        this.datedep = datedep;
    }
    public Date getDatefinp() {
        return datefinp;
    }
    public void setDatefinp(Date datefinp) {
        this.datefinp = datefinp;
    }
    public String getDescproj() {
        return descproj;
    }
    public void setDescproj(String descproj) {
        this.descproj = descproj;
    }
    public Float getMontantdevis() {
        return montantdevis;
    }
    public void setMontantdevis(Float montantdevis) {
        this.montantdevis = montantdevis;
    }

    public Client getLeClient() {
        return leClient;
    }

    public void setLeClient(Client leClient) {
        this.leClient = leClient;
    }

    public List<Affectation> getLesAffectations() {
        return lesAffectations;
    }

    public void setLesAffectations(List<Affectation> lesAffectations) {
        this.lesAffectations = lesAffectations;
    }

    
//</editor-fold>
   



}
