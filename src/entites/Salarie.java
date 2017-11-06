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
public class Salarie implements Serializable  {

    @Id
    private Long       numsal;
    private String     nomsal;
    private String     sexe;
    private Float      salaire;
    
    @JoinColumn ( name = "CODEPOLE")
    @ManyToOne
    private Pole lePole;
    
    @OneToMany(mappedBy = "leSalarie")
    private List<Affectation> lesAffectations = new LinkedList <Affectation>();

   
    

    public Salarie() {
    }

   

    public Salarie( Long numsal, String nomsal, String sexe, Float salaire) {

        this.numsal  = numsal;
        this.nomsal  = nomsal;
        this.sexe    = sexe;
        this.salaire = salaire;
        
    }

    public void afficher(){

        System.out.print(numsal+ " ");
        System.out.print(nomsal+ " ");
        System.out.print(sexe+ " ");
        System.out.print(salaire);
    }

    public void augmenter(Float pctAug){

        salaire=salaire*(1+pctAug/100);
    }

    //<editor-fold defaultstate="collapsed" desc="Getters et setters">
    
    public String getNomsal() {
        return nomsal;
    }
    public void   setNomsal(String nomsal) {
        this.nomsal = nomsal;
    }
    public Long   getNumsal() {
        return numsal;
    }
    public void   setNumsal(Long numsal) {
        this.numsal = numsal;
    }
    public Float  getSalaire() {
        return salaire;
    }
    public void   setSalaire(Float salaire) {
        this.salaire = salaire;
    }
    public String getSexe() {
        return sexe;
    }
    public void   setSexe(String sexe) {
        this.sexe = sexe;
    }
     public Pole getLePole() {
        return lePole;
    }

    public void setLePole(Pole lePole) {
        this.lePole = lePole;
    }
     public List<Affectation> getLesAffectations() {
        return lesAffectations;
    }

    public void setLesAffectations(List<Affectation> lesAffectations) {
        this.lesAffectations = lesAffectations;
    }
    
   
    //</editor-fold>
    
}


