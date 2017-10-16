
package entites;

import java.util.*;

public class Projet  {
    
    private String      codeproj;
    private Date        datedep;
    private Date        datefinp;
    private String      descproj;
    private Float       montantdevis;

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



}
