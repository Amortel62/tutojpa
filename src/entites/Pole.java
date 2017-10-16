package entites;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pole implements Serializable   {
          
    @Id
    private String          codePole;
    private String          nomPole;
    
    @OneToMany(mappedBy = "lePole")
    private List<Salarie> lesSalaries = new LinkedList <Salarie>();

    public Pole() {
    }

    public Pole(String codefonct, String libfonct) {
        
        this.codePole = codefonct;
        this.nomPole = libfonct;
    }

    public void afficher(){

        System.out.print(codePole+ " ");
        System.out.print(nomPole);
    }
     
    //<editor-fold defaultstate="collapsed" desc="Getters et setters">
    
    public String getCodefonct() { return codePole; }
    public void setCodefonct(String codefonct) { this.codePole = codefonct; }
    public String getLibfonct() { return nomPole;}
    public void setLibfonct(String libfonct) { this.nomPole = libfonct; }

    public List<Salarie> getLesSalaries() {
        return lesSalaries;
    }

    public void setLesSalaries(List<Salarie> lesSalaries) {
        this.lesSalaries = lesSalaries;
    }

    public String getNomPole() {
        return nomPole;
    }

    public void setNomPole(String nomPole) {
        this.nomPole = nomPole;
    }
    
    
    //</editor-fold>

    public String getCodePole() {
        return codePole;
    }

    public void setCodePole(String codePole) {
        this.codePole = codePole;
    }
   
}


